package 메서드;

public class Ex01메서드 {

	public static void main(String[] args) {
		
		//매개변수와 전달인자의 갯수/데이터 타입은 항상 일치
		System.out.println(sum(10,20,500));
		System.out.println(sum(15,20,500));
		System.out.println(sum(40,2));
		System.out.println(sum(20,20,500));
		System.out.println(sum(30,20,500));
		System.out.println(sum(40,20,500));

		
	}
	
	//메서드 작성은 main 밖에서 이루어진다.
	// +하는 기능을 그냥 만들어놓고 필요할때마다 가져다가 사용해야지!
	//public : 접근제한자(공공의 : 클래스 내/외부에서 마음대로 접근이 가능하도록해줌)
	//static : 저장소
	//리턴타입 : 돌려받는 결과값의 데이터 타입
	//메서드명
	//(매개변수) : 메서드 안에서 사용될 수 있는 뱐수. 선언만 한다.
	public static int sum(int a, int b, int c) {
		return a+b+c + 365;
	}
	public static int sum(int a, int b) {
		return a+b;
	}
	

}
