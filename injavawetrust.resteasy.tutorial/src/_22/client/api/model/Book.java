package _22.client.api.model;

public class Book {

	private String isbn;
	private String name;
	private int page;
	private double price;

	public Book() {
		super();
	}

	public Book(String isbn, String name, int page, double price) {
		super();
		this.isbn = isbn;
		this.name = name;
		this.page = page;
		this.price = price;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Book [isbn=" + isbn + ", name=" + name + ", page=" + page + ", price=" + price + "]";
	}

}
