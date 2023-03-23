import java.util.Scanner;

public class Ex01If문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
//		System.out.print("나이 입력 : ");
//		int age = sc.nextInt();
//		
//		if(age >=20) {
//			System.out.println("성인입니다");
//		}
//		System.out.println("맨 아랫줄!");
//		
//		if(true) {
//
//			System.out.println("test");
//			
//		}
		
		System.out.print("숫자 입력 : ");
		int num = sc.nextInt();
		
		if(num % 3 == 0 || num % 5 ==0) {
			System.out.println("3 또는 5의 배수입니다");
		}
		
		System.out.print("JAVA점수입력 : ");
		int scoreJava = sc.nextInt();
		
		System.out.print("Python점수입력 : ");
		int scorePython = sc.nextInt();
		
		System.out.print("Android점수입력 : ");
		int scoreAndroid = sc.nextInt();
		
		int sum = scoreJava + scorePython + scoreAndroid;
		double avg = (double)sum / 3 ;
		
		if(avg > 80) {
			System.out.println("합격");
		}else {
			System.out.println("불합격");
		}
		
		System.out.println("맨아랫줄");
	}

}
