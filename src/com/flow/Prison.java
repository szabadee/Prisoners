package com.flow;

import java.util.Comparator;
import java.util.List;


public class Prison {
    public static void main(String[] args) {
        PrisonerTeam prison = new PrisonerTeam();
        List<Prisoner> prisonerTeam = prison.prisonerTeamGenerator(3);
        System.out.println(prisonerTeam);

        List<Prisoner> afterWalk = prison.prisonerWalker(prisonerTeam);
        System.out.println(afterWalk);

        Comparator<Prisoner> comparator = Comparator.comparing( Prisoner::getWalkCounter );
        Prisoner sorted = afterWalk
                .stream()
                .max(comparator)
                .get();

        System.out.println("The Top Prisoner: " + sorted);

    }
}
