package timeattack;

public class Q22 {

	public static void main(String[] args) {
		
		int num = 10;
		
		for(int i=0; i<num; i++) {
			for(int k = 0; k<num - 1-i; k++) {
				System.out.print(" ");
			}
			for(int j=0; j<i+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
