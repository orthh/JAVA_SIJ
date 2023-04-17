package 숫자게임만들기;

public interface Login {
	
	// 회원가입
	public abstract boolean signUp(String id, String pwd);
	// 로그인
	public abstract boolean login(String id, String pwd);
	
	
	
}
