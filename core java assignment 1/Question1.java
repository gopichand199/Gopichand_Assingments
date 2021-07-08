public class Question1
{
 public static void main(String args[])
 {
  int arm=153,num=0,rem,backup=arm;
  while(arm>0)
  {
   rem=arm%10;
   arm=arm/10;
   num=num+rem*rem*rem;
  }
  System.out.println("Actual taken number is :" +backup);
  System.out.println("Reverse of given number is :" +num);
  if (backup==num)
  {
   System.out.println("It's a Armstrong number");
  }
  else
  {
   System.out.println("It's not Armstrong number");
  }
 }
}