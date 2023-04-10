package TV클래스설계;

public class TVSimulator {

	public static void main(String[] args) {
		// TV 객체(object) 생성
		// 데이터타입 변수명 = new 데이터타입();
		TV tv1 = new TV();
		TV tv2 = new TV();
		
		// 각자 heap영역 안의 별개로 생성

		tv1.브랜드이름 = "삼성";
		tv2.브랜드이름 = "LG";

		tv1.채널변경하기(30);
		tv1.채널내리기();
		
		System.out.println(tv1.채널); //29

		
		
	}

}
