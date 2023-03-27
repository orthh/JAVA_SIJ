import java.util.Random;
import java.util.Scanner;

public class Ex06숫자맞추기게임 {

	public static void main(String[] args) {
		
		//입력도구,랜덤도구 임포트
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		
		//숫자 크기 제한
		int limit = 100;
	
		//랜덤 숫자게임 Up&Down 게임
		System.out.println("======1부터 "+ limit 
				+ " 사이 숫자"
				+ " 맞추기 게임!======");
		//랜덤 숫자 생성
		int answer = rd.nextInt(limit) + 1;
		
		while(true) {
			//유저로부터 인풋 받기
			System.out.print("1과 " + limit 
					+ "사이 정수를 입력하세요 >> ");
			int num = sc.nextInt();
			
			//Up&Down 판별
			if(answer == num) {
				System.out.println(answer + " 정답입니다!!");
				break;
			}else if(answer > num) {
				System.out.println("Up");
			}else {
				System.out.println("Down");
			}
		}
		
		
	}

}
