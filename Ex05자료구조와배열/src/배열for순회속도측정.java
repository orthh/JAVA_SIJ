
public class 배열for순회속도측정 {

	public static void main(String[] args) {
		
		//일반for문
		System.out.println("일반 for문");
		long a = System.currentTimeMillis();
			
		int[] testArr2 = new int[1000000000];
		
		int ret = -1;
		for(int i=0; i<testArr2.length; i++) {
			ret++;
		}
		
		long b = System.currentTimeMillis();
		System.out.println(ret);
		System.out.println(b-a+"ms");
		
		
	}	

}
