package variables_and_datatypes;

public class Shape {
    public void draw(){
        System.out.println("drawing");
    }
}
class Circle extends Shape{
    @Override
    public void draw(){
        System.out.println("draw a circle");
    }
}
class Square extends Shape{
    @Override
    public void draw(){
        System.out.println("draw a square");
    }
}
class Shapeclass{
    public static void main(String[] args) {
        Shape  s1= new Circle();
        Shape s2=new Square();
        s1.draw();
        s2.draw();
    }
}