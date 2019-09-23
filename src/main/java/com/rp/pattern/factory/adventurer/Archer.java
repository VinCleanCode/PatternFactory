package com.rp.pattern.factory.adventurer;

public class Archer implements Adventurer{
    public String getType() {
        System.out.println("I am com.rp.pattern.factory.adventurer.Archer");
        return this.getClass().getSimpleName();
    }
}
