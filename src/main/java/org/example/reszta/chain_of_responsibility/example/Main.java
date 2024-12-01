package org.example.reszta.chain_of_responsibility.example;

import org.example.reszta.chain_of_responsibility.example.message.Message;
import org.example.reszta.chain_of_responsibility.example.officer.*;

public class Main {

    public static void main(String[] args) {
        Message atakowac = new Message("atakowac", 1010, OfficerRank.GENERAL);

        Officer sergeant = new Sergeant();
        Officer captain = new Captain();
        Officer general = new General();

        sergeant.setSupertiorOfficer(captain);
        captain.setSupertiorOfficer(general);

        sergeant.proccessMessage(atakowac);



    }
}
