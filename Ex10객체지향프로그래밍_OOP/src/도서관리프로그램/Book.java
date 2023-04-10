package 도서관리프로그램;

// 책을 표현하는 클래스
public class Book {
	private String title;
	private int price;
	private String writer;
	
	public Book(String title, int price, String writer) {
		super(); // 상속 관련 개념 자동호출
		this.title = title;
		this.price = price;
		this.writer = writer;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}
	

	
}
