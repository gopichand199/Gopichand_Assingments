package JavaA5;
import java.util.Arrays;
import java.util.List;
import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.toList;

public class Questions1to3 {

	public static void main(String[] args) {
			List<Fruit> details = Arrays.asList(
					new Fruit("Apple",52,240,"Red"),
					new Fruit("Banana",346,75,"Yellow"),
					new Fruit("BlackBerries",90,150,"Black"),
					new Fruit("Grapes",67,120,"Green"),
					new Fruit("Dates",283,300,"Brown")
					);
//Question1		
			System.out.println("Question1");
			details.stream()
			.filter(d -> {
				return d.getcalories() < 100;
			})
			.sorted(comparing(Fruit::getcalories).reversed())
			.map(d -> {
				System.out.println(d.getname());
				return d.getname();
			})
			.collect(toList());
//Question2	
			System.out.println("Question2");
			details.stream()
			.filter(d -> {
				return d.getcolor() != null;
			})
			.sorted(comparing(Fruit::getcolor))
			.map(d -> {
				System.out.println(d.getname());
				return d.getname();
			})
			.collect(toList());
//Question3
			System.out.println("Question3");
			details.stream()
			.filter(d -> {
				return d.getcolor().startsWith("R");
			})
			.sorted(comparing(Fruit::getprice))
			.map(d -> {
				System.out.println(d.getname());
				return d.getname();
			})
			.collect(toList());

		}

		}



