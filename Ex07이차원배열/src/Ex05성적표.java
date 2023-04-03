import java.util.Scanner;

public class Ex05성적표 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[][] allClass = new int[4][];
		allClass[0] = new int[3];
		allClass[1] = new int[5];
		allClass[2] = new int[4];
		allClass[3] = new int[6];
		
		//저장
		for(int i=0; i<allClass.length; i++) {
			System.out.println(i+1 + "반 점수 입력");
			for(int j=0; j<allClass[i].length; j++) {
				System.out.print(i + 1 + "반 " + (j+1) + " 번째 학생 점수 >> ");
				allClass[i][j] = sc.nextInt();
			}
		}
		
		//출력
		int sum;
		for(int i=0; i<allClass.length; i++) {
			sum = 0;
			System.out.print(i+1 + "반 >> ");
			for(int j=0; j<allClass[i].length; j++) {
				System.out.printf("%4d",allClass[i][j]);
				sum += allClass[i][j];
			}
			System.out.println("\n총점 : " + sum + " 평균 : " + (double)sum 
					/ allClass[i].length);
		}

	}

}
