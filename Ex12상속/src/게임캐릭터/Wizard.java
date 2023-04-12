package 게임캐릭터;

public class Wizard extends Charac{

	// 추상클래스가 물려주는 추상메소드는 반드시 구현.
	@Override
	public void run() {
		System.out.println("빗자루타고 전진");
	}

	@Override
	public void jump() {
		System.out.println("포털로 이동");
		
	}

	@Override
	public void atk() {
		System.out.println("아브라카다브라");
		
	}
	
	// 전진, 점프, 공격 기능을 상속받게 만들자
	// extends Charac
	
	// 전진 ---> 빗자루타고 전진
	// 점프 ---> 포털로 이동
	// 공격 ---> 아브라카다브라
	
}
