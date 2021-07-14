package JavaA4;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Question3 {

	public static void main(String[] args) {
		int a=9;
		
		 Supplier<?> s = () -> Math.random();
	        System.out.println(s.get());
	        
	     Consumer<Integer> p = (b)-> System.out.println(b);
	        p.accept(a);

	     Predicate<Integer> pred= c->(c>2468);
	        System.out.println(pred.test(1357));

	     Function<Double,Double> doubleValue = b->2*b;
	        System.out.println("Doubling a value "+ a +" : "+ doubleValue.apply((double) a));   

	}

	}


