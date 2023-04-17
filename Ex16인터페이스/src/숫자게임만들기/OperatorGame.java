package 숫자게임만들기;

public interface OperatorGame {
	
	// 난수를 생성하는 기능
	public abstract int random(int difficulty);
	// 문제를 제출할 수 있는 기능
	public abstract String getQuiz(int oper, int difficulty);
	// 정답을 체크할 수 있는 기능
	public abstract boolean checkAnswer(int ans);
	

}
