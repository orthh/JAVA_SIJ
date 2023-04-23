import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class JDBC회원가입 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("직원 이름 입력>>");
		String inputName = sc.next();
		System.out.print("비밀번호 입력>>");
		String inputPw = sc.next();
		System.out.print("성별 입력>>");
		String inputGender = sc.next();
		System.out.print("나이 입력>>");
		int inputAge = sc.nextInt();
		System.out.print("연봉 입력>>");
		int inputMoney = sc.nextInt();
		
		
		
		//
		String temp = "";
		
		// 1. DB 연결
		Connection conn = null;

		// 쿼리문을 실행시키는 객체
		// Java 에서 문자열로된 쿼리문을 Oracle 의 쿼리문으로 바꿔서 실행시켜준다!
		PreparedStatement pstm = null;

		// 쿼리문을 통해서 발생한 응답을 담을 수 있는 객체
		ResultSet rs = null;

		try { // forName 매개변수 이름의 Class를 가져온다.
				// DB 연결할 수 있는 외부 클래스 가져오기!
			Class.forName("oracle.jdbc.driver.OracleDriver");

			// 연결시 필요한 값 (url, id, pw)
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String id = "service";
			String pw = "---";

			// oracledb 에서 id,pw 치고 엔터친거
			// DriverManager --> DB랑 연결
			// -> JAVA, DB 통로

			conn = DriverManager.getConnection(url, id, pw);
			System.out.println("접속 성공");

		} catch (ClassNotFoundException | SQLException e) {
			System.out.println("접속 실패");
			e.printStackTrace();
		}

		// 2. 접속후 실행하고 싶은 쿼리문 실행!
		try {
			//(1) 나이가 40살이상인 직원의 이름만 출력 시켜 주세요
			//(2) 위에서 입력받은 name,pw를 이용해서
			// 해당하는 직원의 나이 출력해주세요
//			String sql = "select 이름, 나이 FROM 직원 where 이름 = ";
//			sql += "'"+inputName+"'"; 
//			sql += " AND 비밀번호 = ";
//			sql += "'"+inputPw+"'";
			
			// 강사님 - 2가지 방법
			//1.
//			String sql = "select * from 직원";
			//2.
			// 이거 선호. 그냥 다 가져오면 시간이 너무걸림.
//			String sql = "SELECT * FROM 직원 WHERE 이름 = '" 
//					+ inputName + "' AND 비밀번호 = " + inputPw;
//			
			
			
			//베스트
//			String sql = "SELECT * FROM 직원 WHERE 이름  = ? AND 비밀번호 = ? ";
			// 문제(3) : 이름, 비밀번호, 성별, 나이, 연봉  입력받아서
			//         데이터를 추가 하고싶습니다!
			String sql = "insert into 직원 values ('A0011',?,?,?,?,null,'123-123',?,'D006')";
			
			//insert into 직원 values (직원id_seq.nextval,'1234','승환','남',20,null,'123-123',3000,'D006');
			
			// db 에서 필터링 하는게 더 안전할듯?
//			String sql = "select 이름 from 직원 where 나이 >= '40'";
//			String sql = "select * from 직원";
			pstm = conn.prepareStatement(sql);
			// 넣고싶은 데이터
//			pstm.setString(1, inputName);
//			pstm.setString(2, inputPw);
			// 3번 문제
			pstm.setString(1, inputPw);
			pstm.setString(2, inputName);
			pstm.setString(3, inputGender);
			pstm.setInt(4, inputAge);
			pstm.setInt(5, inputMoney);
			
			// executeUpdate 는 데이터 변경이 있을시 사용.
			// insert, update, delete 같이 데이터 변경이 있을때 사용
			// return type : int -> 변경된 행의 갯수 반환
			int result = pstm.executeUpdate();
			if(result > 0) {
				System.out.println("회원가입 성공!");
			}else {
				System.out.println("변경된 구문 없음");
			}
			
			// executeQuery는 데이터를 가져올때 사용 ex: select 등 데이터 변경이 없을때 사용.
//			rs = pstm.executeQuery();
			
			//2. DB 처리할 때
//			if(rs.next()) {
//				int age = rs.getInt("나이");
//				System.out.println(age);
//			}

			// 다음 row 가 있으면 rs.next() true
//			while (rs.next()) {
////				String name = rs.getString("이름");
////				String age = rs.getString("나이");
////				// == String name = rs.getString(1);
//////				System.out.print(name);
//////				System.out.print(age);
////				temp += name + " " + age;
//				// 2-1
//				if(rs.getString("이름").equals(inputName) && rs.getString("비밀번호").equals(inputPw)){
//					int age = rs.getInt("나이");
//					System.out.println(age);
//				}
//
//				// rs.getString(컬럼명)
////				if(rs.getInt("나이")>=40) {
////					// getString("이름") 이름 컬럼에서 문자열데이터(이름)을 가져오겠습니다.
////					// getString(인덱스) DB에서 인덱스를 사용할때는 1부터 적용 된다!
////					String name = rs.getString("이름");
////					System.out.println(name);
////				}
//				// rs.getInt(5) 를 써서 인덱스로 가져왔으므로 * 또는 5번인덱스까지 가져와야함
//				// 인덱스로 가져오는거 안좋은듯
////				if (rs.getInt(5) >= 40) {
////					// getString("이름") 이름 컬럼에서 문자열데이터(이름)을 가져오겠습니다.
////					// getString(인덱스) DB에서 인덱스를 사용할때는 1부터 적용 된다!
////					String name = rs.getString("이름");
////					System.out.println(name);
////				}
//				//
////				String name = rs.getString("이름");
////				System.out.println(name);
//			}

//			if(rs.next()) {
//				String name = rs.getString("이름");
//				System.out.println(name);
//			}
		} catch (SQLException e) {
			System.out.println("쿼리문 오류");
			e.printStackTrace();
		}
		System.out.println(temp);
		
		// 3. DB 연결 제거 --> 역순!

		try {
			if (rs != null) {
				rs.close();
			}
			if (pstm != null) {
				pstm.close();
			}
			if (conn != null) {
				conn.close();
			}
			
			// 임의 추가
			if ( temp != null) {
				temp = "";
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
