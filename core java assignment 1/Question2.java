public class Question2
{
 public static void main(String args[]) 
 {
  for(int i=100;i<=999;i++)
  {
   int a=i,b,c=0;
   while(a>0)
   {
    b=a%10;
    a=a/10;
    c=c+(b*b*b);
   }
   if(i==c)
   {
    System.out.println(i+ " is the Armstrong number");
   }
  }
 }
}
