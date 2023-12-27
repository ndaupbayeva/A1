import models.Point;
import models.Shape;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class MyApplication {
    public static void Main(String[] args) throws FileNotFoundException {
        File file = new File("C:\\Users\\Nuriya\\IdeaProjects\\untitled\\src\\source.txt");
        Scanner sc = new Scanner(file);
        Shape shape = new Shape();

        while (sc.hasNext()){  // scans our source file to take coordinates and gives points to other files
            double x = sc.nextDouble();
            double y = sc.nextDouble();

            Point point = new Point(x , y);
            shape.addPoint(point);
        }

        System.out.println("Perimeter: " + shape.perimeter());
        System.out.println("The longest side: " + shape.longestSide());
        System.out.println("Average: " + shape.averageSide());
    }
}