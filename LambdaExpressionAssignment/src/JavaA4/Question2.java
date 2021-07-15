package JavaA4;

public class Question2 {

	public static void main(String[] args) {
		 priceLambda my= str -> {
	            if(str>10000) {
	                return ("The order status is accepted");
	            }
	            else {
	                return ("The order status is not accepted");
	            }
	        };
	        System.out.println(my.price(5000));
	        System.out.println(my.price(11500));
	        System.out.println(my.price(7500));
	        System.out.println(my.price(13000));
	    }
	    interface priceLambda {
	        String price(int str);


	}

	}

