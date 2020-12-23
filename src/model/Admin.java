package model;

public class Admin extends User {

	public Admin() {
		super();
	}
	public Admin(String userName, String password) {
		this.userName = userName;
		this.password = password;
	}

	public String toString() {
		return "Name's Admin" + getName() + " , age: " + getAge() + " , Address: " + getAddress() + " ,Phone number: "
				+ getPhoneNumber();
	}
}
