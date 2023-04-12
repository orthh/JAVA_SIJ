package 큐;

import java.util.Scanner;

public class IntQueueMainYJ {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		IntQueueYJ q = new IntQueueYJ(5);
		
		int menu;

		while(true) {
			System.out.print("[1]인큐 [2]디큐 [3]피크 [4]덤프 [5]비우기 [6]위치 찾기 [7]데이터 개수 [8]종료");
			menu = sc.nextInt();
			
			if(menu==1) {
				System.out.print("인큐 할 값 입력 : ");
				q.enque(sc.nextInt());
			}else if(menu==2) {
				if(!q.isEmpty()) {
					System.out.println("팝한 값 : "+ q.deque());
				}else {
					System.out.println("큐가 비었습니다!");
				}			
			}else if(menu==3) {
				if(!q.isEmpty()) {
					System.out.println("피크 값 : "+ q.peek());
				}else {
					System.out.println("큐가 비었습니다!");
				}
			}else if(menu==4) {
				q.dump();
			}else if(menu==5){
				if(!q.isEmpty()) {
					q.clear();
				}else {
					System.out.println("큐가 비었습니다!");
				}
			}else if(menu==6) {
				System.out.println("찾을 값 입력 : ");
				int input = sc.nextInt();
				System.out.println("위치 : "+ q.indexOf(input));
			}else if(menu==7) {
				System.out.println("값 개수 :"+ q.size());
			}else {
				break;
			}
		}

	}

}
