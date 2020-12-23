package view;

import java.util.Scanner;

public class ManageBookRun {
	Screen screen = new Screen();

	public void manageBookRun() {
		SystemRun sysRun = new SystemRun();
		BookFunction bookFunction = new BookFunction();
		Exit exit = new Exit();
		final int ADD_BOOK = 1;
		final int REMOVE_BOOK = 2;
		final int SEARCH_BOOK = 3;
		final int DISPLAY_BOOK = 4;
		final int LOGOUT = 5;
		final int EXIT = 6;
		int check, c;
		do {
			screen.titleForm();
			screen.managerBookForm();
			Scanner input = new Scanner(System.in);
			do {
				check = Integer.parseInt(input.nextLine());
				switch (check) {
				case ADD_BOOK: {
					bookFunction.insertBookView();
					break;
				}
				case REMOVE_BOOK: {
					bookFunction.removeBookView();
					break;
				}
				case SEARCH_BOOK: {
					bookFunction.searchBookByNameView();
					break;
				}
				case DISPLAY_BOOK: {
					bookFunction.showBookInStore();
					break;
				}
				case LOGOUT: {
					sysRun.systemRun();
				}
				case EXIT: {
					if(exit.exit()!=1) {
						manageBookRun();
					}
				}
				default: {
					screen.titleForm();
					screen.managerBookForm();
					System.out.println("Please choose 1 to 6");
					break;
				}
				}

			} while (check < 1 || check > 6);
			System.out.println("===Choose 1(exit)--------choose 2(Come back)===");
			c = Integer.parseInt(input.nextLine());
			if (c == 1) {
				System.exit(0);
			}
		} while (c != 1);
	}
}
