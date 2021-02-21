
abstract public class Animals {
	private String name;
	private double height;
	private String color;
	private int age;
	
	abstract public void makeNoise();
	
	public Animals() {
		System.out.println("Making an Animal");
	}
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void eat() {
		System.out.println("Eating...");
	}
	public void sleep() {
		System.out.println("Sleeping...ZzZz");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
}
