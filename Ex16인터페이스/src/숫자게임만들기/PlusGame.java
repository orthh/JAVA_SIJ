package 숫자게임만들기;

import java.util.Random;

public class PlusGame implements OperatorGame{
	
	int ans;
	String[] operator = {"+","-","*"};

	@Override
	public int random(int difficul) {
		int diffi = difficul * 10;
		Random rd = new Random();
		return rd.nextInt(diffi) + 1;
	}
	

	public int[] changeBigger(int num1, int num2) {
		int temp;
		int n1 = num1;
		int n2 = num2;
		if(num1 < num2) {
			n1 = num2;
			n2 = num1;
		}

		int[] numArr = new int[2];
		numArr[0] = n1;
		numArr[1] = n2;
		
		return numArr;
	}
	
	@Override
	public String getQuiz(int oper,int difficulty) {
		
		
		int num1;
		int num2;
		
		String operOut = "";
		
		String temp = "";
		if(oper == 1) {
			num1 = random(difficulty * 4);
			num2 = random(difficulty * 4);
			int[] te = changeBigger(num1, num2);
			operOut = "+";
			num1 = te[0];
			num2 = te[1];
			ans = num1 + num2;
		}else if(oper == 2) {
			num1 = random(difficulty * 4);
			num2 = random(difficulty * 4);
			int[] te = changeBigger(num1, num2);
			num1 = te[0];
			num2 = te[1];
			operOut = "-";
			ans = num1 - num2;
		}else if(oper == 3) {
			num1 = random(difficulty);
			num2 = random(difficulty);
			int[] te = changeBigger(num1, num2);
			num1 = te[0];
			num2 = te[1];
			operOut = "*";
			ans = num1 * num2;
		}else {
			num1 = random(difficulty);
			num2 = random(difficulty);
			int[] te = changeBigger(num1, num2);
			num1 = te[0];
			num2 = te[1];
			operOut = "/";
			ans = num1 / num2;
		}
		
		
//		Random rd = new Random();
//		String oper = operator[rd.nextInt(3)];
//		if(oper.equals("+")) {
//			ans = num1 + num2;
//		}else if(oper.equals("-")) {
//			ans = num1 - num2;
//		}else {
//			ans = num1 * num2;
//		}
		temp += num1 + " " +operOut + " "+ num2 + " = ";
		return temp;
	}

	@Override
	public boolean checkAnswer(int ans) {
		if(ans == this.ans) {
			return true;
		}
		return false;
	}
	
	// 개발자1
	// 자연쌤이 주신 인터페이스를 사용해서 구현하기
	// 기능을 완성하기
	
}
