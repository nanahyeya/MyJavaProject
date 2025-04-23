package workshop.person.entity;

public class PersonEntity {
	
	private String name;
	private char gender;
	private String ssn;
	private String address;
	private String Phone;
	
	public PersonEntity() {
	}

	public PersonEntity(String name, String ssn, String address, String phone) {

		setSsn(ssn);
		setName(name);
		setAddress(address);
		setPhone(phone);
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
		char genderNum = ssn.charAt(6);
		if(genderNum == '1' || genderNum == '3') {
			// this.gender = '³²'
			setGender('³²');
		} else {
			setGender('¿©');
		}
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return Phone;
	}

	public void setPhone(String phone) {
		Phone = phone;
	}
	
	
}
