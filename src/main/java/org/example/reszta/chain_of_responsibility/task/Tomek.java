package org.example.reszta.chain_of_responsibility.task;

public class Tomek extends Child{

    @Override
    public void processRequest(MotherRequest motherRequest) {
        if (motherRequest.getShelf().equals(Shelf.MEDIUM)) {
            System.out.println("Tomek zdjęł słoik z półki!");
        } else {
            getTallerChild().processRequest(motherRequest);
        }
    }
}
