
public class Ex01for문 {

	public static void main(String[] args) {
		//for문을 사용해서 21에서 57까지 출력
		for(int i = 21; i <= 57; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		for(int i = 96; i>=53; i--) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		
		int num = 21;
		if(num %2 == 0) num += 1;
		for(int i = num; i <= 57; i += 2) {
			System.out.print(i + " ");
		}
		
		 
	}

}
