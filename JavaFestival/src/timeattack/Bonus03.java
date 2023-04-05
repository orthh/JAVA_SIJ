package timeattack;

public class Bonus03 {

	public static void main(String[] args) {
		
		int num1 = 50;
		int num2 = 15;
		char op = '*';
		
		System.out.println(cal(num1, num2, op));

	}
	
	public static int cal(int num1, int num2, char op) {
		int result = 0;
		switch (op) {
		case '+':
			result = num1 + num2;
			break;
		case '-':
			result = num1 - num2;
			break;
		case '*':
			result = num1 * num2;
			break;
		case '/':
			result = num1 / num2;
			break;

		}
		
		return result;
	}

}
