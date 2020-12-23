package view;

import java.util.Scanner;

public class SystemRun {
	Screen screen = new Screen();
	AdminFunction admin = new AdminFunction();
	UserFunction user = new UserFunction();
	final int ADMIN = 1;
	final int USER = 2;
	final int EXIT = 3;

	public void systemRun() {
		screen.titleForm();
		screen.userTypeForm();
		int check;
		do {
			Scanner input = new Scanner(System.in);
			check = Integer.parseInt(input.nextLine());
			
			switch (check) {
			case ADMIN: {
				admin.loginView();
				break;
			}
			case USER: {
				user.loginView();
				break;
			}
			case EXIT: {
				break;
			}
			default: {
				screen.titleForm();
				screen.userTypeForm();
				System.out.println("Please choose from 1 to 3");
				break;
			}
			}
		} while (check < 1 || check > 3);
	}
}
