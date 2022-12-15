package com.kodilla.good.patterns.food2door;


public class EMailService implements InformationService {
    @Override
    public void inform() {
        System.out.println("Sending email to confirm order");
    }
}
