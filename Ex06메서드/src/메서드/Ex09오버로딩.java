package 메서드;

public class Ex09오버로딩 {

	public static void main(String[] args) {
		
		//sum2()
		
		sum2(3, 5);
		sum3(3, 5, 7);
		//같은기능(더하기) == 같은이름
		//오버로딩(overloading) == 중복정의
		// : 같은 클래스 내에서 동일한 이름으로 메서드를 정의 할 수 있다!
		// 단, 매개변수의 형태가 달라야 한다!
		// 형태 --> 개수, 자료형이 달라야한다.
		// 대표적인 예 : println(문자열), println(숫자)

		// 상속 : 오버라이딩 == 재정의
		
		//오버라이딩, 오버로딩 구분 방법 : 글자수 합 8
	}
	
	//sum2()
	public static void sum2(int num1, int num2) {
		System.out.println(num1 + num2 );
	}

	//sum3()
	public static void sum3(int num1, int num2, int num3) {
		System.out.println(num1 + num2 + num3);
	}
	
}
