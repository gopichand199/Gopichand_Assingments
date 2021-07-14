package JavaA4;

public class Person {
private String name;
	
	public Person(String name) {
		super();
		this.name=name;
	}
    public String getname() {
    	return name;
    }
    public void setname(String name) {
    	this.name=name;
    }
    public String toString() {
    	return "Person [name=" +name + "]";
    }
}
