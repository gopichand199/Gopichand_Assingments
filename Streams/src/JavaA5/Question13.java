package JavaA5;
import java.util.Arrays;
import java.util.List;

public class Question13 {

	public static void main(String[] args) {
		Trader sohail = new Trader("Sohail", "Delhi");
		Trader kumar = new Trader("Kumar","Telangana");
		Trader amit = new Trader("Amit","Delhi");
		Trader kiran = new Trader("Kiran","Andhra Pradesh");

		List<Transaction> transactions = Arrays.asList(
		    new Transaction(kiran, 2011, 300),
		    new Transaction(sohail, 2012, 1000),
		    new Transaction(sohail, 2011, 400),
		    new Transaction(kumar, 2012, 710),
		    new Transaction(kumar, 2012, 700),
		    new Transaction(amit, 2012, 950)
		);
		
		transactions.stream()
        .filter(t -> "Delhi".equals(t.gettrader().getcity()))	
        .map(Transaction::getvalue)	
        .forEach(System.out::println);	

		
	}


	}

