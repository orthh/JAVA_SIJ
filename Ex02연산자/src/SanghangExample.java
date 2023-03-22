import java.util.Scanner;

public class SanghangExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 정수 입력 : ");
		int num1 = sc.nextInt();
		
		System.out.print("두 번째 정수 입력 : ");
		int num2 = sc.nextInt();
		
		System.out.println("두 수의 차 : " + ((num1 > num2) ? 
				num1-num2 : num2 - num1));
		
		System.out.print("농구공의 개수를 입력하세요 : ");
		int ball = sc.nextInt();
		
		System.out.println("필요한 상자의 수 : " + ((ball % 5 ==0) ? 
				ball / 5 : ball / 5 + 1));
		
		System.out.print("노동시간을 입력하세요 : ");
		int hours = sc.nextInt();
		int wagePerHours = 9000;
		int overTimeStandard = 8;
		//실수 -> 정수 형변환 절대 자동형변환 해주지 않음.
		
		double wage = (hours > overTimeStandard) ? 
				(wagePerHours * overTimeStandard) + 
				((hours - overTimeStandard) * (wagePerHours * 1.5))
				: hours * wagePerHours ;
		
		System.out.println("총 임금은 " + (int)wage + "원 입니다");
		System.out.printf("총 임금은 %.0f원 입니다", wage);
	}

}
