import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex03산술연산 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("JAVA 점수 입력: ");
		int scoreJava = sc.nextInt();
		System.out.print("WEB 점수 입력: ");
		int scoreWeb = sc.nextInt();
		System.out.print("ANDROID 점수 입력: ");
		int scoreAndroid = sc.nextInt();
		
		int sum = scoreJava + scoreWeb + scoreAndroid;
		
		double avg = sum / 3.0;
		
		DecimalFormat df = new DecimalFormat("#.##");
		double avgCut = Double.parseDouble(df.format(avg));
		
		double avgCut2 = Double.parseDouble(String.format("%.2f", avg));
		
		System.out.println("합계: " + sum);
		System.out.println("평균: " + avg);
		System.out.printf("평균: %.2f\n", avg);
		System.out.println("평균: " + avgCut);
		System.out.println("평균: " + avgCut2);

		
		
		
		
	}

}
