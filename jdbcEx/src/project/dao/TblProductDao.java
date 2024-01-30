package project.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


import jdbc.day1.day1.OracleConnectionUtil;
import project.vo.ProductVo;

public class TblProductDao {
    public static final String URL ="jdbc:oracle:thin:@//localhost:1521/xe";
    public static final String USERNAME = "c##idev";
    private static final String PASSWORD = "1234";
    
 private Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USERNAME, PASSWORD);
    }

public List<ProductVo> selectByCategory(String category){
    List<ProductVo> list = new ArrayList<>();
    String sql="SELECT * FROM TBL_PRODUCT\r\n"+
    "WHERE  CATEGORY =? \r\n"+
	"ORDER BY PNAME ";

try 
(Connection connection = OracleConnectionUtil.getConnection();
    PreparedStatement pstmt = connection.prepareStatement(sql)) {

        pstmt.setString(1, category);
        ResultSet rs = pstmt.executeQuery();

        while (rs.next()) {  //조회결과는 n행 가능성 예측
            list.add(new ProductVo(rs.getString(1),
            rs.getString(2),
             rs.getString(3),
              rs.getInt(4)));
        }
            
        

}catch (SQLException e) {
        System.out.println("selectBycategory 예외 발생" + e.getMessage());
        e.printStackTrace();
    }
    return list;
    }



    public List<ProductVo> selectByPname(String pname){
        List<ProductVo> list = new ArrayList<>();
        String sql="SELECT * FROM TBL_PRODUCT \r\n"+ 
        "WHERE pname LIKE '%'|| ? || '%'";          //like는 유사 비교. %기호 사용
    
    try 
    (Connection connection = getConnection();
        PreparedStatement pstmt = connection.prepareStatement(sql)) {
    
            pstmt.setString(1, pname);
            ResultSet rs = pstmt.executeQuery();
    
            while (rs.next()) {
                list.add(new ProductVo(rs.getString(1),
                rs.getString(2),
                 rs.getString(3),
                  rs.getInt(4)));
            }
                
            
    
    }catch (SQLException e) {
            System.out.println("selectByPname 예외 발생" + e.getMessage());
            e.printStackTrace();
        }
        return list;
        }

}
