package Interfacepackage;

public class Triangle implements Shape{
    private double base;
    private double hight;

    public Triangle(double base,double hight){
        this.base=base;
        this.hight=hight;

    }
    public double getArea(){
        return 0.5 * base * hight;
    }
}

