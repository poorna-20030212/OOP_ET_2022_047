package LW_01;

import java.util.Scanner;

class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius=radius;
    }

    public void setRadius(double radius) {
        this.radius=radius;
    }

    public double getRadius() {
        return radius;
    }

    public double computeArea() {
        return Math.PI * radius * radius;
    }

    public double computeCircumference() {
        return 2 * Math.PI * radius;
    }
}

public class Q5 {
    public static void main(String[] args) {
        Scanner reader=new Scanner(System.in);

        System.out.print("Enter inner radius (ri): ");
        double ri=reader.nextDouble();

        System.out.print("Enter outer radius (ro): ");
        double ro=reader.nextDouble();

        Circle inCircle=new Circle(ri);
        Circle outCircle=new Circle(ro);

        double shadedArea=outCircle.computeArea()-inCircle.computeArea();

        System.out.println("The area of the circular region is: " + shadedArea);

    }
}

