/*Design a class named Circle containing following attributes and behavior.
    •Onedouble data field named radius. The default valueis1.
    •A no-argumentconstructor that creates a default circle.
    •A Single argument constructor that creates a Circle with the specified radius.
    •A method named getArea() that returns area of the Circle.
    •A method named getPerimeter() that returns perimeterof it.
    
    Prepared by 21ce015_Rishikesh.
*/

import java.util.Scanner;

class Circle{
    double radius = 1;
    
    Circle()
    { }
    Circle(double r)
    {
        radius = r;
    }
    public double getArea()
    {
        return (3.14*radius*radius);
    }
    public double getPerimeter()
    {
        return (2*3.14*radius);
    }
}

public class P2_1 {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        System.out.println("Area = " + c1.getArea() + "  Perimeter = " + c1.getPerimeter());
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the radius : ");
        double r = in.nextDouble();
        Circle c2 = new Circle(r);
        System.out.println("Area = " + c2.getArea() + "  Perimeter = " + c2.getPerimeter());
    }
}
