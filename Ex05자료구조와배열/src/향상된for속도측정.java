
public class 향상된for속도측정 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] testArr = new int[1000000000];
		//향상된for문
		System.out.println("향상된for문");
		long c = System.currentTimeMillis();

		int rete = -1;
		for(int i : testArr) {
			rete++;
		}
		
		long d = System.currentTimeMillis();
		System.out.println(rete);
		System.out.println(d-c+"ms");
		
	}

}
