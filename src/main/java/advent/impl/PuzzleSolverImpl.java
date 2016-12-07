package advent.impl;

import advent.*;
import advent.impl.bathroomSecurity.BathroomSecurityImpl;
import advent.impl.squaresWithThreeSides.SquaresWithThreeSidesImpl;


public class PuzzleSolverImpl implements PuzzleSolver{
    public static void main(String[] args) {
        PuzzleInput puzzleInput = new PuzzleInputImpl();

        /*day1*/
        NoTimeForATaxicab day1 = new NoTimeForATaxicabImpl(puzzleInput);
        int day1Objective1 = day1.objective1();
        int day1Objective2 = day1.objective2();
        System.out.println("Day1:");
        System.out.println("Objective 1: " + day1Objective1);
        System.out.println("Objective 2: " + day1Objective2);

        /*day2*/
        BathroomSecurity day2 = new BathroomSecurityImpl(puzzleInput);
        String day2Objective1 = day2.objective1();
        String day2Objective2 = day2.objective2();
        System.out.println("Day2:");
        System.out.println("Objective 1: " + day2Objective1);
        System.out.println("Objective 2: " + day2Objective2);

        /*day3*/
        SquaresWithThreeSides day3 = new SquaresWithThreeSidesImpl(puzzleInput);
        int day3Objective1 = day3.objective1();
        int day3Objective2 = day3.objective2();
        System.out.println("Day3:");
        System.out.println("Objective 1: " + day3Objective1);
        System.out.println("Objective 2: " + day3Objective2);
    }
}
