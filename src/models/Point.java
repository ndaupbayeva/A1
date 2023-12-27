package models;

public class Point {
    private double x;
    private double y;

    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }

    public double findDistance(Point destination){ //creating a function to find the distance by formula
        double distance = 0;
        double dX = destination.x - this.x;
        double dY = destination.x - this.y;
        distance = Math.sqrt(dX * dX + dY * dY);
        return distance;
    }

}