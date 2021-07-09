package JavaA2Q7;

public class IceCream extends DessertItems {
	float quantity;
	public IceCream(float q) {
		quantity=q;
	}
     public float getcost() {
    	 float cost=quantity*60f;
    	 float taxamount=(5f/100f)*cost;
    	 float totalcost=cost+taxamount;
    	 return totalcost;
     }
}
