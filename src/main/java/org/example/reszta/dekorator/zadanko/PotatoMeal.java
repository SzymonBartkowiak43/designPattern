package org.example.reszta.dekorator.zadanko;

public class PotatoMeal extends Meal{

    @Override
    public void prepareMeal() {
        System.out.println("Przygotowuję danie na bazie ziemniaków.");
    }
}
