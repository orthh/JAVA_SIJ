import java.util.Scanner;

public class Ex09배열실습_로그인 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//최대 3명 회원가입 가능
		int maxCount = 3;
		
		int[] DB_id = new int[maxCount];
		int[] DB_pwd = new int[maxCount];
		
		while(true) {
			System.out.println("1.회원가입 2.로그인 3.종료");
			int mode = sc.nextInt();
			
			
			if(mode == 1) {
				System.out.println("===회원가입===");
				
				System.out.print("id 입력 : ");
				String userId = sc.next();
				System.out.print("pwd 입력 : ");
				String userPwd = sc.next();
				
			}else if(mode ==2) {
				
			}else{
				System.out.println("종료합니다.");
				break;
			}

		}
		//로그인모듈

	}

}
