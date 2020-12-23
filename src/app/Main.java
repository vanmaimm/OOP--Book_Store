package app;

import manager.AdminManager;
import manager.BookManager;
import manager.UserManager;
import view.BookFunction;
import view.ManageBookRun;
import view.MenuRun;
import view.SystemRun;

public class Main {
	public static void main(String[] args) {
		BookManager bookManager= new BookManager();
		bookManager.bookData();
		AdminManager admin = new AdminManager();
		admin.adminAccountData();
		UserManager user= new UserManager();
		user.userAccountData();
		SystemRun sysRun= new SystemRun();
		sysRun.systemRun();		
	}
}
