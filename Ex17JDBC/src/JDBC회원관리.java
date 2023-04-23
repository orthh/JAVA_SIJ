import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class JDBC회원관리 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {	
		
		Scanner sc = new Scanner(System.in);
		UserDAO dao = new UserDAO();
		// (1)로그인 (2)회원가입 (3)닉네임 조회 (4)종료
		// 4번을 누르기 전까지 1,2,3 메뉴를 계속 선택할 수 있도록 만들어주세요!
		
		int mode;
		String inputId = null;
		String inputPw = null;
		String inputNick = null;
		while(true) {
			do {
				System.out.print("(1)로그인 (2)회원가입 (3)전체 회원 조회 (4)종료 >> ");
				mode = sc.nextInt();
			} while (mode <=0 || mode >=5);
			if( mode == 4) {
				System.out.println("시스템 종료");
				break;
			}
			else if( mode == 1) {
				// 로그인
				System.out.println("====로그인====");
				System.out.print("아이디 입력 >> ");
				inputId = sc.next();
				System.out.print("패스워드 입력 >> ");
				inputPw = sc.next();
				
				String result = dao.Login(inputId, inputPw);
				if(result != null) {
					System.out.println("'" + result + "님 환영합니다'");
				}else {
					System.out.println("아이디나 비밀번호가 일치하지 않습니다.");
				}
				
				
			}
			else if( mode == 2) {
				// 회원가입
				// id, pw, nick 을 사용자로부터 입력 받아서 member테이블에 저장해주세요!
				System.out.println("====회원가입====");
				System.out.print("아이디 입력 >> ");
				inputId = sc.next();
				System.out.print("패스워드 입력 >> ");
				inputPw = sc.next();
				System.out.print("닉네임 입력 >> ");
				inputNick = sc.next();
				
				int result = dao.join(inputId, inputPw, inputNick);
				if( result > 0) {
					System.out.println("회원가입 성공");
				}else {
					System.out.println("회원가입 실패");
				}
			}
			else if( mode == 3) {
				// 닉네임 조회
				// ID : 승환 PW : 123 NICK : 점심짜장저녁냉면
				// ID : 22 PW : 123 NICK : 점심짜장저녁냉면
				// ID : 승21환 PW : 123 NICK : 점심짜장저녁냉면
				
				System.out.println("====전체 회원 조회====");
				ArrayList<UserDTO> userList = dao.getAllMember();
				userList.forEach(item -> {
					System.out.printf("ID : %-13s PW : %-13s NICK : %-13s"
							,item.getId(), item.getPw(), item.getNick());
					System.out.println();
				});
				
			}
			
			
		}
		
		
	}

}
