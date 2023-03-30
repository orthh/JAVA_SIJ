package 메서드;

public class Ex03매o리x {

	public static void main(String[] args) {
		
		sumPrint(1,2);
//		System.out.println(sumPrint(1,2)); 출력하는 기능을 출력하라는 코드 사용불가
		
	}

	
	//void : 리턴타임이 없습니다.
	//기능 자체를 가지고 있는 경우가 많다.
	public static void sumPrint(int num1, int num2) {
		System.out.println("결과값은 " + (num1+num2) + " 입니다.");
	}
}
