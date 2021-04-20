package mc.sn.homework2;

public class BookDTO {
	private int isbn;
	private String title;
	private String author;
	private String publisher;
	private int price;
	private String desc;
	
	public int getisbn() {
		return isbn;
	}
	public void setisbn(int isbn) {
		this.isbn = isbn;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.isbn+"\t| "+this.title+"\t| "+this.author+"\t| "+this.publisher+"\t| "+this.price+"\t| "+this.desc;
	}
	
	
	
}
