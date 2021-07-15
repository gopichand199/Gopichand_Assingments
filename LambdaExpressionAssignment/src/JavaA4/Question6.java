package JavaA4;

import java.util.ArrayList;
import java.util.List;
import java.util.function.UnaryOperator;
 
public class Question6 {

	public static void main(String[] args) {
		List<String> list= new ArrayList<>();
		list.add("gopi chand");
		list.add("kl rahul");
		list.add("ms dhoni");
		list.add("rohit sharma");
				
		 UnaryOperator <String> unary=l-> l.toUpperCase();
		 list.replaceAll(l->unary.apply(l));
		 System.out.println(list);
		 
		

	}

}


