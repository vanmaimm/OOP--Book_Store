package view;

import java.util.Scanner;

import manager.AdminManager;

public class AdminFunction {
	AdminManager admin = new AdminManager(); 
	ManageBookRun book = new ManageBookRun();
	public void loginView() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter admin name: ");
		String name = input.next();
		System.out.println("Enter password: ");
		String pass = input.next();
		if (admin.checkAdminLogin(name, pass)) {
			System.out.println("Login is successful! ");
			book.manageBookRun();
		} else {
			System.out.println("Username or password wrong!");
			System.out.println("Do you want insert book again!");
			System.out.println("1. Yes");
			System.out.println("2. No");
			int choose = input.nextInt();
			if (choose == 1) {
				loginView();
			} 
		}
	}
}
