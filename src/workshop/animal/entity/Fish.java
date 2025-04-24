package workshop.animal.entity;

public class Fish extends Animal implements Pet {

	public Fish(int legs) {
		super(0);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public void setName(String name) {
		this.name = name;	
	}

	@Override
	public void play() {
		System.out.println("Fish plays in the waterpots");
	}

	@Override
	public void eat() {
	System.out.println("Fish eats planktons");
	}

}
