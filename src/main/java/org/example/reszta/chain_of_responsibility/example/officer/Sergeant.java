package org.example.reszta.chain_of_responsibility.example.officer;

import org.example.reszta.chain_of_responsibility.example.message.Message;

public class Sergeant extends Officer{

    private static final int CODE = 10;
    private static final String NAME = "Sierzant Kowalski";

    @Override
    public void proccessMessage(Message message) {
        if(message.getOfficerRank().equals(OfficerRank.SERGEANT) && message.getCode() == CODE) {
            System.out.println(NAME + " otrzymał wiadomość " + message.getContent());
        } else {
            getSupertiorOfficer().proccessMessage(message);
        }
    }
}
