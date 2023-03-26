
public class Q06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//(77*1) + (76*2) + (75*3)+...+(1*77)를 계산하여 결과를 출력하시오.

		int num = 77;

		int sum = 0;
		for(int i= 0; i<num; i++) {
			int a = num - i;
			int b = i + 1;
			sum += a * b;
		}
		System.out.println(sum);

	}


}
