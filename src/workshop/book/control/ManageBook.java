package workshop.book.control;

import workdshop.book.entity.Magazine;
import workdshop.book.entity.Publication;

public class ManageBook {

	public static void main(String[] args) {
		// Publication Ÿ�� �迭�� ���� �� ����
		Publication[] pubs = new Publication[5];
		pubs[0] = new Magazine("����ũ�μ���Ʈ","2007-10-01",328,9900,���ſ�");

		
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
