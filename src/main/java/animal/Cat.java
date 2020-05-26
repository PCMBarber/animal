package animal;

public class Cat extends Animal {
	
	public String aloofness;
	
	public Cat(String name, int weight, String aloofness) {
		this.name = name;
		this.weight = weight;
		this.noise = "meow";
		this.aloofness= aloofness;
	}
	
	public void aloof() {
		System.out.println("I am "+ this.aloofness + "aloof");
	}
	
}
