package PokeMon;

public interface PokeMon {
	
	// PokeMon : 게임 캐릭터가 꼭 가져야할 기능들을 설계
	// 인터페이스
	// : 반드시 {body} 가 없는 메서드만 가지고있어야한다.
	// : 추상메소드만 가지고 있다
	// ---> 진짜 설계도, 작업명세서, 프로젝트 설계도
	// 필드를 포함할 수 있다. 단, 상수형태로만 가질 수 있음.
	// ---> 절대로 변하지 않을 값들만 필드로 넣어주자.
	
	// 추상 클래스 : 개발자가 원하는대로 메소드 만들고 구현하세요
	// 인터페이스 : 개발자는 우리가 제공한대로 만드세요.
	
	
	// atk() -> 일반공격
	public abstract void atk();
	// specialatk() -> 특수공격
	public abstract void specialAtk();
	
	
	
	
	
	
	
	
}
