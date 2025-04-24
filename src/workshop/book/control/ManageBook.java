package workshop.book.control;

import workdshop.book.entity.Magazine;
import workdshop.book.entity.Novel;
import workdshop.book.entity.Publication;
import workdshop.book.entity.ReferenceBook;


public class ManageBook {

	public static void main(String[] args) {
		// Publication 타입 배열을 선언 및 생성
		Publication[] pubs = new Publication[5];
		pubs[0] = new Magazine("마이크로소프트","2007-10-01",328,9900,"매월");
		pubs[1] = new Magazine("경영과컴퓨터","2007-10-03",316,9000,"매월");
		pubs[2] = new Novel("빠삐용","2007-07-01",396,9800,"베르나르베르베르","현대소설");
		pubs[3] = new Novel("남한산성","2007-04-14",383,11000,"김훈","대하소설");
		pubs[4] = new ReferenceBook("실용주의프로그래머","2007-01-14",496,25000,"소프트웨어공학");

		
		for (Publication publication : pubs) {
			System.out.println(publication);
		}
		
		System.out.println("===가격 변경 전===");
		Publication pub2 = pubs[2];
		System.out.println(pub2.getTitle() + " = " + pub2.getPrice());
		modifyPrice(pub2);
		
		System.out.println("===가격 변경 후===");
		System.out.println(pub2.getTitle() + " = " + pub2.getPrice());

		for (Publication publication : pubs) {
			printSubInfo(publication);
		}
		
		// Magazine 객체 생성
//		Magazine mz = new Magazine();
		// mz 변수로 호출 가능한 메서드는 5개 하지만 Publication타입인 pubs 배열에는 할당할 수 없음. 
//		Publication pub = new Publication();
		// pub 변수로 호출 가능한 메서드는 4개
		
		// Novel  객체 생성
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
	
	// 다형적 아규먼트 (polymorphic argument)
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
