package JavaA5;

public class Fruit {
	private String name;
	private int calories,price;
	private String color;
	
	public Fruit(String name,int calories,int price,String color) {
		super();
		this.name=name;
		this.calories=calories;
		this.price=price;
		this.color=color;
	}
	public String getname() {
    	return name;
    }
    public void setname(String name) {
    	this.name=name;
    }
    public int getcalories() {
    	return calories;
    }
    public void setcalories(int calories) {
    	this.calories=calories;
    }
    public int getprice() {
    	return price;
    }
    public void setprice(int price) {
    	this.price=price;
    }
    public String getcolor() {
    	return color;
    }
    public void setcolor(String color) {
    	this.color=color;
    }
    public String toString() {
    	return "Person [name=" + name + ", calories=" + calories + ", price=" + price + ", color=" + color + "]";
    }
}


