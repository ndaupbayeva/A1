package models;

import java.util.ArrayList;
public class Shape {
    private ArrayList<Point> points;

    public Shape(){
        this.points = new ArrayList<>();
    }

    public void addPoint(Point point){
        points.add(point);
    }

    public double perimeter(){
        double perimeter = 0;
        int size = points.size();

        for(int i = 0; i < size - 1; i++){
            Point point1 = points.get(i);
            Point point2 = points.get(i + 1);
            perimeter += point1.findDistance(point2);
        }

        perimeter += points.get(size - 1).findDistance(points.get(0));

        return perimeter;
    }

    public double averageSide(){
        double len = 0;
        int size = points.size();

        for(int i = 0; i < size - 1; i++){
            Point point1 = points.get(i);
            Point point2 = points.get(i + 1);
            len += point1.findDistance(point2);
        }

        len += points.get(size - 1).findDistance(points.get(0));
        double average = len / size;
        return average;
    }

    public double longestSide(){
        double len = 0;
        int size = points.size();

        for(int i = 0; i < size - 1; i++){
            double len1 = points.get(i).findDistance(points.get(i + 1));
            len = Math.max(len, len1);
        }

        len = Math.max(len, points.get(size - 1).findDistance(points.get(0)));
        return len;
    }

}