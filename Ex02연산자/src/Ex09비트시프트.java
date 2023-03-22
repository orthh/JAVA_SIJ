
public class Ex09비트시프트 {

	public static void main(String[] args) {
		
		//비트연산자, 시프트연산자 -> 연산을 빠르게 하고 싶을 때 (은행)
		int a = 9;  //10진수 -> 2진수
		
		//비트연산 : &(and) |(or) ^(xor) ~(not)
		int b = 9;   //1001
		int c = 11;  //1011
		//같은자리수가 하나라도 0이면 false(0)
		System.out.println(b&c); //9
		//같은자리수가 하나라도 1이면 true(1)
		System.out.println(b|c); //11
		//xor 은 같으면 false 하나라도 다르면 true
		System.out.println(b^c); //2
		
		//2진수는 맨앞자리수는 부호임. 1일경우 음수
		int d = 6; //0110
		System.out.println(~d); //-7
		
		//시프트 연산 : 비트(0,1)을 옮겨주는 연산
		//<< (비트가 왼쪽으로 옮겨짐), >> (비트가 오른쪽으로 옮겨짐)
		System.out.println(3<<2);//12
		//3(2진수) 비트를 왼쪽으로 2칸씩 움직인다.
		//11 -> 1100
		System.out.println(9<<2); //36
		// 1001 -> 100100
		
		
		int aa = 20;
		int bb = 10;
		int temp = 0;
		temp = aa;
		aa = bb;
		bb = temp;
		System.out.println(aa);
		System.out.println(bb);
	}

}
