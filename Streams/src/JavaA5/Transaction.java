package JavaA5;

public class Transaction {
	private Trader trader;
	private int year,value;
			
	public Transaction(Trader trader,int year,int value) {
		super();
		this.trader=trader;
		this.year=year;
		this.value=value;
	}
	public Trader gettrader() {
    	return trader;
    }
    public void settrader(Trader trader) {
    	this.trader=trader;
    }
    public int getyear() {
    	return year;
    }
    public void setyear(int year) {
    	this.year=year;
    }
    public int getvalue() {
    	return value;
    }
    public void setvalue(int value) {
    	this.value=value;
    }
    public String toString() {
    	return "Transaction [trader=" + trader + ", year=" + year + ", value=" + value + "]";
    }
}


