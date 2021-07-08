import java.util.Scanner;
public class Question8
{
 public static void search(int arr[])
 {
  int n=arr.length;
  int temp=0;
  for(int i=0;i<n;i++)
  {
   for(int j=1;j<(n-i);j++)
   {
    if(arr[j-1]>arr[j])
    {
     temp=arr[j-1];
     arr[j-1]=arr[j];
     arr[j]=temp;
    }
   }
  }
 }
 public static void main(String args[])
 {
  int arr[]=new int [15];
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the array number:");
  for(int i=0;i<15;i++)
  {
   System.out.println("Enter" +(i+1)+ "value:");
   arr[i]=sc.nextInt();
  }
  System.out.println("Array before bubble sort");
  for(int i=0;i<arr.length;i++)
  {
   System.out.println(arr[i]+ " ");
  }
  System.out.println();
  search(arr);
  System.out.println("Number in bubble sorting");
  for(int i=0;i<arr.length-1;i++)
  {
   System.out.println(arr[i]+ " ");
  }
 }
}