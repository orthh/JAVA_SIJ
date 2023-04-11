
public class Fibonacci {

	public static void main(String[] args) {
		
		for(int i=1; i<10; i++) {
			System.out.print(fibonacci(i) + " ");
		}

	}
	
	public static int fibonacci(int num) {
		int result = 0;
		if(num == 1 || num == 2) {
			result = 1;
		}else if(num >=3) {
			return fibonacci(num - 2) + fibonacci(num - 1);
		}
		
		
		
		return result;
	}

}
