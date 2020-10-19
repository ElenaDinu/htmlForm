package ro.elena.surveyapp1.view;


import javax.mail.*;
import javax.mail.internet.InternetAddress;

import javax.mail.internet.MimeMessage;

import java.util.Properties;

public class email{



    public static void main(String[] args) {

        final String username = "survey.application2020@gmail.com";
        final String password = "acsorbhatmgdxdpu";

        Properties prop = new Properties();
        prop.put("mail.smtp.host", "smtp.gmail.com");
        prop.put("mail.smtp.port", "587");
        prop.put("mail.smtp.auth", "true");
        prop.put("mail.smtp.starttls.enable", "true"); //TLS

        Session session = Session.getInstance(prop,
                new javax.mail.Authenticator() {
                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication (username, password);
                    }
                });

        try {


            // creare obiect.
            Message message = new MimeMessage (session);

            // setare adresa expeditor
            message.setFrom(new InternetAddress ("survey.application2020@gmail.com"));

            // setare adresa destinatar

            // setare adresa destinatar
            message.setRecipients(Message.RecipientType.TO,
                    InternetAddress.parse("elena.dinu24@yahoo.com"));


            // Setare titlu mesaj
            message.setSubject ("Chestionar survey");

            // creare mesaj
            //BodyPart messageBodyPart = new MimeBodyPart ();

            // Setare mesaj email
            String url="https://elenadinu.github.io/htmlForm/";
            String content="<a href='"+url+"'>"+url+"</a>";


            message.setContent ("Stimata/e Doamna/Domnule "  + "\n" +
                    "\n"+
                    "\n"+
                    "<br>"+
                    "<br>"+
                    "Va multumim ca ati ales serviciile companiei noastre.\n" +
                    "<br>"+
                    "<br>"+
                    "Avand in vedere ultima solicitare efectuata de dumneavoastra, din dorinta de a perfectiona si adapta serviciile noastre la exigentele dumneavoastra, va rugam sa alocati cateva minute completarii chestionarului din link-ul de mai jos.\n" +
                    "\n" +
                    "<br>"+
                    "<br>"+
                    "link: "+content+
                    "\n" +
                    "<br>"+
                    "<br>"+
                    "Va asiguram ca informatiile pe care ni le oferiti sunt confidentiale si vor fi utilizate numai pentru imbunatatirea serviciilor noastre.\n" +
                    "\n"+
                    "<br>"+
                    "<br>"+
                    "Cu stima,\n" +
                    "<br>"+
                    "E D\n","text/html; charset=utf-8");

            // creare mesaj partajat
          /*Multipart multipart = new MimeMultipart ();

          // Setare text mesaj
          multipart.addBodyPart (messageBodyPart);

          // Setare atasament
          messageBodyPart = new MimeBodyPart ();
          String filename = "E:\\Back-up\\Desktop\\Java 1\\versiune2\\src\\main\\resources\\ChestionarSatisfactieClient.html";
          DataSource source = new FileDataSource (filename);
          messageBodyPart.setDataHandler (new DataHandler (source));
          messageBodyPart.setFileName (filename);
          multipart.addBodyPart (messageBodyPart);


          // Transmitere continut mesaj
          message.setContent (multipart);*/
            // Transmitere mesaj
            Transport.send (message);

            System.out.println ("?");
        } catch (MessagingException e) {
            e.printStackTrace ();
        }

    }


}
