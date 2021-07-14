package JavaA4;
import java.util.ArrayList;
import java.util.function.UnaryOperator;
 class Op implements UnaryOperator<String> {
	 public String apply(String s) {
		 return s.toUpperCase();
	 }
 }
public class Question6 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("7stones");
		list.add("cricket");
		list.add("kabbadi");
		list.add("hockey");
		System.out.println("Contents of the list : " +list);
		list.replaceAll(new Op());
		System.out.println("Contents of the list after replace operation : \n" + list);
		

	}


	}


