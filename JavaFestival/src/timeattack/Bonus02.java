package timeattack;

public class Bonus02 {

	public static void main(String[] args) {
		
		System.out.println(getMiddle("power"));
		System.out.println(getMiddle("test"));

	}
	
	public static String getMiddle(String str) {
		String[] arr = str.split("");
		
		String result = "";
		if(arr.length % 2 == 0) {
			result += arr[arr.length / 2 -1];
			result += arr[arr.length / 2];
			
		}else {
			result += arr[arr.length / 2];
		}
		
		return result;
	}

}
