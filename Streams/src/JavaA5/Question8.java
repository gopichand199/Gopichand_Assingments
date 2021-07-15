package JavaA5;
import java.util.Arrays;
import java.util.List;
import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.toList;
public class Question8 {

	public static void main(String[] args) {
		Trader gopi = new Trader("gopi", "Pune");
		Trader umar = new Trader("umar","Telangana");
		Trader ali = new Trader("Ali","Pune");
		Trader ram = new Trader("ram","Andhra Pradesh");

		List<Transaction> transactions = Arrays.asList(
		    new Transaction(ram, 2011, 300),
		    new Transaction(gopi, 2012, 1000),
		    new Transaction(gopi, 2011, 400),
		    new Transaction(umar, 2012, 710),
		    new Transaction(umar, 2012, 700),
		    new Transaction(ali, 2012, 950)
		);
		transactions.stream()
		.filter(d -> {
			return d.getyear() == 2011;
		})
		.sorted(comparing(Transaction::getyear))
		.map(d -> {
			System.out.println(d.getvalue());
			return d.getvalue();
		})
		.collect(toList());
	}		   

	}


