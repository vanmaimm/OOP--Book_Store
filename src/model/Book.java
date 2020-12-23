package model;

public class Book {

	private int id;
	private String name;
	private String author;
	private String category;
	private double price;
	private int quantity;

	public Book() {
	}

	public Book(String name, String author, String category, double price, int quantity) {
		this.name = name;
		this.author = author;
		this.category = category;
		this.price = price;
		this.quantity = quantity;
	}

	public Book(int id, String name, String author, String category, double price, int quantity) {
		this.id = id;
		this.name = name;
		this.author = author;
		this.category = category;
		this.price = price;
		this.quantity = quantity;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String toString() {
		return "IdBook: " + getId() + ", Name's Book:" + getName() + ", Author:" + getAuthor() + ", category:"
				+ getCategory() + ", price:" + getPrice();
	}

}
