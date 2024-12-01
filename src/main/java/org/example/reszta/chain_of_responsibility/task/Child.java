package org.example.reszta.chain_of_responsibility.task;

public abstract class Child {
    private Child tallerChild;

    public abstract void processRequest(MotherRequest motherRequest);

    public Child getTallerChild() {
        return this.tallerChild;
    }

    public void setTallerChild(Child child) {
        this.tallerChild = child;
    }
}
