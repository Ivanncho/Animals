
public class Vet {
	public void giveShot(Animals a) {
		System.out.println("Giving shot to a " + a.getClass());
		a.makeNoise();
	}
}
