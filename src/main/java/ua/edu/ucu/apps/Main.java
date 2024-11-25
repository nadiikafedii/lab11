package ua.edu.ucu.apps;

// import java.util.List;

import ua.edu.ucu.apps.task2.Client;
import ua.edu.ucu.apps.task2.BirthdayMailCode;
import ua.edu.ucu.apps.task2.MailCode;
import ua.edu.ucu.apps.task2.MailInfo;
import ua.edu.ucu.apps.task2.MailSender;

public class Main {
    public static void main(String[] args) {


        Client client = Client.builder()
            .name("Nadiika Fediika")
            .age(18)
            .email("nadiika@gmail.com")
            .build();

        MailCode mailCode = new BirthdayMailCode();
        MailInfo mailInfo = new MailInfo(client, mailCode);
            // client1 -> "It is just random1");
        MailSender mailSender = new MailSender();
        mailSender.sendMail(mailInfo);

    }
}
