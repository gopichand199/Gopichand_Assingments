class Employee
{
 int a=20000,b=3000,c=2000;
 int d=a+b,e=a+c;
 public void salary()
 {
  System.out.println("Salary :" +a);
 }
 public void incentive()
 {
  System.out.println("incentive amount :" +b );
 }
 public void overtime()
 {
  System.out.println("overtime amount :" +c);
 }
}
class Manager extends Employee
{
 public void incentive()
 {
  System.out.println("incentive amount :" +b );
 }
 public void salary()
 {
  System.out.println("Total Salary=salary+incentive :" +d);
 }
}
class Labour extends Employee
{
 public void overtime()
 { 
  System.out.println("overtime amount :" +c);
 }
 public void salary()
 {
  System.out.println("Total Salary=salary+overtime :" +e);
 }
}
public class Question2
{
 public static void main(String args[])
 {
  Manager m1=new Manager();
  m1.incentive();
  m1.salary();
  Labour l1=new Labour();
  l1.overtime();
  l1.salary();
 }
}
 