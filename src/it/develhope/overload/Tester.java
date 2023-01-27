package it.develhope.overload;

public class Tester {
    public static void main(String[] args)
    {
        Shape Shape1, Shape2, Shape3, Shape4, Shape5;
        Shape1=new Shape();
        Shape2=new Shape();
        Shape3=new Shape();
        Shape4=new Shape();
        Shape5=new Shape();

        System.out.println(Shape1.getShapeDetails(Shape1));
        System.out.println(Shape2.getShapeDetails(Shape2));
        System.out.println(Shape3.getShapeDetails(Shape3));
        System.out.println(Shape4.getShapeDetails(Shape4));
        System.out.println(Shape5.getShapeDetails(Shape5));
    }
}
