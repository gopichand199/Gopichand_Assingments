import java.util.Scanner;
public class Question3
{
 public static void main(String[] args) 
 {       
  double p, rate, t, simp, comp;
  Scanner sc=new Scanner (System. in);
  System.out.println("Enter the amount:");
  p=sc.nextDouble();
  System. out. println("Enter the No.of years:");
  t=sc.nextDouble();
  System. out. println("Enter the Rate of  interest");
  rate=sc.nextDouble();
  simp=(p * t * rate)/100;
  comp=p * Math.pow(1.0+rate/100.0,t) - p;
  System.out.println("Simple Interest= "+simp);
  System.out. println("Compound Interest= "+comp);
 }
}