package org.example.reszta.chain_of_responsibility.task;

public class Antek extends Child {
    @Override
    public void processRequest(MotherRequest motherRequest) {
        if (motherRequest.getShelf().equals(Shelf.HIGH)) {
            System.out.println("Antek zdjął słoik z półki!");
        } else {
            System.out.println("Nikt nie da rady");
        }
    }
}
