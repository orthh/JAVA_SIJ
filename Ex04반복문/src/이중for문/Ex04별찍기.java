package 이중for문;

public class Ex04별찍기 {

	public static void main(String[] args) {
		
		for(int j=1; j<=5; j++) {
			for(int i=1; i<=j; i++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		//바뀌는부분의식을 바깥변수로 지정한다.
		for(int i=1; i<=1; i++) {
			System.out.print("*");
		}
		System.out.println();
		for(int i=1; i<=2; i++) {
			System.out.print("*");
		}
		System.out.println();
		for(int i=1; i<=3; i++) {
			System.out.print("*");
		}
		System.out.println();
		for(int i=1; i<=4; i++) {
			System.out.print("*");
		} 
		System.out.println();
		for(int i=1; i<=5; i++) {
			System.out.print("*");
		}
		System.out.println();

	}

}
