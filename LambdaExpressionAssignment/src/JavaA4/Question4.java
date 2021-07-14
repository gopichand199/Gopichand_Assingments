package JavaA4;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
public class Question4 {

	public static void main(String[] args) {
		List<String> people = new ArrayList<>();
	    people.add("hockey");
        people.add("kabbadi");
        people.add("cricket");
        people.add("football");
        people.add("badminton");
       
        Predicate<String> predicate = p -> ((p.length()) % 2 != 0);
        people.removeIf(predicate);
        people.forEach(System.out::println);

}


	}


