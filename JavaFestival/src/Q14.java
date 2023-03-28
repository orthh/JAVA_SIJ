
public class Q14 {

	public static void main(String[] args) {
		
		int num = 5;
		
		//long a = System.currentTimeMillis();
		
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
		
		//long b = System.currentTimeMillis();
	    //System.out.println(b-a+"ms");
		
		//refactoring 약 20배 빠름
		
	    //long c = System.currentTimeMillis();
	    
		int cnt = 1;
		while(num >= 1) {
			System.out.print(" ".repeat(num - 1));
			System.out.print( "*".repeat(cnt) + "\n");
			num --;
			cnt ++;
		}
		
		//long d = System.currentTimeMillis();
	    //System.out.println(d-c+"ms");

	}

}
