import java.util.Scanner;

public class Ex04for문 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		for(int i=1; i<=num; i++) {
			if(num%i == 0) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
		//1.자기보다 큰 수를 약수로 가지고 있지 않음
		//2.모든 숫자들의 가장 작은 약수는 1
		//32 : 1 2 4 8 16 32
		//24 : 1 2 3 4 6 12 24
		//모든 짝수는 자신을 2로 나눈게 두번째로 큰값.
		// 자기 자신의 절반~ 자기 자신 사이에 약수는 존재하지 않는다.
		
	}

}
