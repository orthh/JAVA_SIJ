public class Ex01전역변수와정적변수1 {
	//전역변수
	int a = 1;
		
	//정적변수
	public static int b= 1;


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = new int[5]; //
		System.out.println(arr); //배열의 0번 주소값 가짐.
		int[] arr3 = arr;
		System.out.println(arr3);
		int[] arr2 = new int[5];
		System.out.println(arr2); //배열의 0번 주소값 가짐
		
		//
		String str = "123";
		String str1 = "1234";
	}

}
