import java.util.Arrays;
import java.util.Collections;

public class Ex10치환 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String left = "red";
		String right = "blue";
		
		System.out.println(left);
		System.out.println(right);
		
		String temp; //임시 저장공간 선언. 초기화를 안함. 쓰레기값 남아있을수도
		String temp1 = ""; //공간선언, 초기화함. 값은 들어감
		String temp2 = null; //공간선언, 초기화함. 빈방
		//기본타입은 null로 초기화x
		
		temp = left;
		left = right;
		right = temp;
		
		System.out.println(left);
		System.out.println(right);
		
		int[] arrA = {12,3,1,2,14,2,1};
		int[] arrB = {12,3,1,2,14,2,1};
		System.out.println(Arrays.equals(arrA, arrB)); //같은 내용물인지 비교
		System.out.println(arrA.equals(arrB)); //같은 객체인지 비교
		System.out.println(Arrays.toString(arrA));
		
		int x = 2, y=10, z= 0;
		z = x++*2+--y-5+x*(y%2);
		System.out.println(z);
	}

}
