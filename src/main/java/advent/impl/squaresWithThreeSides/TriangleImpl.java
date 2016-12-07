package advent.impl.squaresWithThreeSides;

import advent.Triangle;



public class TriangleImpl implements Triangle{
    private int a;
    private int b;
    private int c;

    public TriangleImpl(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public boolean isATriangle(){
        int[] sides = sortSides();
        return sides[0]+sides[1]>sides[2];
    }

    private int[] sortSides(){
        int[] sides = new int[3];
        sides[0] = a;
        sides[1] = b;
        sides[2] = c;

        for(int i=0; i < 2; i++){
            for(int j=i+1; j<3; j++){
                if(sides[i]>sides[j]){
                    int temp = sides[i];
                    sides[i]=sides[j];
                    sides[j]=temp;
                }
            }
        }
        return sides;
    }

}
