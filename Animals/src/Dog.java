
public class Dog extends Canine implements Pets {
	

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
