package 도서관리프로그램;

import java.util.Scanner;

// 사용자와 상호소통하는 인터페이스 역할(결과출력, 입력 등)
public class Simulator {
	
	public static void main(String[] args) {
		System.out.println("=== 도서관리 시스템 ===");
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("[1]등록 [2]전체조회 [3]종료");
			int choice = sc.nextInt();
			
			if(choice == 1) {
				
			}else if(choice == 2) {
				
			}else if(choice == 3) {
				System.out.println("시스템을 종료합니다.");
			}else {
				System.out.println("올바른 숫자를 입력하세요.");
			}
		}
	}
}
