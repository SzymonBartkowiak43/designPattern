package org.example.reszta.chain_of_responsibility.example.officer;

import org.example.reszta.chain_of_responsibility.example.message.Message;

public class Captain extends Officer{

    private static final int CODE = 50;
    private static final String NAME = "Kapitan rokoko";

    @Override
    public void proccessMessage(Message message) {
        if(message.getOfficerRank().equals(OfficerRank.CAPTAIN) && message.getCode() == CODE) {
            System.out.println(NAME + " otrzymał wiadomość " + message.getContent());
        } else {
            getSupertiorOfficer().proccessMessage(message);
        }
    }
}
