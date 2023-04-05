package 탐색;

public class Ex01순차검색 {

	public static void main(String[] args) {

		int[] arr = { 13, 35, 15, 11, 26, 72, 78, 13, 61, 90 };

		int num = 78;
		
		int idx = 0;
		while (idx < arr.length) {
			if (arr[idx] == num) {
				System.out.println(num + "은 " + idx + "번 인덱스에 있습니다.");
				break;
			}
			idx++;
		}
		
		
	

	}

}
