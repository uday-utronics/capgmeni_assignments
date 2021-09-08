package collection;


public class contact2 {

	Long phonenumber;
	String name;
	String email;
	Gender gender;
	
	public enum Gender{
		M,F
	}

	public contact2(long phonenumber, String name, String email, Gender gender) {
		//super();
		this.phonenumber = phonenumber;
		this.name = name;
		this.email = email;
		this.gender = gender;
	}

	public Long getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(Long phonenumber) {
		this.phonenumber = phonenumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}
	
	public String toString() {
		return "["+this.getPhonenumber()+"  "+this.getName()+"  "+this.getEmail()+"  "+this.getGender()+"]";
		
	}
	
}



