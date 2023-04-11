package 마우스;

public class Main {

	public static void main(String[] args) {
		
		Mouse m1 = new Mouse();
		// . : 참조
		m1.rightClick();
		m1.leftClick();
		m1.drag();
		
		System.out.println("-----------구분선---------");
		
		WheelMouse m2 = new WheelMouse();
		m2.rightClick();
		m2.leftClick();
		m2.drag();
		m2.scroll();
		
		System.out.println("-----------구분선---------");
		
		HealthMouse m3 = new HealthMouse();
		m3.rightClick();
		m3.leftClick();
		m3.drag();
		//m3.scroll(); 상속안함
		m3.reduceFatigue();
		
		
		
	}

}
