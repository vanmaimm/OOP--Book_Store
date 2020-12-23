package model;

public class NormalUser extends User {
	public NormalUser(String user, String password, String name, int age, String gender, String phoneNumber,
			String email, String address) {
		super(user, password, name, age, gender, phoneNumber, email, address);

	}

	public NormalUser(String user, String password, String name, String phoneNumber, String email) {
		super(user, password, name, phoneNumber, email);

	}

	public NormalUser() {
	}
}
