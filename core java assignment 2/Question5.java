abstract class Shape
{
 abstract public void draw();
}
class Line extends Shape
{
 public void draw()
 {
  System.out.println("It's shape is a Straight Line");
 }
}
class Rectangle extends Shape
{
 public void draw()
 {
  System.out.println("It's shape is a Rectangle with two opposite sides equal");
 }
}
class Cube extends Shape
{
 public void draw()
 {
  System.out.println("It's shape is a Cube with all sides equal");
 }
}
public class Question5
{
 public static void main(String args[])
 {
  Shape s1=new Line();
  s1.draw();
  Shape s2=new Rectangle();
  s2.draw();
  Shape s3=new Cube();
  s3.draw();
 }
}
  