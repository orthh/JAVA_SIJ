import java.util.Scanner;

public class Q4_Homework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("현재 몸무게 : ");
		int weight = sc.nextInt();
		
		System.out.print("목표 몸무게 : ");
		int targetWeight = sc.nextInt();
		int week = 0;
		while(true) {
			week ++;
			System.out.print(week + "주차 감량 몸무게 : ");
			int minusWeight = sc.nextInt();
			weight -= minusWeight;
			if(targetWeight >= weight) {
				System.out.println("최종몸무게 : " + weight);
				System.out.println("축하합니다!!!");
				break;
			}else {
				System.out.println("현재 몸무게 : " + weight);
			}
		}
	}

}
