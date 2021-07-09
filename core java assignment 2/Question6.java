import java.util.Scanner;
abstract class Persistence
{
 String name;
 String place;
 Scanner sc=new Scanner(System.in);
 abstract public void persist();
}
class File_Persistence extends Persistence
{
 public void persist()
 {
  System.out.println("Enter the name:");
  name=sc.nextLine();
 }
}
class Database_Persistence extends Persistence
{
 public void persist()
 {
  System.out.println("Enter the place:");
  place=sc.nextLine();
 }
}
public class Question6
{
 public static void main(String args[])
 {
  File_Persistence f1=new File_Persistence();
  f1.persist();
  Database_Persistence d1=new Database_Persistence();
  d1.persist();
 }
}