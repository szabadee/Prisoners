package com.flow;

import java.util.ArrayList;
import java.util.List;

public class PrisonerTeam {
    List<Prisoner> prisonerTeam = new ArrayList<>();
    Prisoner countPrisoner;

    public List<Prisoner> prisonerTeamGenerator(int size) {
        for (int i = 0; i < size; i++) {
            Prisoner uniquePrisoner = new Prisoner("Prisoner", false, 0);
            uniquePrisoner.setNameOfThePrisoner("Prisoner " + (i + 1));
            prisonerTeam.add(uniquePrisoner);
        }
        countPrisoner = prisonerTeam.get(0);
        countPrisoner.setStatus(true);
        countPrisoner.setWalkCounter(1);
        return prisonerTeam;
    }

    public List<Prisoner> prisonerWalker (List<Prisoner> prisonerTeam) {
        int randomIndex;
        countPrisoner = prisonerTeam.get(0);

        while (countPrisoner.getWalkCounter() != prisonerTeam.size()) {
            randomIndex = (int) (Math.random() * (prisonerTeam.size()));
            System.out.println("Random index: " + randomIndex);
            System.out.println("Count Prisoner: " + countPrisoner.getWalkCounter());

            if (prisonerTeam.get(randomIndex) == countPrisoner && countPrisoner.getStatus() == false ) {
                countPrisoner.setStatus(true);
                countPrisoner.setWalkCounter(countPrisoner.getWalkCounter() + 1);
                System.out.println("Count Prisoner: " + countPrisoner.getWalkCounter());
            }

            if (prisonerTeam.get(randomIndex) != countPrisoner) {
                prisonerTeam.get(randomIndex).setWalkCounter(prisonerTeam.get(randomIndex).getWalkCounter() + 1);
                System.out.println("Count other Prisoner: " + prisonerTeam.get(randomIndex).getWalkCounter());

                if (prisonerTeam.get(randomIndex).getStatus() == false && countPrisoner.getStatus() == true) {
                    countPrisoner.setStatus(false);
                    prisonerTeam.get(randomIndex).setStatus(true);
                }
            }
        }

        return prisonerTeam;
    }

    public String toString() {
        return prisonerTeam.toString();
    }

}
