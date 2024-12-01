package org.example.reszta.chain_of_responsibility.example.officer;

import org.example.reszta.chain_of_responsibility.example.message.Message;

public class General extends Officer {
    private static final int CODE = 100;
    private static final String NAME = "Generał Zabielski";

    @Override
    public void proccessMessage(Message message) {
        if (message.getOfficerRank().equals(OfficerRank.GENERAL) && message.getCode() == CODE) {
            System.out.println(NAME + " otrzymał wiadomość " + message.getContent());
        } else {
            System.out.println("Zly adresat wiadomosci lub zly kod ;/");
        }
    }
}