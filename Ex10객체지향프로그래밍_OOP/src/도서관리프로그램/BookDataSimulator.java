package 도서관리프로그램;

import java.util.Scanner;

public class BookDataSimulator {

	public static void main(String[] args) {
		
		// 소통만
		
		Scanner sc = new Scanner(System.in);
//		ArrayList<Book> bookList = new ArrayList<Book>();
		System.out.println("=== 도서관리 시스템 ===");
		
		BookSystem bs = new BookSystem();
		
		int mode;
		while(true) {
			System.out.print("[1]도서 목록 [2]도서 입력 [3]도서 정보 수정 [4]종료 >> ");
			mode = sc.nextInt();
			
			
			String title;
			int price;
			String writer;
			
			int bookNum;
			int modifyMode;
			
			if(mode == 4) {
				System.out.println("시스템을 종료합니다.");
				break;
			}else if(mode == 1) {
				System.out.println(bs.getBookList());
			}else if(mode == 2) {
				// 도서 입력
				System.out.print("도서명 : ");
				sc.nextLine(); // 캐쉬 제거
				title = sc.nextLine();
				System.out.print("가격 : ");
				price = sc.nextInt();
				System.out.print("글쓴이 : ");
				sc.nextLine(); //캐쉬 제거
				writer = sc.nextLine();
				bs.addBook(title, price, writer);
			}else if(mode == 3) {
				//도서 목록 출력
				// 책 제목 출력
				System.out.println(bs.getBookTitleList());
				
				System.out.print("수정하고자 하는 도서 번호를 입력하세요 >> ");
				bookNum = sc.nextInt();
				System.out.println("수정하고자 하는 항목을 입력해주세요");
				System.out.print("[1]제목 [2]가격 [3]글쓴이 [4]종료");
				modifyMode = sc.nextInt();
				sc.nextLine(); //캐쉬 제거
				if(modifyMode == 1) {
					// 제목 수정
					System.out.print("제목 입력 >> ");
					bs.modifyTitle(bookNum, sc.nextLine());
				}else if(modifyMode == 2) {
					System.out.print("가격 입력 >> ");
					bs.modifyPrice(bookNum, sc.nextInt());
					sc.nextLine(); //캐쉬 제거
				}else if(modifyMode == 3) {
					System.out.print("글쓴이 입력 >> ");
					bs.modifyWriter(bookNum, sc.nextLine());
				}else {
					
					continue;
				}
	
				
			}else {
				System.out.println("올바른 숫자를 입력하세요.");
			}
			
			
			
			
			
			
		}

	}

}
