package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class DAO {
	private Connection conn = null;
	private PreparedStatement pstm = null;
	private ResultSet rs = null;
	
	private void getConn() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			// 연결시 필요한 값 (url, id, pw)
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String id = "service";
			String pw = "12345";

			conn = DriverManager.getConnection(url, id, pw);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	
	private void getClose() {
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
	
    // 활 정보를 전부 가져오는 메서드
	public ArrayList<ItemVO> getBowItem() throws SQLException {
		getConn();
		ArrayList<ItemVO> BowList= new ArrayList<>();
		String sql = "SELECT * FROM BOW";
		pstm = conn.prepareStatement(sql);

		rs = pstm.executeQuery();
		while(rs.next()) {
			BowVO item = new BowVO(0,null,0,0);
			item.setItemNum(rs.getInt(1));
			item.setName(rs.getString(2));
			item.setAttackPower(rs.getInt(3));
			item.setDurability(rs.getInt(4));
			BowList.add(item); // upcasting
			
//			bowItem.add(new BowVO(rs.getInt("ITEMNUM")
//					,rs.getString("NAME")
//					,rs.getInt("ATTACKPOWER")
//					,rs.getInt("DURABILITY") 
//					));
		}
		getClose();
		return BowList;
	}
	
	// 검 정보를 전부 가져오는 메서드
	public ArrayList<ItemVO> getSwordItem() throws SQLException {
		getConn();
		ArrayList<ItemVO> swordList = new ArrayList<>();
		String sql = "SELECT * FROM SWORD";
		pstm = conn.prepareStatement(sql);

		rs = pstm.executeQuery();
		while(rs.next()) {
			swordList.add (new SwordVO(rs.getInt("ITEMNUM")
					,rs.getString("NAME")
					,rs.getInt("ATTACKPOWER")
					));
		}
		getClose();
		return swordList;
	}
	

	
	
	
}
