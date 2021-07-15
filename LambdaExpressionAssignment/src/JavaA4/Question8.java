package JavaA4;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Question8 {

	public static void main(String[] args) {
		 List<Integer> list = new ArrayList<>();
	        list.add(12345);
	        list.add(67890);
	        list.add(7987);
	        list.add(54321);
	        
	        Consumer<List<Integer>> iterate = a-> {a.forEach(System.out::println);};
	        Thread t = new Thread(()-> iterate.accept(list));
	        t.start();

	}

	}


