
public class Ex01While문 {

	public static void main(String[] args) {
		//1~5까지 출력
		
		//반복문
		//1. while (do~while) : 특정 조건에 해당할 경우에만 반복
		//                      (반복횟수가 정확하지 않은 경우)
		//2. for : 반복횟수가 정해진 경우
		//while({문장}을 반복할 조건)
		int num = 1;
		while(num < 6) {
			//반복하고 싶은 문장
			System.out.println(num);
			num++;
		}
		
		//지역변수 : 특정 구역에서만 사용가능한 값(어디까지만 사용 가능한지)
		//전역변수 : 어디에서든 사용가능한 값
		
		int num1 = 1;
		while(num1 < 6) {
			//반복하고 싶은 문장
			System.out.println(num1);
			num1++;
		}
		
		int num2 = 0;
		while(true) { //반복을 그만할 조건을 생각하는게 쉬움
			//반복하고 싶은 문장
			System.out.println(num2);
			num2++;
			if(num2 == 6) break; //반복문 나가기 
			                     //break를 기준으로 가장 가까운 반복문만 나감
		}
		
		//do~while : 반복문장을 뭊건 1번은 실행해야할 때! 
		int num3 = 1;
		do {
			System.out.println(num3);
			num3++ ;
		} while (num3 < 6);
		
	}

}
