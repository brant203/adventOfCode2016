package advent.impl;

import advent.NoTimeForATaxicab;
import advent.PuzzleInput;
import advent.impl.Coordinate;

import java.util.List;

/**
 * Created by brant on 12/4/2016.
 */
public class NoTimeForATaxicabImpl implements NoTimeForATaxicab{
    private Coordinate coordinate;

    public NoTimeForATaxicabImpl(PuzzleInput puzzleInput){
        coordinate = new Coordinate(0,0,0);
        String[] instructions = parseInput(puzzleInput.getInputFromFile("day1.txt"));
        for(String instruction:instructions){
            char dir = instruction.charAt(0);
            int steps = Integer.parseInt(instruction.substring(1));
            coordinate.setDir(dir);
            coordinate.moveCoordinate(steps);
        }
    }

    public int objective1(){
        return coordinate.getDistance();
    }

    public int objective2() {
        return coordinate.getDistanceFromFirstRevisit();
    }

    private String[] parseInput(List<String> input){
        return input.get(0).split(", ");
    }
}
