package manager;

import data.UserData;
import model.NormalUser;

public class UserManager {

	public void userAccountData() {
		UserData.userList.add(new NormalUser("user1", "test@321", "van mai", "0377920586", "van.mai@gmail.com"));
		UserData.userList.add(new NormalUser("user2", "test@321", "nhang dang", "0353726851", "nhang.dang@gmail.com"));
	}

	public boolean checkUserLogin(String userName, String password) {

		for (int i = 0; i < UserData.userList.size(); i++) {
			if (userName.equals(UserData.userList.get(i).getUserName()) && password.equals(UserData.userList.get(i).getPassword())) {
				return true;
			}
		}
		return false;
	}

	public NormalUser addUser(String username, String password, String name, String phoneNumber, String email) {
		NormalUser user = new NormalUser();
		user.setUserName(username);
		user.setPassword(password);
		user.setName(name);
		user.setPhoneNumber(phoneNumber);
		user.setEmail(email);
		return user;
	}

	public boolean rightPassword(int localOfUser, String password) {
		if (password.equals(UserData.userList.get(localOfUser).getPassword())) {
			return true;
		}
		return false;
	}

	public void changePassword(int localOfUser, String newPassword) {
		UserData.userList.get(localOfUser).setPassword(newPassword);
		System.out.println("Change successful!");
	}

}
