package 도서관리프로그램;

import java.util.ArrayList;

// 책을 관리하는 클래스(등록, 책정보 확인, 수정 등....)
public class BookSystem {
	
	private ArrayList<Book> bookList = new ArrayList<Book>();
	
	// 책 등록 기능
	public void addBook(String title, int price, String writer) {
		Book book = new Book(title,price,writer);
		bookList.add(book);
	}
	
	// 책 전체 조회
	public String getBookTitleList() {
		String msg = "";
		for(int i=0; i<bookList.size(); i++) {
			Book temp = bookList.get(i);
			msg += i + 1 + "번 - 제목 : ";
			msg += temp.getTitle();
			msg += "\n";
		}
		return msg;
	}
	
	public String getBookList() {
		String msg = "";
		for(int i=0; i<bookList.size(); i++) {
			Book temp = bookList.get(i);
			msg += i + 1 + "번 - 제목 : ";
			msg += temp.getTitle();
			msg += " 가격 : ";
			msg += temp.getPrice();
			msg += " 글쓴이 : ";
			msg += temp.getWriter();
			msg += "\n";
		}
		return msg;
	}
	
	public void modifyTitle(int idx, String title) {
		bookList.get(idx - 1).setTitle(title);
	}
	public void modifyPrice(int idx, int price) {
		bookList.get(idx - 1).setPrice(price);
	}
	public void modifyWriter(int idx, String writer) {
		bookList.get(idx - 1).setWriter(writer);
	}
	
}
