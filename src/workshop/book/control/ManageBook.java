package workshop.book.control;

import workdshop.book.entity.Magazine;
import workdshop.book.entity.Novel;
import workdshop.book.entity.Publication;
import workdshop.book.entity.ReferenceBook;


public class ManageBook {

	public static void main(String[] args) {
		// Publication Ÿ�� �迭�� ���� �� ����
		Publication[] pubs = new Publication[5];
		pubs[0] = new Magazine("����ũ�μ���Ʈ","2007-10-01",328,9900,"�ſ�");
		pubs[1] = new Magazine("�濵����ǻ��","2007-10-03",316,9000,"�ſ�");
		pubs[2] = new Novel("���߿�","2007-07-01",396,9800,"����������������","����Ҽ�");
		pubs[3] = new Novel("���ѻ꼺","2007-04-14",383,11000,"����","���ϼҼ�");
		pubs[4] = new ReferenceBook("�ǿ��������α׷���","2007-01-14",496,25000,"����Ʈ�������");

		
		for (Publication publication : pubs) {
			System.out.println(publication);
		}
		
		System.out.println("===���� ���� ��===");
		Publication pub2 = pubs[2];
		System.out.println(pub2.getTitle() + " = " + pub2.getPrice());
		modifyPrice(pub2);
		
		System.out.println("===���� ���� ��===");
		System.out.println(pub2.getTitle() + " = " + pub2.getPrice());

		for (Publication publication : pubs) {
			printSubInfo(publication);
		}
		
		// Magazine ��ü ����
//		Magazine mz = new Magazine();
		// mz ������ ȣ�� ������ �޼���� 5�� ������ PublicationŸ���� pubs �迭���� �Ҵ��� �� ����. 
//		Publication pub = new Publication();
		// pub ������ ȣ�� ������ �޼���� 4��
		
		// Novel  ��ü ����
//		Novel novel = new Novel();
//		Publication pub2 = new Novel();

	}
	
	public static void printSubInfo(Publication pub) {
		if (pub instanceof Magazine) {
			Magazine m = (Magazine)pub;
			System.out.println(m.getPublishingPeriod());
		} else if (pub instanceof Novel) {
			Novel n = (Novel)pub;
			System.out.println(n.getAuthor() + " " + n.getGenre());
		} else if (pub instanceof ReferenceBook) {
			ReferenceBook r = (ReferenceBook)pub;
			System.out.println(r.getField());	
		}
	}
	
	// ������ �ƱԸ�Ʈ (polymorphic argument)
	public static void modifyPrice(Publication pub) {
		double rate = 0.0;
		if (pub instanceof Magazine) {
			rate = 0.6;	
		} else if (pub instanceof Novel) {
			rate = 0.8;	
		}else if (pub instanceof ReferenceBook) {
			rate = 0.9;	
		}
		pub.setPrice((int)(rate * pub.getPrice()));
	}

}
