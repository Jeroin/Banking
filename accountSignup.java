package objectOriented.Banking;

public class accountSignup {
	
	 private String firstName;
	 private String lastName;
	 private String middleName;
	 private String gender;
	 private byte age;
	 
	 //Creation
	 
	 public accountSignup(String firstName, String lastName, String middleName, String gender, byte age) {
		 this.firstName = firstName;
		 this.lastName = lastName;
		 this.middleName = middleName;
		 this.gender = gender;
		 this.age = age;
	 }
	  

	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
		
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getmiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(byte age) {
		this.age = age;
	}
	 
	public String toString() {
		return String.format("[first name: %s] [Last Name: %s] [Middle Name: %s] [Gender: %s] [Age: %d]", firstName, lastName, middleName, gender, age );
	}
	
	
}
