import java.util.Scanner;

public class Question03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num;
		do {
			System.out.print("나이 >> ");
			num = sc.nextInt();
		} while (num <= 0);
		
		
		if(num >=61) {
			System.out.println("노년입니다.");
		}else if(num>=41){
			System.out.println("중년입니다.");
		}else {
			System.out.println("초년입니다.");
		}
	}

}
