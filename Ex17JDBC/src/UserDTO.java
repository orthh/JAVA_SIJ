
public class UserDTO {
	
	// DTO -> Data Transfer Object
	
	
	// MVC 패턴
	// M : Model(VO)  --> 데이터가 보여지는 형식
	// V : View       --> 사용자에게 보여지는 전체부분
	// C : Controller --> 사용자에게 보여지지는 않지만
	//                    기능상 데이터를 다루는 부분
	
	
	private String id;
	private String pw;
	private String nick;
	
	public UserDTO(String id, String pw, String nick) {
		this.id = id;
		this.pw = pw;
		this.nick = nick;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getNick() {
		return nick;
	}

	public void setNick(String nick) {
		this.nick = nick;
	}
	
	
	
	
	
	
}
