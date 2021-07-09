class Bank
{
 int a=75000,b=500000,c=50000;
 int d=a+b,e=a+c;
 public void bankbalance()
 {
  System.out.println("Bank Balance :" +a);
 }
 public void fixeddeposits()
 {
  System.out.println("Fixed Deposits Amount :" +b );
 }
 public void cashcredit()
 {
  System.out.println("Cash Credit Amount :" +c);
 }
}
class Savings extends Bank
{
 public void fixeddeposits()
 {
  System.out.println("Fixed Deposits Amount :" +b );
 }
 public void bankbalance()
 {
  System.out.println("Total Cash=Bank Balance+Fixed Deposits :" +d);
 }
}
class Current extends Bank
{
 public void cashcredit()
 { 
  System.out.println("Cash Credit Amount :" +c);
 }
 public void bankbalance()
 {
  System.out.println("Total Cash=Bank Balance+Cash Credit :" +e);
 }
}
public class Question3
{
 public static void main(String args[])
 {
  Savings s1=new Savings();
  s1.fixeddeposits();
  s1.bankbalance();
  Current c1=new Current();
  c1.cashcredit();
  c1.bankbalance();
 }
}
 