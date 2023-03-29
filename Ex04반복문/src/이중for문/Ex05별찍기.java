package 이중for문;

public class Ex05별찍기 {

	public static void main(String[] args) {
		
		
		//build up
		//내부for문먼저
//		for(int j = 1; j<=5; j++) {
//			System.out.print("*");
//		}
//		System.out.println();
//		for(int j = 1; j<=4; j++) {
//			System.out.print("*");
//		}
//		System.out.println();
//		
		//합산 : 변하는것 j => 5~1
		for(int i=5; i>=1; i--) {
			for(int j = 1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
