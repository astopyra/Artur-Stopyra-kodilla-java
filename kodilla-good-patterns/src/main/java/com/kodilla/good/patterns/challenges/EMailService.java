package com.kodilla.good.patterns.challenges;

public class EMailService implements InformationService {
    @Override
    public void inform(Client client) {
        System.out.println("Sending email to: " + client.getEmailAddress() + " to confirm order");
    }
}
