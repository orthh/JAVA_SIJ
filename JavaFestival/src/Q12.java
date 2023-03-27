import java.util.Scanner;

public class Q12 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		String num = sc.nextLine();
		
		int result = 0;
		
		for(int i=0; i<=num.length() - 1; i++) {
			String a = num.charAt(i) + "" ;
			result += Integer.parseInt(a);
		}
		
		System.out.println("합은 " + result + "입니다.");
		
		//배열
//		String[] numArr = num.split("");
//		for(String item : numArr) {
//			result += Integer.parseInt(item);
//		}
//		System.out.println("합은 " + result + "입니다.");
		
	}

}
