package 입출력;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Scanner;

public class Mission01 {
	/*
	 * static String[] getManyInput(int n,String[] wantArr) { // n : 출력하고자 하는 갯수, //
	 * [] : 출력하고자 하는 문자열 Scanner sc = new Scanner(System.in);
	 * 
	 * 
	 * 
	 * }
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.print("이름 : ");
			String name = sc.nextLine();
			System.out.print("나이 : ");
			int age =  sc.nextInt();
			System.out.println("이름은 " + name + "이고 나이는 " + age + "입니다.");
			System.out.printf("이름은 %s이고 나이는 %d 입니다.", name,age);
		} catch (Exception e) {
			System.out.println("올바른 입력을 해주세요");
			StringWriter sw = new StringWriter();
			PrintWriter pw = new PrintWriter(sw);
			e.printStackTrace(pw);
			String stackTrace = sw.toString();
			String onlyErrorName = stackTrace.split("\\s")[0];
			if(onlyErrorName.equals("java.util.InputMismatchException")) {
				System.out.println("올바른 숫자를 입력해주세요.");
			}else {
				//...
			}
		}
		
		
	}

}
