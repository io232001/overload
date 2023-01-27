package it.develhope.overload;

public class Shape
{
    public String shapeName;
    public int numberOfEdges;
    public Shape()
    {
        System.out.println("Object Shape has been created");
    }
    public Shape(Double radius)
    {
        System.out.println("A Circle has been created");
        this.shapeName="circle";
    }
    public Shape(int edge,Double edgeLength)
    {
        System.out.println("A square has been created");
        this.shapeName= "square";
        this.numberOfEdges=4;
    }
    public Shape(int edge,Double edgeFirst,Double edgeSecond)
    {
        System.out.println("A Rectangle has been created");
        this.shapeName="Rectangle";
        this.numberOfEdges=4;
    }
    public Shape(int edge,Double edgeFirst,Double edgeSecond,Double edgeThird)
    {
        System.out.println("A Triangle has been created");
        this.shapeName="triangle";
        this.numberOfEdges=3;
    }
    public String getShapeDetails(Shape shape)
    {
        return shapeName+numberOfEdges;
    }
}
