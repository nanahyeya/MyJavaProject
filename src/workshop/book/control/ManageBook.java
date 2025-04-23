package workshop.book.control;

import workdshop.book.entity.Magazine;
import workdshop.book.entity.Publication;

public class ManageBook {

	public static void main(String[] args) {
		// Publication 타입 배열을 선언 및 생성
		Publication[] pubs = new Publication[5];
		pubs[0] = new Magazine("마이크로소프트","2007-10-01",328,9900,”매월");

		
		// Magazine 객체 생성
//		Magazine mz = new Magazine();
		// mz 변수로 호출 가능한 메서드는 5개 하지만 Publication타입인 pubs 배열에는 할당할 수 없음. 
		Publication pub = new Publication();
		// pub 변수로 호출 가능한 메서드는 4개
		
		// Novel  객체 생성
//		Novel novel = new Novel();
		Publication pub2 = new Novel();

	}

}
