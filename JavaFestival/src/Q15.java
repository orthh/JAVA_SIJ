import java.util.Random;
import java.util.Scanner;

public class Q15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		
		int life = 5;
		while(true) {
			int num1 = rd.nextInt(10); //0~9
			int num2 = rd.nextInt(10); 
			
			//출력문 + 사용자로부터 input받기
			System.out.print(num1 + " + "
			+ num2 +" = ");
			int input = sc.nextInt();
			if(num1 + num2 == input) {
				System.out.println("SUCCESS!");
			}else {
				life --;
				System.out.println("Fail...");
				if(life <=0 ) break;
			}
		}
		System.out.println("GAME OVER!");
		
	}

}
