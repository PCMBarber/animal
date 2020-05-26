package animal;

import java.util.ArrayList;

public class zoo {
	
//	animal[] zooStorage = new animal[3];
//	public zoo() {
//		zooStorage[0] = new dog("Dopy", 34, 20);
//		zooStorage[1] = new cat("Tibbie", 8, "extremely");
//		zoo[3] = 
//}
//		zoo zoo = new zoo();
//		
//		zoo.zooStorage[0].size();
//		zoo.zooStorage[1].size();
//		
//		zoo.zooStorage[0].speak();
//		zoo.zooStorage[1].speak();	
	public static void main(String[] args) {
		Cat myCat = new Cat("Tibbie", 8, "extremely");
		Dog myDog = new Dog("Dopy", 34, 20);
		
		myCat.size();
		myDog.size();
		
		myCat.speak();
		myDog.speak();
	}
}
