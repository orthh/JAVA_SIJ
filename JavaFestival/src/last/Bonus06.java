package last;

public class Bonus06 {

	public static void main(String[] args) {
		
		int base = 3;
		int n = 3;
		int result = powerN(base,n);
		System.out.println("결과 확인 : "+ result);
		

	}
	
	public static int powerN(int base, int n) {
		int result = 1;
		for(int i=0; i<n; i++) {
			result *= base;
		}
		return result;
		
	}

}
