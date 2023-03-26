import java.util.Scanner;

public class Q08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);


		while(true) {
			System.out.print("A입력 : ");
			int a = sc.nextInt();
			System.out.print("A입력 : ");
			int b = sc.nextInt();
			if(a == 0 && b == 0) break;
			System.out.println("결과 : " + (a-b));
		}

	}


}
