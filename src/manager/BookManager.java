package manager;

import java.util.ArrayList;

import data.BookData;
import model.Book;

public class BookManager {
	// data book
	public void bookData() {
		BookData.bookList.add(new Book(BookData.bookList.size(), "Tony buoi sang", "abc", "life", 5860, 1));
		BookData.bookList.add(new Book(BookData.bookList.size(), "Love", "tony", "romantic", 123, 23));
		BookData.bookList.add(new Book(BookData.bookList.size(), "Tomorrow", "abc", "life", 5680, 19));
		BookData.bookList.add(new Book(BookData.bookList.size(), "Singer is better", "tony", "romantic", 1243, 2));
		BookData.bookList.add(new Book(BookData.bookList.size(), "Beautiful girl", "abc", "life", 123, 45));
		BookData.bookList.add(new Book(BookData.bookList.size(), "Connan", "tony", "romantic", 1253, 2));
		BookData.bookList.add(new Book(BookData.bookList.size(), "Frozen", "abc", "life", 1323, 7));
		BookData.bookList.add(new Book(BookData.bookList.size(), "Beaty and the monster", "tony", "romantic", 123, 2));
	}

	public void displayAllBook() {
		for (int i = 0; i < BookData.bookList.size(); i++) {
			System.out.println(BookData.bookList.get(i).toString());
		}
	}

	public Book addBook(int id, String nameOfBook, String author, String category, double price, int quantity) {
		Book newBook = new Book();
		newBook.setId(BookData.bookList.size());
		newBook.setName(nameOfBook);
		newBook.setAuthor(author);
		newBook.setCategory(category);
		newBook.setPrice(price);
		newBook.setQuantity(quantity);
		return newBook;
	}

	public boolean checkRemoveBook(String name) {
		if (findLocalBookInArray(BookData.bookList, name) != -1) {
			BookData.bookList.remove(findLocalBookInArray(BookData.bookList, name));
			return true;
		}
		return false;
	}

	// Find book in list
	public boolean existBook(ArrayList<Book> bookList, String name) {
		int i;
		for (i = 0; i < bookList.size(); i++) {
			if (name.equals(bookList.get(i).getName())) {
				return true;
			}
		}
		return false;
	}

	// find local of book in array list
	public int findLocalBookInArray(ArrayList<Book> bookList, String name) {
		int i;
		for (i = 0; i < bookList.size(); i++) {
			if (name.equals(BookData.bookList.get(i).getName())) {
				return i;
			}
		}
		return -1;
	}
}
