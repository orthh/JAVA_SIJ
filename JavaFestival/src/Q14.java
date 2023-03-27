
public class Q14 {

	public static void main(String[] args) {
		
		int num = 5;
		
		//행
		for(int i=1; i<=num; i++) {
			//공백
			for(int j=num; j>i; j--) {
				System.out.print(" ");
			}
			//별
			for(int k=1; k<=i; k++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}

}
