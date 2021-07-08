import java.util.Scanner;
public class Question7
{
 public static int searching(int []arr,int key)
 {
  for(int i=0;i<arr.length-1;i++)
  {
   if(arr[i]==key)
   {
    return i;
   }
  }
  return -1;
 }
 public static void main(String args[])
 {
  int [] num=new int[15];
  int key;
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the number in arrays");
  for(int i=0;i<15;i++)
  {
   num[i]=sc.nextInt();
  }
  System.out.println("Enter the number which is found:");
  key=sc.nextInt();
  System.out.println("The number is found in the \t" +searching(num,key));
 }
}