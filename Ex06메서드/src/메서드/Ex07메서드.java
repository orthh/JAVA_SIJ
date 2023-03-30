package 메서드;

public class Ex07메서드 {

	public static void main(String[] args) {
		
		int num1 = 10;
		int num2 = 24;
		int result = largerNumber(num1, num2);
		System.out.println("큰 수 확인 : " + result);

	}
	
	public static int largerNumber(int num1, int num2) {
		//모든 경우에 대해서 return 값이 있어야 한다.

		return num1==num2 ? 0 : Math.max(num1, num2);
		
//		if(a == b) {
//			return 0;
//		}else {
//			return Math.max(a, b);
//		}
		
//		if(a > b) {
	//		return a;
	//	}else if(a < b) {
	//		return b;
	//	}else {
	//		return 0;
//		}
	}

}
