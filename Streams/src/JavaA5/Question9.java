package JavaA5;
import static java.util.stream.Collectors.toList;
import java.util.Arrays;
import java.util.List;

public class Question9 {

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
			    .map(transaction -> {
					System.out.println(transaction.gettrader().getcity());
					return transaction.getvalue();
			    })
		 .distinct()
		 .collect(toList());
		 

	}



	}


