package com.example.appfour;

public class Cat extends Animal{

    private final int numberOfLegs;
    private boolean canHuntOtherAnimals;

    public Cat(String name, String color, int amountOfSpeed, int amountOfPower, int numberOfLegs, boolean canHuntOtherAnimals) {

        super(name, color, amountOfSpeed, amountOfPower);

        this.numberOfLegs = numberOfLegs;
        this.canHuntOtherAnimals = canHuntOtherAnimals;
    }

     public int getNumberOfLegs() {
        return numberOfLegs;
    }

    public boolean getCanHuntOtherAnimals() {
        return canHuntOtherAnimals;
    }

    public void setCanHuntOtherAnimals(boolean canHuntOtherAnimals) {
        this.canHuntOtherAnimals = canHuntOtherAnimals;
    }
//    This if for using if the Super class has protected modifier instead of private - Prefer Getters/Setters in real coding
//    public String outputSomeValuesToTheScreen(){
//        return "Name: " + name + "\nColor: " + color + "\nSpeed: " + amountOfSpeed + "\nPower: " + amountOfPower;
//    }

    @Override
    public String toString() {

        return super.toString() + String.format("%s: %d %s: %b", "\nNumber of Legs", numberOfLegs, "\nCan Hunt Other Animals", canHuntOtherAnimals )
                + "\nAnimal Value: " + evaluateAnimalValue();


    }
}
