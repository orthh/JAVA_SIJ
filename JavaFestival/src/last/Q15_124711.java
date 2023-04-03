package last;

import java.util.Scanner;

public class Q15_124711 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("n 입력 : ");
		int num = sc.nextInt();
		
		suyeol(num);
	}
	
	public static void suyeol(int n) {
		
		int result = 1;
		for(int i=0; i<n; i++){
			result += i;
			System.out.print(result + " ");
		}
	}

}
