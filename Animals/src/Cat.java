
public class Cat extends Feline implements Pets {
	

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
