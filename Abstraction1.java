abstract class Shape 
{
    abstract void draw();
}
class Circle extends Shape 
{
    void draw() 
    {
        System.out.println("Drawing a circle");
    }
}
class Rectangle extends Shape 
{
    void draw() 
    {
        System.out.println("Drawing a rectangle");
    }
}
