package ru.synergy;

import java.util.Scanner;

public class Point {
    double  x,y;
    void move(double dx,double dy){
        x+=dx;
        y+=dy;
    }
    void input(){
        double x,y;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter x:");
        x = in.nextDouble();
        System.out.print("Enter y:");
        y = in.nextDouble();
        move(x,y);

    }
    double getDistance(Point a){
        return Math.sqrt(Math.pow(x-a.x,2) + Math.pow(y-a.y,2));
    }
    public String toString(){
        return "Point{" +
                "x = "+ x  + " "+
                "y = " +y +"}";

    }
}
