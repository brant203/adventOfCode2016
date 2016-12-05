package advent.impl;

import java.awt.*;
import java.util.*;
import java.util.List;

import static java.lang.Math.abs;

public class Coordinate extends Point{

    private int x = 0;
    private int y = 0;
    /*N=0 E=1 S=2 W=3*/
    private int dir = 2;
    private List<Point> visitedPoints = new ArrayList<Point>();

    public Coordinate(int x, int y, int dir){
        this.x = x;
        this.y = y;
        this.dir = dir;
    }
    public int getDir(){
        return dir;
    }
    public List<Point> getVisitedPoints(){
        return visitedPoints;
    }

    public void setDir( char instruction ){
        int leftOrRight = 0;
        if (instruction == 'R'){
            leftOrRight = 1;
        }
        else if (instruction == 'L'){
            leftOrRight = -1;
        }
        dir += leftOrRight;
        if(dir == 4){
            dir = 0;
        }
        else if(dir == -1){
            dir = 3;
        }

    }
    public void moveCoordinate(int spaces){
        for(int i=0; i<spaces; i++){
            if(dir == 0){
                y++;
            }
            else if(dir == 1){
                x++;
            }
            else if(dir == 2){
                y--;
            }
            else{
                x--;
            }
            visitedPoints.add(new Point(x, y));
        }
    }

    public int getDistance(){
        return abs(y)+abs(x);
    }
    public int getDistanceFromFirstRevisit(){
        for(int i=0; i<visitedPoints.size(); i++){
            for(int j=i+1; j<visitedPoints.size(); j++){
                Point pointA = visitedPoints.get(i);
                Point pointB =visitedPoints.get(j);
                if(pointA.equals(pointB)){
                    return (int)(abs(pointA.getX())+ abs(pointA.getY()));
                }
            }
        }
        return 0;
    }


}