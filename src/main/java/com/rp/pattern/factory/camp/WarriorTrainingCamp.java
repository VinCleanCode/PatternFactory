package com.rp.pattern.factory.camp;

import com.rp.pattern.factory.adventurer.Adventurer;
import com.rp.pattern.factory.adventurer.Warrior;

public class WarriorTrainingCamp implements TrainingCamp{
    public Adventurer trainAdventurer() {
        System.out.println("Training a Warrior");
        return new Warrior();
    }
}
