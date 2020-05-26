package animal;

public class Dog extends Animal {

	public int energyLevel;
	
	public Dog(String name, int weight, int energyLevel) {
		this.name = name;
		this.weight = weight;
		this.noise = "Bork";
		this.energyLevel = energyLevel;
	}
	
	public void excite() {
		System.out.println("I am "+ this.energyLevel + "% excited");
	}
}
