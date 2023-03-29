
public class Q03 {

	public static void main(String[] args) {

		//1-2+3-4+...+99-100 를 계산하여 답을 출력하시오.

		int num = 100;

		int cnt = 1;
		int sum = 0;
		while(true) {
			sum += (cnt %2 == 0) ? -cnt : cnt ;
			cnt++;
			if(cnt > num) break;
		}
		System.out.println(sum);
		
		//-1로 반복 떄리고 마지막수에서 if만 써주면 더 빠를듯
	}


}
