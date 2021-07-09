class Singleton
{
 private static Singleton single_instance=null;
 public String s;
 private Singleton()
 {
  s = "Hello I am a string part of Singleton class";
 }
 private static Singleton Singleton()
 {
  if (single_instance == null)
  {
   single_instance = new Singleton();
  }
  return single_instance;
 }
}