import java.util.Scanner;

public class Ex07다중IfElse문 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("A,B,C 중 하나 입력 : ");
		String inputAlphabet = sc.next();

		// == : 기본타입(primitive) 비교시에만 사용
		//referene 타입은 비교하는 기능이 따로 있음.
		//String -> 비교할떄는 .equals 메서드 사용
		
		if(inputAlphabet.equals("A")) {
			System.out.println("A입력");
		}else if(inputAlphabet.equals("B")) {
			System.out.println("B입력");
		}else if(inputAlphabet.equals("C")) {
			System.out.println("C입력");
		}else {
			System.out.println("A,B,C중에 입력해주세요");
		}
	}

}
