package timeattack;

public class Q06 {

	public static void main(String[] args) {
		
		int sum = 0;
		for(int i=1; i<=77; i++) {
			sum += (77-i+1) * i;
		}
		
		System.out.println(sum);

	}

}
