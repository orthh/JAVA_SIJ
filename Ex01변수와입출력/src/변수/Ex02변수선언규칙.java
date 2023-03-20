package 변수;

public class Ex02변수선언규칙 {

	public static void main(String[] args) {
		
		//대소문자 구분됨
		int a = 3;
		int A = 3;
		
	
		//숫자로 시작 불가
//		int 1a = 2; error
		
		//특수문자는 _,$만 가능
		int _$A = 1;
		int A55$$ = 2;
//		int A$# = 3; error
		
		//변수명에 한글 사용 가능(권장x)
		int 변수;
		
		//변수명 네이밍 규칙
		//1. 헝가리안 표기법 : 자료형을 접두어로 붙이는 방식
		int intNum;
		int iNum;
		double dNum;
		String sStr;
		
		//2. 카멜 표기법 : 일반적으로 변수명 규칙으로 많이 사용
		int myNum;
		
		//3. 파스칼 표기법 : 클래스명, 프로젝트명 규칙으로 많이 사용
		int MyNumber;
		
		//4. 스네이크 케이스(언더바 표기법) : 상수명 규칙으로 많이 사용
		final int MY_NUMBER;
		
		
		char AAA = 'B';
		System.out.println(AAA);
		
		
	}
}
