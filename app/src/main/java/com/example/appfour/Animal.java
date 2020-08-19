package com.example.appfour;

import android.widget.RelativeLayout;

import java.util.StringTokenizer;

public class Animal {

    private final String name;
    private final String color;
    private int amountOfSpeed;
    private int amountOfPower;

    public Animal(String name, String color, int amountOfSpeed, int amountOfPower) {
        this.name = name;
        this.color = color;
        this.amountOfSpeed = amountOfSpeed;
        this.amountOfPower = amountOfPower;
    }

    public String getName(){
        return name;
    }
    public String getColor(){
        return color;
    }

    public void setAmountOfSpeed(int amountOfSpeed){
        this.amountOfSpeed = amountOfSpeed;
    }
    public int getAmountOfSpeed(){
        return amountOfSpeed;
    }
    public void setAmountOfPower(int amountOfPower){
        this.amountOfPower = amountOfPower;
    }
    public int getAmountOfPower(){
        return amountOfPower;
    }

    public int evaluateAnimalValue(){

        int result = amountOfSpeed * amountOfPower;
        return result;
    }

    @Override
    public String toString() {
        return String.format("%s: %s %s: %s %s: %d %s: %d", "Name", name, "\nColor", color, "\nSpeed", amountOfSpeed,"\nPower", amountOfPower);

    }
}