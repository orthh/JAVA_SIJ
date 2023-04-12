package 게임캐릭터;

public class Main {

	public static void main(String[] args) {
		
//		Charac c1 = new Charac(); // 추상클래스는 객체 생성이 불가능하다!
		
		Wizard harry = new Wizard();
		harry.atk();
		harry.run();
		harry.jump();
		
		// 전사(Warrior)
		// 공격 ---> 스윽.../
		// 점프 ---> 호잇쨔 점프
		// 전진 ---> 뚜벅뚜벅
		
		Warrior w1 = new Warrior();
		w1.atk();
		w1.run();
		w1.jump();
		
		System.out.println("------구분선------");
		
		Charac c1 = new Wizard();
		Charac c2 = new Warrior();
		
		c1.atk();
		c1.run();
		c1.jump();
		c2.atk();
		c2.run();
		c2.jump();
		

	}

}
