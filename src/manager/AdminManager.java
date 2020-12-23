package manager;

import data.UserData;
import model.Admin;

public class AdminManager {

	public void adminAccountData() {
		UserData.userList.add(new Admin("admin1", "test@321"));
		UserData.userList.add(new Admin("admin2", "test@123"));
	}

	public boolean checkAdminLogin(String account, String password) {
		for (int i = 0; i < UserData.userList.size(); i++) {
			if (account.equals(UserData.userList.get(i).getUserName())
					&& password.equals(UserData.userList.get(i).getPassword())) {
				return true;
			}
		}
		return false;
	}

}
