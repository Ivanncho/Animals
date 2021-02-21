
public class MyAnimalsList {
	private Animals[] animals = new Animals[5];
	private int nextIndex = 0;
	
	public void add(Animals a) {
		System.out.println("/n**This is a list of animals**");
		if(nextIndex < animals.length) {
			animals[nextIndex] = a;
			System.out.println(a.getClass() +" Animal added at " + nextIndex);
			nextIndex++;
		}
	}
}
