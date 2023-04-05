package timeattack;

public class Q28 {

	public static void main(String[] args) {
		
		String str = "00101000";
		
		String[] arr = str.split("");
		
		int result = 0;
		int cnt = 0;
		for(int i= arr.length - 1; i>=0; i--) {
			if(arr[i].equals("1")) {
				result += pow(2, cnt);
			}
			cnt++;
		}
		
		System.out.println(result);

	}
	
	public static int pow(int base, int n) {
		int result = 1;
		for(int i= 0; i<n; i++) {
			result *= base;
		}
		return result;
	}

}
