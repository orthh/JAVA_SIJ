import java.util.Scanner;

public class Q4_Homework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("현재 몸무게 : ");
//		int weight = sc.nextInt();
//		
//		System.out.print("목표 몸무게 : ");
//		int targetWeight = sc.nextInt();
//		int week = 0;
//		while(true) {
//			week ++;
//			System.out.print(week + "주차 감량 몸무게 : ");
//			int minusWeight = sc.nextInt();
//			weight -= minusWeight;
//			if(targetWeight >= weight) {
//				System.out.println("최종몸무게 : " + weight 
//		+ "kg\n축하합니다!!!");
//				break;
//			}else {
//				System.out.println("현재 몸무게 : " + weight);
//			}
//		}
//		
		//강사님 풀이
		
		//in -> console에 입력
		//out -> console에 출력
		
		// 1. 입력도구 가져오기
			Scanner sc = new Scanner(System.in);
		// 2. 현재 몸무게 : --> 출력문
		// 오른쪽에 입력받기
		System.out.print("현재 몸무게 : ");
		int now = sc.nextInt();
		// 3. 목표 몸무게 : --> 출력문
		//오른쪽에 입력받기
		System.out.print("목표 몸무게 : ");
		int goal = sc.nextInt();
		// 4. 출력문
		//오른쪽에 입력받기
		//4번은 반복이 된다 --> 목표몸무게에 도달할때까지 반복
		int week = 1;
		while(true) {
			
			System.out.print(week + "주차 감량 몸무게 : ");
			int minus = sc.nextInt();
			//현재 몸무게 = 현재 몸무게 - minus
			now -= minus;
			
			//종료조건
			//now가 목표 몸무게에 도달했는지 (작거나 같은지) : while문 종료
			if (now <= goal) {
				break;
			} else {
				
			}
		}
		// 5. 출력문
		System.out.println(now + "kg 달성 !! \n축하합니다");
		
		
	}

}
