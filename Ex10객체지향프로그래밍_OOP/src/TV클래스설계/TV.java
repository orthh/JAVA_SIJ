package TV클래스설계;

// class : 객체의 속성과 행동을 정의하는 설계도
public class TV {
	// 필드
	String 브랜드이름;
	double 크기;
	int 가격;
	boolean 스마트티비기능지원여부;
	boolean 전원상태;
	int 채널;
	int 볼륨;
	
	
	

	// 메서드 : 대게 필드와 연결돼서 만듬.
	public void 전원켜기() {
		전원상태 = true;
	}
	public void 전원끄기() {
		전원상태 = false;
	}
	public void 채널올리기() {
		채널++;
	}
	public void 채널내리기() {
		채널--;
	}
	public void 채널변경하기(int 변경할채널번호) {
		채널 = 변경할채널번호;
	}
	public void 볼륨올리기() {
		볼륨++;
	}
	public void 볼륨내리기() {
		볼륨--;
	}
	public void 음소거하기() {
		볼륨 = 0;
	}
	
	
	
}
