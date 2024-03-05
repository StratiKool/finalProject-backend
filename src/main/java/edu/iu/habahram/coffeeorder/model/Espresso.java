package edu.iu.habahram.coffeeorder.model;

public class Espresso extends Beverage{

    @Override
    public String getDescription() {
        return "Espresso with ";
    }
    @Override
    public float cost() {
        return 1.34F;
    }

}
