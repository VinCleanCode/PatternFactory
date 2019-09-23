package com.rp.pattern.factory.camp;

import com.rp.pattern.factory.adventurer.Adventurer;
import com.rp.pattern.factory.adventurer.Archer;

public class ArcherTrainingCamp implements TrainingCamp{
    public Adventurer trainAdventurer() {
        System.out.println("Training a Archer");
        return new Archer();
    }
}
