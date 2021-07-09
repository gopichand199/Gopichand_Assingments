package JavaA2Q7;

public class cookie extends DessertItems {
	float quantity;
	public cookie(float q) {
		quantity=q;
	}
     public float getcost() {
    	 float cost=quantity*3f*7;
    	 float taxamount=(5f/100f)*cost;
    	 float totalcost=cost+taxamount;
    	 return totalcost;
     }
}
