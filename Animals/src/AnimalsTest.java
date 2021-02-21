
public class AnimalsTest {

	public static void main(String[] args) {
		Dog d = new Dog();
		d.setName("Fibo");
		System.out.println(d.getName());
		System.out.println("*********");
		Vet v = new Vet();
		v.giveShot(d);
		Cat c = new Cat();
		v.giveShot(c);
	}

}
