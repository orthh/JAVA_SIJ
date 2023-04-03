import java.util.Scanner;

public class Ex09로그인강사님 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int menu; //변수선언
		String id; //현재 사용자의 아이디
		String pw; //현재 사용자 패스워드
		int cnt = 0; //현재 회원가입한 사용자 카운팅
		boolean sw = true;
		
		String[] idArray = new String[3];
		String[] pwArray = new String[3];
		
		
		while(true) {
			System.out.println("1. 회원가입 2.로그인 3.종료");
			menu = sc.nextInt();
			
			//테스트
			System.out.print("아이디 : ");
			for(String item : idArray) {
				System.out.print(item + "\t");
			}
			System.out.print("패스워드 : ");
			for(String item : pwArray) {
				System.out.print(item + "\t");
			}
			System.out.println();
			
			if(menu == 1) { //회원가입
				if(cnt == 3) {
					System.out.println("회원가입 불가!");
				}else {
					System.out.print("ID : ");
					idArray[cnt] = sc.next();
					System.out.println("PW : ");
					pwArray[cnt] = sc.next();
					cnt++;
					
				}


				
			}else if(menu == 2) { //로그인
				System.out.print("ID : ");
				id = sc.next();
				System.out.println("PW : ");
				pw = sc.next();
				
				for(int i=0; i<cnt; i++) {
					if(idArray[i].equals(id)
							&&pwArray[i].equals(pw)) {
						System.out.println("로그인 성공 ! ");
						sw = false;
						break;
					}
				}
			}else { //종료
				System.out.println("종료합니다.");
				break;
			
			}
		}
	}

}
