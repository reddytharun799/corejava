package Interfacepackage;

import java.awt.*;

public class Main {
    public static void main(String[] args){
        Rectangle rectangle =new Rectangle(10,12);

        Circle circle =new Circle(3);

        Triangle triangle=new Triangle(6,7);

        System.out.println(rectangle.getArea());
        System.out.println(circle.getArea());
        System.out.println(triangle.getArea());


    }
}
