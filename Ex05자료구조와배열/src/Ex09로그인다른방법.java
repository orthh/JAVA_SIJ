import java.util.Scanner;

public class Ex09로그인다른방법 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//최대 3명 회원가입 가능
		int maxCount = 3;

		String[] DB_id = new String[maxCount];
		String[] DB_pwd = new String[maxCount];
		
		int dbCount = 0;
		
		
		while(true) {
			int mode = 0;
			String userId;
			String userPwd;
			do {
				System.out.println("1.회원가입 2.로그인 3.종료");
				mode = sc.nextInt();
			} while (mode<=0 || mode >=4);
			
			if(mode ==1 ) {
				System.out.println("===회원가입===");
				System.out.print("id 입력 : ");
				userId = sc.next();
				System.out.print("pwd 입력 : ");
				userPwd = sc.next();
				
				if(dbCount >= DB_id.length) {
					System.out.println("회원가입 가능수 초과");
					continue;
				}else {
					DB_id[dbCount] = userId;
					DB_pwd[dbCount] = userPwd;
					System.out.println("회원가입 성공");
					dbCount ++ ;
					continue;
				}
			}else if(mode == 2) {
				System.out.println("===로그인===");
				System.out.print("id 입력 : ");
				userId = sc.next();
				System.out.print("pwd 입력 : ");
				userPwd = sc.next();
				
				for(int i=0; i<DB_id.length; i++) {
					if(userId.equals(DB_id[i])
							&& userPwd.equals(DB_pwd[i])) {
						System.out.println("로그인 성공");
						break;
					}else {
						if(i >= DB_id.length -1) {
							System.out.println("로그인 실패");
						}
					}
				}
				
			}else {
				System.out.println("종료합니다.");
				break;
			}
			
			

		}
	}

}
