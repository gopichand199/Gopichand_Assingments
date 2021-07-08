import java.util.Scanner;
public class Question5
{
 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  double amount,taxamount;
  int percent;
  System.out.println("Enter the amount");
  amount =sc.nextDouble();
  if(amount>=0 && amount<=180000)
  {
   taxamount=amount;
   System.out.println("Total amount is \t:" +amount);
  }
  else if(amount>=180001 && amount<=300000)
  {
   percent=10;
   taxamount=amount*percent;
   System.out.println("Total amount is \t:" +taxamount);
  }
  else if(amount>=300001 && amount<=500000)
  {
   percent=20;
   taxamount=amount*percent;
   System.out.println("Total amount is \t:" +taxamount);
  }
  else
  {
   percent=30;
   taxamount=amount*percent;
   System.out.println("Total amount is \t:" +taxamount);
  }
 }
}