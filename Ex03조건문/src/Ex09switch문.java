
public class Ex09switch문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 20;
		
		//num이 20을 가지고 있으면 "20", 30을 가지고 있으면 "30",
		//그 나머지 값을 가지고 있으면 "다른수"
		
		//switch문 은 비교구문이 아니라 바로 case로 찾아감. 
		switch (num) {
		case 20:
			System.out.println("20");
			break; //스위치 문을 멈추고 다음문장을 실행하도록 하는 명령어
		case 30:
			System.out.println("30");
			break;
		default:
			System.out.println("다른 수");
			break;
		}
	}

}
