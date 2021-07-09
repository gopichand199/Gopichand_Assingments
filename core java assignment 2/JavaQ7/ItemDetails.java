package JavaA2Q7;

import java.util.Scanner;
public class ItemDetails {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your role");
		String role=sc.nextLine();
		if(role.equalsIgnoreCase("Customer"))
		{
			System.out.println("Enter the item you want to buy : Cookies/Candy/IceCream");
			String item=sc.nextLine();
			System.out.println("Enter the quantity of item you want to buy : ");
			float quan=sc.nextFloat();
			if(item.equalsIgnoreCase("Candy"))
			{
				Candy c=new Candy(quan);
				System.out.println("Your bill id : " +c.getcost());
			}
			else if(item.equalsIgnoreCase("Cookie"))
			{
				cookie co=new cookie(quan);
				System.out.println("Your bill id : " +co.getcost());
			}
			else if(item.equalsIgnoreCase("IceCream"))
			{
				IceCream ic=new IceCream(quan);
				System.out.println("Your bill id : " +ic.getcost());
			}
		}
		if(role.equalsIgnoreCase("Owner"))
		{
			System.out.println("Enter the item you want to store : Cookies/Candy/IceCream");
			String item1=sc.nextLine();
			System.out.println("Enter the quantity of item you want to store : ");
			int quan1=sc.nextInt();
			System.out.println("You Stored " +quan1+ " "+ item1);
		}
		}
}
