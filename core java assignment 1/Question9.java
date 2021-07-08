import java.util.Scanner;
public class Question9
{
 static int sub1,sub2,sub3;
 static Scanner sc=new Scanner(System.in);
 public static int student1()
 {
  System.out.println("Enter the three subject marks :");
  sub1=sc.nextInt();
  sub2=sc.nextInt();
  sub3=sc.nextInt();
  int total1=(sub1+sub2+sub3);
  int avg1=(total1/3);
  System.out.println("The total marks for student1 :" +total1);
  System.out.println("Average marks for student1 :" +avg1);
  return total1;
 }
 public static int student2()
 {
  System.out.println("Enter the three subject marks :");
  sub1=sc.nextInt();
  sub2=sc.nextInt();
  sub3=sc.nextInt();
  int total2=(sub1+sub2+sub3);
  int avg2=(total2/3);
  System.out.println("The total marks for student1 :" +total2);
  System.out.println("Average marks for student1 :" +avg2);
  return total2;
 }
 public static int student3()
 {
  System.out.println("Enter the three subject marks :");
  sub1=sc.nextInt();
  sub2=sc.nextInt();
  sub3=sc.nextInt();
  int total3=(sub1+sub2+sub3);
  int avg3=(total3/3);
  System.out.println("The total marks for student1 :" +total3);
  System.out.println("Average marks for student1 :" +avg3);
  return total3;
 }
 public static void main(String args[])
 {
  int studtotal1,studtotal2,studtotal3;
  studtotal1=student1();
  studtotal2=student2();
  studtotal3=student3();
  int total=(studtotal1+studtotal2+studtotal3);
  int average=(total/3);
  System.out.println("Total marks of three students subjects :" +total);
  System.out.println("Average of three students marks :" +average);
 }
}