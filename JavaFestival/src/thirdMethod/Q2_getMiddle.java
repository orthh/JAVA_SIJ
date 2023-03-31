package thirdMethod;

public class Q2_getMiddle {

	public static void main(String[] args) {
		System.out.println(getMiddle("power"));
		System.out.println(getMiddle("test"));
		System.out.println("------------구분선-----------");
		System.out.println(getMiddleSubString("power"));
		System.out.println(getMiddleSubString("test"));
		System.out.println("------------구분선-----------");
		System.out.println(getMiddleSplit("power"));
		System.out.println(getMiddleSplit("test"));
	}
	
	//charAt(int n ) : char =>  n인덱스에 있는 문자or숫자 리턴
	public static String getMiddle(String str) {
		
		String result = "";
		int len = str.length() / 2;
		if(str.length() % 2 == 0) {
			//"" + int/char : 뒤에있는 데이터 타입이 자동으로 형변환
			//result = String.valueOf(str.charAt(str.length() / 2 - 1));
//			result = "" + str.charAt(str.length() / 2 - 1);
//			result += "" + str.charAt(str.length() / 2);
			result = "" + str.charAt(len - 1) 
				+ str.charAt(len);
			//result += "" + str.charAt(str.length() / 2);
			//result += String.valueOf(str.charAt(str.length() / 2));
			
		}else {
			//result += String.valueOf(str.charAt(str.length() / 2));
			result = "" + str.charAt(len);
		}
		
		return result;
	}
	
	
	//substring(int a, int b) : String =>  
	//                              a번째 인덱스부터 b번째 인덱스 전까지 자름.
	//							    b포함x
	public static String getMiddleSubString(String str) {

		if(str.length() % 2 == 0) {
			return str.substring(str.length() / 2 -1 
					, str.length() / 2 + 1);
		}else {
			return str.substring(str.length() / 2, str.length() / 2 + 1);
		}
		
	}
	
	//split() 
	public static String getMiddleSplit(String str) {
		String[] strArr = str.split("");
		String result = "";
		if(strArr.length % 2 == 0) {
			result += strArr[strArr.length / 2 -1];
			result += strArr[strArr.length / 2];
		}else {
			result += strArr[strArr.length / 2];
		}
		
		return result ;
	}


}
