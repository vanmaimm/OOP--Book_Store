package model;

public abstract class User {
	protected String userName;
	protected String password;
	protected String name;
	protected int age;
	protected String gender;
	protected String phoneNumber;
	protected String email;
	protected String address;

	public User() {
	}

	public User(String userName, String password, String name, String phoneNumber, String email) {
		this.userName = userName;
		this.password = password;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.name = name;

	}

	public String getUserName() {
		return userName;
	}

	public User(String userName, String password, String name, int age, String gender, String phoneNumber, String email,
			String address) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.address = address;
		this.userName = userName;
		this.password = password;
	}

	public User(String userName, String password) {
		this.userName = userName;
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumer) {
		this.phoneNumber = phoneNumer;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String toString() {
		return "Information of user: " + "UserName: " + getUserName() + ", name: " + getName() + " ,email: "
				+ getEmail() + ", phone number: " + getPhoneNumber();
	}
}