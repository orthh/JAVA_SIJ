package thirdMethod;

public class Q2_getMiddle {

	public static void main(String[] args) {
		System.out.println(getMiddle("power"));
		System.out.println(getMiddle("test"));
	}
	
	public static String getMiddle(String str) {
		
		String result = "";
		if(str.length() % 2 == 0) {
			result = String.valueOf(str.charAt(str.length() / 2 - 1));
			result += String.valueOf(str.charAt(str.length() / 2));
			
		}else {
			result += String.valueOf(str.charAt(str.length() / 2));
		}
		
		return result;
	}

}
