import java.util.Scanner;

public class Ex09배열실습_로그인 {
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//최대 3명 회원가입 가능
		int maxCount = 3;
		
		//로그인 체크
		boolean isLogined = false;
		
		String[] DB_id = new String[maxCount];
		String[] DB_pwd = new String[maxCount];
		
		int dbCount = 0;
		
		while(true) {
			//로그인 초기화
			isLogined = false;
			
			int mode;
			do {
				System.out.println("1.회원가입 2.로그인 3.종료");
				mode = sc.nextInt();
			} while (mode<=0 || mode >=4);
			
			
			
			if(mode == 3) {
				System.out.println("종료합니다.");
				break;
			}
			//출력물
			if(mode == 1) {
				System.out.println("===회원가입===");
			}else if(mode == 2) {
				System.out.println("===로그인===");
			}
			
			System.out.print("id 입력 : ");
			String userId = sc.next();
			System.out.print("pwd 입력 : ");
			String userPwd = sc.next();
			
			//로그인 로직 : 리팩토링 예정
			//mode 에 따라 회원가입로직 , 로그인로직
			if(mode == 1) {
				//max회원수 일 때
				if(dbCount >= DB_id.length) {
					System.out.println("최대 아이디 회원가입수를 넘었습니다.");
					continue;
				}
				//중복id 검사
				boolean isDuplicate = false;
				for(String item : DB_id) {
					if(userId.equals(item)) {
						System.out.println("중복된 ID입니다.");
						isDuplicate = true;
					}
				}
				//중복값일때
				if(isDuplicate) {
					continue;
				}else {
					DB_id[dbCount] = userId;
					DB_pwd[dbCount] = userPwd;
					System.out.println("가입 성공");
					dbCount ++ ;
				}
				
			}else if(mode == 2) {
				for(int i=0; i< DB_id.length; i++) {
					if(userId.equals(DB_id[i]) 
							&& userPwd.equals(DB_pwd[i])) {
						System.out.println("로그인 성공!");
						isLogined = true;
						break;
					}
				}
				if(isLogined ==false) {
					System.out.println("로그인 실패...");
				}
			}


		}

	}

	
}

