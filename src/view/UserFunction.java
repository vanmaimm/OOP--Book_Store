package view;

import java.util.Scanner;

import data.BookData;
import data.UserData;
import manager.UserManager;
import model.Book;

public class UserFunction {
	static String userName;
	UserManager userManager = new UserManager();
	MenuRun menu = new MenuRun();
	public void loginView() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter user name: ");
		String name = input.next();
		System.out.println("Enter password: ");
		String pass = input.next();
		if (userManager.checkUserLogin(name, pass)) {
			System.out.println("Login is successful! ");
			userName = name;
			menu.menuRun();
		} else {
			System.out.println("Username or password wrong!");
		}
	}

	public void changePasswordView() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your password!");
		String pass = input.next();
		for (int i = 0; i < UserData.userList.size(); i++) {
			if (userName.equals(UserData.userList.get(i).getUserName())) {
				if (userManager.rightPassword(i, pass)) {
					System.out.println("Enter new password: ");
					String newPass = input.next();
					userManager.changePassword(i, newPass);
				} else {
					System.out.println("Password is wrong!");
				}
			}
		}
	}
}
