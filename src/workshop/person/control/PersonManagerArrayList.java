package workshop.person.control;

import java.util.List;
import java.util.LinkedList;
import java.util.ArrayList;

import workshop.person.entity.PersonEntity;

public class PersonManagerArrayList {
	public static void main(String[] args) {
		
//		ArrayList<PersonEntity> personList = new ArrayList<>();
//		List<PersonEntity> personList2 = new ArrayList<>();
//		List<PersonEntity> personList3 = new LinkedList<>();
		
		List<PersonEntity> personList = new ArrayList<>();

//		PersonEntity[] persons = new PersonEntity[10];
		
		PersonManagerArrayList mgr = new PersonManagerArrayList();
		
		mgr.fillPersons(personList);
		mgr.showPersons(personList);
		System.out.println(mgr.findByGender(personList, '남'));
		mgr.showPerson(personList, "김하늘");

	}
	
	private void showPersons(List<PersonEntity> persons) {
		//enhanced for loop
		for (PersonEntity person : persons) {
			System.out.println(person.getName() + "\t" + person.getGender() + "\t" + person.getPhone());
		}
	}

	private void fillPersons(List<PersonEntity> persons) {
		// 배열 초기화
		persons.add(new PersonEntity("이성호","7212121028102", "인천 계양구", "032-392-2932"));
		persons.add(new PersonEntity("김하늘","7302132363217", "서울 강동구", "02-362-1932"));
		persons.add(new PersonEntity("박영수","7503111233201", "서울 성북구", "02-887-1542"));
		persons.add(new PersonEntity("나인수","7312041038988", "대전 유성구", "032-384-2223"));
		persons.add(new PersonEntity("홍정수","7606221021341", "서울 양천구", "02-158-7333"));
		persons.add(new PersonEntity("이미숙","7502142021321", "서울 강서구", "02-323-1934"));
		persons.add(new PersonEntity("박성구","7402061023101", "서울 종로구", "02-308-0932"));
		persons.add(new PersonEntity("유성미","7103282025101", "서울 은평구", "02-452-0939"));
		persons.add(new PersonEntity("황재현","7806231031101", "인천 중구", "032-327-2202"));
		persons.add(new PersonEntity("최철수","7601211025101", "인천 계양구", "032-122-7832"));
	}
	
	public int findByGender(List<PersonEntity> persons, char gender) {
		int genderCnt = 0;
		for (PersonEntity person : persons) {
			if (person.getGender() == gender) {
				genderCnt++;
			}
		}
		return genderCnt;
	}
	
	public void showPerson(List<PersonEntity> persons, String name) {
		for (PersonEntity person : persons) {
			if (person.getName().equals(name)) {
				System.out.println("[이름]" + person.getName());
				System.out.println("[성별]" + person.getGender());
				System.out.println("[전화번호]" + person.getPhone());
				System.out.println("[주소]" + person.getAddress());
			}
		}
	}

}
