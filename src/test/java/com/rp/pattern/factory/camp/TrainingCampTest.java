package com.rp.pattern.factory.camp;

import com.rp.pattern.factory.adventurer.Adventurer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TrainingCampTest {

    @Test
    public void testTrainingCamp(){
        System.out.println("==========Factory pattern test===========");
        TrainingCamp trainingCamp = new ArcherTrainingCamp();
        Adventurer memberA = trainingCamp.trainAdventurer();
        trainingCamp = new WarriorTrainingCamp();
        Adventurer memberB = trainingCamp.trainAdventurer();

        Assertions.assertEquals(memberA.getType(), "Archer");
        Assertions.assertEquals(memberB.getType(), "Warrior");
        System.out.println("==========Factory pattern test===========");
    }
}