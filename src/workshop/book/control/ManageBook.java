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

		
		// Magazine ��ü ����
//		Magazine mz = new Magazine();
		// mz ������ ȣ�� ������ �޼���� 5�� ������ PublicationŸ���� pubs �迭���� �Ҵ��� �� ����. 
		Publication pub = new Publication();
		// pub ������ ȣ�� ������ �޼���� 4��
		
		// Novel  ��ü ����
//		Novel novel = new Novel();
		Publication pub2 = new Novel();

	}

}
