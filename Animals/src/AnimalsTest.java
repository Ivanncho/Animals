
public class AnimalsTest {

	public static void main(String[] args) {
		Dog d = new Dog("Fibo","Black",2);
		Cat c = new Cat("Luna","Orange",2);
		System.out.println();
		
		Vet v = new Vet();
		v.giveShot(d);
		System.out.println();
		
		v.giveShot(c);
		System.out.println();
		
		MyAnimalsList mal = new MyAnimalsList();
		mal.add(c);
		mal.add(d);
		
	}

}
