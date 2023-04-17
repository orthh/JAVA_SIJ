package 숫자게임만들기;

import java.util.ArrayList;

public class MemberSystem implements Login{
	
	ArrayList<Member> DB_List = new ArrayList<>();
	

	public boolean isExistId(String id, String pwd) {
		for(int i=0; i<DB_List.size(); i++) {
			if(id.equals(DB_List.get(i).getNickName())){
				return true;
			}
			
		}
		return false;
	}

	@Override
	public boolean signUp(String id, String pwd) {
		if(isExistId(id, pwd)) {
			return false;
		}
		DB_List.add(new Member(id, pwd));
		return true;
	}

	@Override
	public boolean login(String id, String pwd) {
		for(int i=0; i<DB_List.size(); i++) {
			if(id.equals(DB_List.get(i).getNickName()) 
					&& pwd.equals( DB_List.get(i).getPwd())) {
				return true;
			}
			
		}
		return false;
	}
}
