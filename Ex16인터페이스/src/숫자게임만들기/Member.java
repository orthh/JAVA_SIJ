package 숫자게임만들기;

import java.util.ArrayList;

public class Member{

	private String nickName;
	private String pwd;
	
	public Member(String nickName, String pwd){
		this.nickName = nickName;
		this.pwd = pwd;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	
	
	

}
