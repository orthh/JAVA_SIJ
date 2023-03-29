
public class Q10 {

	public static void main(String[] args) {
		//for문을 사용하여 A~Z까지 출력하시오.
		
		int fChar = (int)'A';
		int sChar = (int)'Z';
		
		for(int i = fChar; i<=sChar; i++) {
			System.out.println(String.valueOf((char)i));
		}
		
		//refactoring
		char c = 'A'; //65
		do {
			System.out.println(c);
			c = (char)(c+1);
		} while(c<='Z');

		
	}

}
