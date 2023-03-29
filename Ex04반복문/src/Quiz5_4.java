import java.util.Scanner;

public class Quiz5_4 {

	public static void main(String[] args) {
		
		String dataId = "test123";
		String dataPwd = "abc123" ;
		
		
		Scanner sc = new Scanner(System.in);

		String inputId, inputPwd;
		
		boolean isLogined = false;
		
		int tried = 3;
		do {
			System.out.print("아이디 : ");
			inputId = sc.nextLine();
			System.out.print("비밀번호 : ");
			inputPwd = sc.nextLine();
			
			if(dataId.equals(inputId) && dataPwd.equals(inputPwd)) {
				isLogined = true;
				break;
			}
			
			System.out.println("로그인 실패");
			if(tried <= 1) break;
			System.out.print("계속 하시겠습니까(Y)? ");
			String inputIsCtn = sc.nextLine();
			
			if(inputIsCtn.equals("Y")) {
			}else{
				System.out.println("종료");
				break;
			}
			tried--;
		} while (tried > 0);
		if(tried <= 1) System.out.println("본인인증을 해주세요.");
		if(isLogined) System.out.println("로그인 성공");
	}

}
