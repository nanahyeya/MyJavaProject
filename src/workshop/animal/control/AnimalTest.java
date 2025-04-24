package workshop.animal.control;

import workshop.animal.entity.Animal;
import workshop.animal.entity.Cat;
import workshop.animal.entity.Pet;

public class AnimalTest {

	public static void main(String[] args) {
		// cat 객체 생성 3가지 방법
		
		Cat cat1 = new Cat(); // 5개 메서드 호출 가능
		Pet cat2 = new Cat(); // 3개
		Animal cat3 = new Cat(); // 2개
		
		// Cat type
		// Pet 상속
		cat1.setName("yeppi");
		System.out.println(cat1.getName());
		cat1.play();
		// Animal 상속
		cat1.eat();
		cat1.walk();

		// Pet type
		// Pet 상속
		cat2.setName("nabi");
		System.out.println(cat2.getName());
		cat2.play();
		
		// Animal type
		//Animal 상속
		cat3.eat();
		cat3.walk();
		
	}

}
