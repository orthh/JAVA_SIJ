package 이중for문;

public class Ex06별찍기 {

	public static void main(String[] args) {
		
//		//build up
//		//j는 4부터 1까지 감소. 1감소. 4번
//		for(int j=1; j<=4; j++) {
//			System.out.print(" ");
//		}
//		for(int j=1; j<=3; j++) {
//			System.out.println(" ");
//		}
//		
//		//k조건 1부터 5까지 증가 ,1증가, 5번
//		for(int k=1; k<=1; k++) {
//			System.out.println("*");
//		}
//
//		for(int k=1; k<=2; k++) {
//			System.out.println("*");
//		}
//		
		
		
		//반복 횟수 많은쪽으로
		for(int i=1 ; i<=5; i++) {
			for(int j=1; j<=5-i; j++) {
				System.out.print(" ");
			}	
			for(int k=1; k<=i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		//
//		System.out.println(" ");
//		System.out.println(" ");
//		System.out.println(" ");
//		System.out.println(" ");
//		System.out.println(" ");
//		System.out.println("*")
//		System.out.println();;
	}

}
