package ss.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TBL_CustomerDao {
    public static final String URL ="jdbc:oracle:thin:@//localhost:1521/xe";
    public static final String USERNAME = "c##idev";
    private static final String PASSWORD = "1234";

private static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USERNAME, PASSWORD);
    }
    public String loginChk(String id){
        String sql = "SELECT ID         "+
                     "FROM TBL_CUSTOMER "+
                     "WHERE ID = ?";
        String chk = null;
        try (Connection conn = getConnection(); PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, id);
            ResultSet rs = pstmt.executeQuery();
            while(rs.next()){
                chk = rs.getString(1);
            }
        } catch (SQLException e) {
            System.out.println("로그인 체크 실행 예외 :" + e.getMessage());
        }
        return chk;
    }










}
