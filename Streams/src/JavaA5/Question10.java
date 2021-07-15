package JavaA5;
import java.util.Arrays;
import java.util.List;
import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.toList;


public class Question10 {

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
		
		List<Trader> traders =
			    transactions.stream()
			                .map(Transaction::gettrader)	
			                .filter(trader -> trader.getcity().equals("Pune"))	
			                .distinct()	
			                .sorted(comparing(Trader::getname))	
			                .collect(toList());
		System.out.println(traders);

		
	}

	}

