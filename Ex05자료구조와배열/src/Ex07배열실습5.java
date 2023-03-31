import java.util.Scanner;

public class Ex07배열실습5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//이 배열안에 들어있는 값이 중복되지 않는다! (가정)
		String[] arrStr = {"김지은","박수현","정세연","이명훈","강예진",
				"임명진","정형","채수민" };
		
		System.out.print("검색할 이름 입력 >> ");
		String name = sc.next();
		
		
		//1.
		int cnt = 0;
	
		for(String item : arrStr) {
			if(item.equals(name)) {
				System.out.println(name + "님은 " + cnt + "번째"
						+ " 인덱스에 저장되어 있습니다");
				break;
			}
			cnt++;
		}
		if(cnt >= arrStr.length) {
			System.out.println("검색된 이름이 없습니다.");
		}
		
		//2.
		for(int i = 0 ; i < arrStr.length ; i++) {
	        if(arrStr[i].equals(name)) {
	           System.out.println(name + "님은 " + i + "번째 인덱스에 저장되어 있습니다");
	           break;
	        }
        	if(i >= arrStr.length -1) {
        		System.out.println("검색된 이름이 없습니다.");
        	}

	     }
		
		
		
	}

}
