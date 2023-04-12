package 링크드리스트;

import java.util.Scanner;


public class LinkedListMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		LinkList l = new LinkList();
		
		int menu;

		while(true) {
			System.out.print("[1]머리삽입 [2]꼬리삽입 [3]머리삭제 [4]꼬리삭제 [5]선택삭제 [6]전체삭제 [7]선택출력 [8]모두출력 [9]검색 [10]종료");
			menu = sc.nextInt();
			
			if(menu==1) {
				System.out.print("머리에 삽입할 값 입력 : ");
				l.addFirst(sc.next());
			}else if(menu==2) {
				l.addLast(sc.next());			
			}else if(menu==3) {
				l.removeFirst();
				System.out.println("머리삭제");
			}else if(menu==4) {
				l.removeLast();
				System.out.println("꼬리삭제");
			}else if(menu==5){
				l.removeCurrentNode();
				System.out.println("선택삭제");
			}else if(menu==6) {
				l.clear();
				System.out.println("모두삭제");
			}else if(menu==7) {
				l.printCurrentNode();
			}else if(menu==8){
				l.dump();
			}else if(menu==9) {
				System.out.println(l.search(sc.next()));
			}else if(menu==10) {
				break;
			}
		}	

	}

}
