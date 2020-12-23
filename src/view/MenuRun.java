package view;

import java.util.Scanner;

public class MenuRun {
	Screen screen = new Screen();
	public void menuRun() {
		SystemRun sysRun = new SystemRun();
		BookFunction bookFunction = new BookFunction();
		UserFunction user = new UserFunction();
		Exit exit = new Exit();
		final int CHANGE_PASSWORD = 1;
		final int DISPLAY_BOOK = 2;
		final int SEARCH_BOOK = 3;
		final int LOGOUT = 4;
		final int EXIT = 5;
		int check, c;
		do {
			screen.titleForm();
			screen.menuForm();;
			Scanner input = new Scanner(System.in);
			do {
				check = Integer.parseInt(input.nextLine());
				switch (check) {
				case CHANGE_PASSWORD: {
					user.changePasswordView();
					break;
				}
				case DISPLAY_BOOK: {
					bookFunction.showBookInStore();
					break;
				}
				case SEARCH_BOOK: {
					bookFunction.searchBookByNameView();
					break;
				}
				case LOGOUT: {
					sysRun.systemRun();
					break;
				}
				case EXIT: {
					if(exit.exit()!=1) {
						menuRun();
					}
					break;
				}
				default: {
					screen.titleForm();
					screen.menuForm();
					System.out.println("Please choose 1 to 5");
					break;
				}
				}

			} while (check < 1 || check > 5);
			System.out.println("===Choose 1(exit)--------choose 2(Come back)===");
			c = Integer.parseInt(input.nextLine());
			if (c == 1) {
				System.exit(0);
			}
		} while (c != 1);
	}
}
