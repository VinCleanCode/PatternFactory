package com.rp.pattern.factory.adventurer;

public class Warrior implements Adventurer{
    public String getType() {
        System.out.println("I am com.rp.pattern.factory.adventurer.Warrior");
        return this.getClass().getSimpleName();
    }
}
