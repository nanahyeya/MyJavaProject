package workshop.animal.control;

import workshop.animal.entity.Animal;
import workshop.animal.entity.Cat;
import workshop.animal.entity.Pet;

public class AnimalTest {

	public static void main(String[] args) {
		// cat ��ü ���� 3���� ���
		
		Cat cat1 = new Cat(); // 5�� �޼��� ȣ�� ����
		Pet cat2 = new Cat(); // 3��
		Animal cat3 = new Cat(); // 2��
		
		// Cat type
		// Pet ���
		cat1.setName("yeppi");
		System.out.println(cat1.getName());
		cat1.play();
		// Animal ���
		cat1.eat();
		cat1.walk();

		// Pet type
		// Pet ���
		cat2.setName("nabi");
		System.out.println(cat2.getName());
		cat2.play();
		
		// Animal type
		//Animal ���
		cat3.eat();
		cat3.walk();
		
	}

}
