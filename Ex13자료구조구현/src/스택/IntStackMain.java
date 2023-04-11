package 스택;

import java.util.Scanner;

public class IntStackMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		IntStack s = new IntStack(5);

		int menu;
		while (true) {
			System.out.print("[1]푸시 [2]팝 [3]피크 [4]덤프 [5]비우기 [6]위치 찾기 [7]데이터 개수 [8]종료 >> ");
			menu = sc.nextInt();
			if (menu == 1) { // push
				if (!s.isFull()) { // 가득 차있지 않을때!
					System.out.print("푸쉬할 값 입력 : ");
					int num = sc.nextInt();
					s.push(num);
				} else { // 가득차있을때
					System.out.println("스택이 가득차있습니다.");
				}

			} else if (menu == 2) { // pop
				if (!s.isEmpty()) { // 비어있지 않을때
					System.out.println("제거된 값: " + s.pop());
				} else { // 비어있을때
					System.out.println("스택이 비어있습니다.");
				}
			} else if (menu == 3) { // peek
				if (!s.isEmpty()) { // 비어있지 않을때
					System.out.println("peek값: " + s.peek());
				} else { // 비어있을때
					System.out.println("스택이 비어있습니다.");
				}
			} else if (menu == 4) { // dump
				s.dump();
			} else if (menu == 5) { // clear
				if (!s.isEmpty()) { // 비어있지 않을때
					s.clear();
					System.out.println("스택을 비웠습니다.");
				} else { // 비어있을때
					System.out.println("스택이 비어있습니다.");
				}
			} else if (menu == 6) { // indexOf
				if (!s.isEmpty()) { // 비어있지 않을때
					System.out.print("찾고싶은 값 입력 : ");
					int num = sc.nextInt();
					System.out.println("위치 : " + s.indexOf(num));
					
				} else { // 비어있을때
					System.out.println("스택이 비어있습니다.");
				}
			} else if (menu == 7) {
				System.out.println("데이터 개수 : " + s.size());
			} else if (menu == 8) {
				break;
			}
		}

	}

}
