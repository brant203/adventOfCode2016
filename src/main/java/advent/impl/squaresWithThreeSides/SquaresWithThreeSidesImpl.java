package advent.impl.squaresWithThreeSides;


import advent.PuzzleInput;
import advent.SquaresWithThreeSides;
import advent.Triangle;

import java.util.ArrayList;
import java.util.List;

public class SquaresWithThreeSidesImpl implements SquaresWithThreeSides{

    private PuzzleInput puzzleInput;

    public SquaresWithThreeSidesImpl(PuzzleInput puzzleInput){
        this.puzzleInput = puzzleInput;
    }

    public int objective1() {
        List<Triangle> triangles = getTrianglesObjective1(puzzleInput.getInputFromFile("day3.txt"));
        int count = 0;
        for(Triangle triangle:triangles){
            if(triangle.isATriangle())count++;
        }
        return count;
    }

    public int objective2() {
        List<Triangle> triangles = getTrianglesObjective2(puzzleInput.getInputFromFile("day3.txt"));
        int count = 0;
        for(Triangle triangle:triangles){
            if(triangle.isATriangle())count++;
        }
        return count;
    }

    private List<Triangle> getTrianglesObjective1(List<String> instructions){
        List<Triangle> triangles = new ArrayList<Triangle>();
        for(String instruction:instructions){
            String[] sideStrings = instruction.trim().split("[\\s]+");
            int a = Integer.parseInt(sideStrings[0].trim());
            int b = Integer.parseInt(sideStrings[1].trim());
            int c = Integer.parseInt(sideStrings[2].trim());
            Triangle triangle = new TriangleImpl(a,b,c);
            triangles.add(triangle);
        }
        return triangles;
    }

    private List<Triangle> getTrianglesObjective2(List<String> instructions){
        List<Triangle> triangles = new ArrayList<Triangle>();
        for(int i=0; i+3<=instructions.size();i++){
            String[] aString = instructions.get(i++).trim().split("\\s+");
            String[] bString = instructions.get(i++).trim().split("\\s+");
            String[] cString = instructions.get(i).trim().split("\\s+");
            for(int j=0; j<3; j++){
                int a = Integer.parseInt(aString[j].trim());
                int b = Integer.parseInt(bString[j].trim());
                int c = Integer.parseInt(cString[j].trim());
                Triangle triangle = new TriangleImpl(a,b,c);
                triangles.add(triangle);
            }
        }
        return triangles;
    }
}
