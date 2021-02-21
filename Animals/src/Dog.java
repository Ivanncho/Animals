
public class Dog extends Canine implements Pets {
	

	public Dog(String name, String color, int age) {
		super(name, color, age);
	}

	@Override
	public void makeNoise() {
		System.out.println("Woof Woof..");
		
	}

	@Override
	public void beFriendly() {
		System.out.println("Licking your hand");
		
	}

	@Override
	public void play() {
		System.out.println("Jumping on your leg and running away");
		
	}
}
