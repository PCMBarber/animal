package animal;

class Animal {
	
	public String name;
	public int weight;
	public String noise;
	
	public void size() {
		if (weight > 30) {
			System.out.println("Chonky");
		}
		else {
			System.out.println("Smol");
		}
	}
	
	public void speak() {
		System.out.println(noise);
	}
}
