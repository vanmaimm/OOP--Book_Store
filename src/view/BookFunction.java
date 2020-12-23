package view;

import java.util.Scanner;

import data.BookData;
import manager.BookManager;
import model.Book;

public class BookFunction {
	Scanner input = new Scanner(System.in);
	BookManager bookManager = new BookManager();

	public void showBookInStore() {
		System.out.println(" ================ BOOK IN STORE ======================");
		bookManager.displayAllBook();
	}

	public void searchBookByNameView() {
		showBookInStore();
		System.out.println("=========== SEARCH BOOK BY NAME ==============");
		System.out.println("Enter name's book you want find: ");
		String bookName = input.nextLine();
		int localBookInArray = bookManager.findLocalBookInArray(BookData.bookList, bookName);
		if (localBookInArray == -1) {
			System.out.println("Book isn't exit!");
		} else {
			System.out.println(BookData.bookList.get(localBookInArray).toString());
		}
		;
	}

	public void insertBookView() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter name's book:");
		String bookName = input.nextLine();
		if (bookManager.existBook(BookData.bookList, bookName)) {
			System.out.println("Name's book exist!");
			System.out.println("Do you want insert book again!");
			System.out.println("1. Yes");
			System.out.println("2. No");
			int choose = input.nextInt();
			if (choose == 1) {
				insertBookView();
			} // TO DO
		} else {
			System.out.println("Enter author's book:");
			String author = input.nextLine();
			System.out.println("Enter category's book:");
			String category = input.nextLine();
			System.out.println("Enter price's book:");
			double price = Double.parseDouble(input.nextLine());
			System.out.println("Enter quantity's book:");
			int quantity = Integer.parseInt(input.nextLine());
			Book newBook = bookManager.addBook(BookData.bookList.size(), bookName, author, category, price, quantity);
			BookData.bookList.add(newBook);
			System.out.println("SUCCESFUL!");
		}
	}

	public void removeBookView() {
		System.out.println("Enter name's book:");
		String bookName = input.nextLine();
		if (bookManager.checkRemoveBook(bookName)) {
			System.out.println("SUCCESFUL!");
		} else {
			System.out.println("The Book doesn't exist!");
		}
	}

}
