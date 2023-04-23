import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class UserDAO {
	// DAO : Data Access Object
	// 데이터에 접근하는 기능을 가지고 있다!
	// DB 연결
	private Connection conn = null;
	private PreparedStatement pstm = null;
	private ResultSet rs = null;
	
	public void getConn() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			// 연결시 필요한 값 (url, id, pw)
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String id = "service";
			String pw = "---";

			conn = DriverManager.getConnection(url, id, pw);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	
	public void close() {
		try {
			if (rs != null) {
				rs.close();
			}
			if (pstm != null) {
				pstm.close();
			}
			if (conn != null) {
				conn.close();
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public int join(String id, String pw, String nick){
		getConn();
		int result = 0;
		try {
			String sql = "INSERT "
					+ "     INTO MEMBER "
					+ "   VALUES (?,?,?)";
			pstm = conn.prepareStatement(sql);
			
			pstm.setString(1, id);
			pstm.setString(2, pw);
			pstm.setString(3, nick);
			
			result = pstm.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		close();
		return result;
		
	}
	
	public String Login(String id, String pw) throws SQLException {
		getConn();
		String nick = null;
		String sql = "SELECT ID"
				+ "        , NICK "
				+ "     FROM MEMBER "
				+ "    WHERE ID = ? "
				+ "      AND PW = ? ";
		pstm = conn.prepareStatement(sql);
		
		pstm.setString(1, id);
		pstm.setString(2, pw);
		
		rs = pstm.executeQuery();
		if(rs.next()) {
			nick = rs.getString("NICK");
		}
		close();
		return nick;
	}
	
	public ArrayList<UserDTO> getAllMember() {
		getConn();
		ArrayList<UserDTO> userList= new ArrayList<UserDTO>();
		try {
			String sql = "SELECT *"
					+ "     FROM MEMBER";

			pstm = conn.prepareStatement(sql);
			rs = pstm.executeQuery();
			while(rs.next()) {
				String id = rs.getString(1);
				String pw = rs.getString(2);
				String nick = rs.getString(3);
				UserDTO dto = new UserDTO(id,pw,nick);
				userList.add(dto);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		close();
		return userList;
	}
}
