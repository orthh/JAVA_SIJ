
public class Ex02산술연산 {

	static int throw100(int x) {
		//1. 456 - 56 -> 400
		//   x - x%100
		//2. 4 * 100 -> 400
		//   x/100 * 100 -> 400
		return x - x % 100 ;
	}
	static int change1(int x) {
		//1. x / 10 * 10 + 1
		return x - x % 10 + 1 ;
	}
	public static void main(String[] args) {
		
		
		System.out.println(change1(456));
		System.out.println(change1(777));
		
//		System.out.println(throw100(456));
//		System.out.println(throw100(111));
	}

}
