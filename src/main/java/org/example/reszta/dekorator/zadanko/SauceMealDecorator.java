package org.example.reszta.dekorator.zadanko;

public class SauceMealDecorator extends MealDecorator{

    public SauceMealDecorator(Meal meal) {
        super(meal);
    }

    @Override
    public void prepareMeal() {
        meal.prepareMeal();
        addSauces();
    }

    private void addSauces() {
        System.out.println("Dodaje sos do dania");
    }
}
