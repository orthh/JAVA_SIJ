
public class Ex01전역변수와정적변수2 {

	public static void main(String[] args) {
		//Ex01전역변수와정적변수1.a 로 접근불가
		
		//전역변수
		Ex01전역변수와정적변수1 abc = new Ex01전역변수와정적변수1();
		System.out.println(abc.a);
		
		//정적변수
		System.out.println(Ex01전역변수와정적변수1.b); //1

	}

}
