package _22.client.api.model;

public class Book {

	private String ISBN;
	private String name;
	private int page;
	private double price;

	public Book() {
		super();
	}

	public Book(String ISBN, String name, int page, double price) {
		super();
		this.ISBN = ISBN;
		this.name = name;
		this.page = page;
		this.price = price;
	}

	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String ISBN) {
		this.ISBN = ISBN;
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
		return "Book [ISBN=" + ISBN + ", name=" + name + ", page=" + page + ", price=" + price + "]";
	}

}
