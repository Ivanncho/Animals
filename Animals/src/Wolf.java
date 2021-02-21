
public class Wolf extends Canine{
	

	public Wolf(String name, String color, int age) {
		super(name, color, age);
		
	}

	@Override
	public void makeNoise() {
		System.out.println("Aaaauuuuu");
		
	}
}
