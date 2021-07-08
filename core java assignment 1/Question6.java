import java.util.Scanner;
public class Question6
{
 public static void main(String args[])
 {
  if(!validateUser())
  {
   System.out.println("Contact Admin");
  }
 }
 public static boolean validateUser()
 {
  boolean result=false;
  String username,password;
  Scanner sc=new Scanner(System.in);
  for(int i=0;i<3;i++)
  {
   System.out.println("Enter the username");
   username=sc.nextLine();
   System.out.println("Enter the password");
   password=sc.nextLine();
   {
    if(username.equals("Gopi") && (password.equals("chand")))
    result=true;
    return result;
   }
  }
  return result;
 }
}