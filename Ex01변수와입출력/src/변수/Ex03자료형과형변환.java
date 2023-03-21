package 변수;

public class Ex03자료형과형변환 {

	public static void main(String[] args) {
		
		//1. 논리형(참/거짓, 1/0, T/F)
		boolean sw = true;
		boolean sw1 = false;
//		boolean sw2 = 1; error
		
		//2. 문자형 : 문자 1개만 저장 가능 ''
		char c = 'a';
//		char c2 = 'abc'; error
		char c2 = 75; //ASCII 코드 상에 따름
		char c3 = 97;
		System.out.println(c2); // K 출력
		System.out.println(c == c3); //true
		
		//3. 정수형
		//3-1. byte(1byte, 2의-7승 ~ 2의7승 -1)
//		byte num = 300; error
		byte num1 = (byte)120; //원래는 이게 맞음 int타입을 byte타입에 넣는것이기 때문에
		byte num = 120; // int 120 -> byte에 저장하겠다 (자료형을 바꾸겠다 ->형변환)
		
		
		int n = 3000000;
		
//		byte b = n; error
		byte b = (byte)n;
		
		System.out.println(b); //-64
		
		
		//3-2. short (2byte, 16bit, 2의-15승 ~2의 15승 -1)
		short num22 = (short)200;
		short num2 = 200;
		
		//3-3. int (4byte, 32bit, 2의 -31승 ~ 2의 31승 -1)
		int num3 = 200;
		
		//3-4. long(8byte, 64bit, 2의-63승 ~ 2의 63승 -1)
		long num4 = 300; //자동 형변환
		
		
		//4.실수형 (부동소수점)
		//4-1 float (4byte, 32bit, 2의-31 ~ 2의 31승 -1)
//		float num5 = 3.14; error
		float num5 = (float)3.14;
		float num6 = 3.14f; //3.14의 정확한 값아님. 부동소수점 사용하기 때문에 3.13~3.15사이값
		System.out.println(num6 == 3.14); //false
		
		System.out.println(num5 == num6); //true
		
		double num7 = 3.14; //정확한 값 저장
		System.out.println(num6 == num7); //false
		System.out.println(num7 == 3.14); //true
		
		
		
		
		
		
		
		
		
		
	}

}
