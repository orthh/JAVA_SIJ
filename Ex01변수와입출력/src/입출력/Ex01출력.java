package 입출력;

public class Ex01출력 {

	public static void main(String[] args) {
		
		//System : 표준 입출력 클래스
		//System.out : 출력 기능 사용
		//CTRL + F11 : 코드 실행
		
		int a = 10;
		
		//print() -> 메서드(기능)
		System.out.print(123); //그대로 출력 \n : 개행
		System.out.print("Hello World!\n");
		
		System.out.println("출력구문1"); // 앞은 x 마지막에 \n 붙인것
		
		
		//syso -> CTRL + SPACE 단축키
		System.out.println("출력구문2");
		//CTRL + ALT + 위아래 방향키 : 해당 구문 복사붙여넣기
		System.out.println("출력구문3");
		
		//printf() : f->format , 특정 형식으로 출력
		//1. pi = 3.14
		int a1= 1;
		String b = "pi";
		double c = 3.14;
	    
		//%d : 정수자리 , %s : 문자열 자리,%f : 실수자리
		System.out.printf("%d. %s = %.2f\n", a1,b,c); 
		System.out.printf("%d. %s = %.2f\n", a1,b,3.14); 
	    
	    String s1 = "제 이름은 ";
	    String s2 = "김혁입니다.";
	    
	    System.out.print(s1);
	    System.out.print(s2);
	    
	    System.out.print(s1+s2+1); //문자열은 연산(+)가능
	}

}
