import java.util.Scanner;

public class Ex05IfElse정처기 {
	static void isPass(boolean a) {
		System.out.println(a ? "합격" : "불합격");
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int exam01,exam02,exam03,exam04,exam05;
		
		System.out.print("소프트웨어 설계 : ");
		exam01 = sc.nextInt();
		
		System.out.print("소프트웨어 개발 : ");
		exam02 = sc.nextInt();
		
		System.out.print("데이터베이스 구축 : ");
		exam03 = sc.nextInt();
		
		System.out.print("프로그래밍 언어 활용 : ");
		exam04 = sc.nextInt();
		
		System.out.print("정보시스템 구축 관리 : ");
		exam05 = sc.nextInt();
		
		if(exam01 < 8 || exam02 < 8 || exam03 < 8 
				|| exam04 < 8 || exam05 < 8) {
			isPass(false);
		}else {
			if(exam01 + exam02 + exam03
					+ exam04 + exam05 >= 60) {
				isPass(true);
			}else {
				isPass(false);
			}
		}
	}

}
