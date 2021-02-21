
public class Cat extends Feline implements Pets {
	

	public Cat(String name, String color, int age) {
		super(name, color, age);
		
	}

	@Override
	public void makeNoise() {
		System.out.println("Miiiaauu");
		
	}

	@Override
	public void beFriendly() {
		System.out.println("Purring around you");
		
	}

	@Override
	public void play() {
		System.out.println("Pushing the cotton fur ball around");
		
	}
}
