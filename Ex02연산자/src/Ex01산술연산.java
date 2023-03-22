
public class Ex01산술연산 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 10;
		int num2 = 7;
		float num3 = 10f;
		float num4 = 7f;
		
		
		//정수(int)와 정수(int) 연산시에는 무조건 결과는 정수로
		System.out.println(num1/num2);  //1
		System.out.println(num3/num4);  //1.4285715
		
		//실수와 실수 연산시 실수로 나옴.
		//실수 연산시에는 부동 소수점으로 오차가 있을수 있음.
		//정수와 실수 연산시에는 무조건 결과는 실수로
		System.out.println(num1/num4);  //1.4285715
		
		System.out.println(num3%num4);  //3.0
		
		System.out.println(num1/num4 == 1.4285715); //false
		
		int num5 = 10;
		int num6 = 7;
		System.out.println(num5 + num6);
		
		String num7 = "10";
		String num8 = "7";
		System.out.println(num7 + num8);
		
		int num9 = 10;
		String num10 = "7";
		//문자열이 하나라도 섞이면 문자열이 됨.
		System.out.println(num9 + num10); //107
		
		String a = 10 + 7 + ""; //17
		String b = 8 + "" + 2; //82
		String c = "" + 5 + 2; //52
		
		System.out.println(a + b + c); 
		
		int num11 = 7;
		int num12 = 3;
		
		//더하기
		System.out.println("더한 결과 : " + (num11 + num12)); //10
		//빼기
		System.out.println("빼기 결과 : " + (num11 - num12)); //4
		//곱하기
		System.out.println("곱하기 결과 : " + num11 * num12); //21
		//나누기
		System.out.println("나누기 결과 : " + (double) num11 / num12); //2
		
	}

}
