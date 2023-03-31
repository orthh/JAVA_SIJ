package 메서드;

public class Ex09오버로딩 {

	public static void main(String[] args) {
		
		//sum2()
		
		sum2(3, 5);
		sum3(3, 5, 7);
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
