package org.example.reszta.chain_of_responsibility.example.officer;

import org.example.reszta.chain_of_responsibility.example.message.Message;

public abstract class Officer {



    private Officer supertiorOfficer;

    public abstract void proccessMessage(Message message);

    public void setSupertiorOfficer(Officer supertiorOfficer) {
        this.supertiorOfficer = supertiorOfficer;
    }
    public Officer getSupertiorOfficer() {
        return supertiorOfficer;
    }

}
