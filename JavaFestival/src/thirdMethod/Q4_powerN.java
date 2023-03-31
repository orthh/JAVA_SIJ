package thirdMethod;

public class Q4_powerN {

	public static void main(String[] args) {
		
		int base = 2;
		int n = 3;
		int result = powerN(base, n);
		System.out.println("결과 확인 : " + result);

	}
	
	public static int powerN(int num, int mulp) {
		int result = 1;
		for(int i=1; i<=mulp; i++) {
			result *= num;
		}
		
		return result;
	}

}
