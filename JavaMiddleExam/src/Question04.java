import java.util.Scanner;

public class Question04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num = 100;
		int result = 0;
		for(int i=1; i<=num; i++) {
			
			if(i % 2 == 0) {
				result -= i;
				System.out.print(-i + " ");
			}else{
				result += i;
				System.out.print(i + " ");
			}
		}
		
		System.out.println("\n결과 : " + result);
	}

}
