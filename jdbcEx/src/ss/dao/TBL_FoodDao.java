package ss.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import ss.vo.TBL_BuyListVo;
import ss.vo.TBL_FoodVo;

public class TBL_FoodDao {
    public static final String URL ="jdbc:oracle:thin:@//localhost:1521/xe";
    public static final String USERNAME = "c##idev";
    private static final String PASSWORD = "1234";


private static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USERNAME, PASSWORD);
    }


 public int cancelOrder(int idx){
        int chk = 0;
        String sql = "DELETE FROM TBL_BUYLIST "+
                     "WHERE idx = ?";

        try (Connection conn = getConnection(); PreparedStatement pstmt = conn.prepareStatement(sql)) {
            
            pstmt.setInt(1, idx);
            chk = pstmt.executeUpdate();

        } catch (SQLException e) {
            System.out.println("주문취소 실행 예외 : "+e.getMessage());
        }
        return chk;
    }

    public List<TBL_BuyListVo> buyHistory(String id){
        String sql = "SELECT *         "+ 
                     "FROM TBL_BUYLIST "+
                     "WHERE ID = ?";
        List<TBL_BuyListVo> list = new ArrayList<>();

        try (Connection conn = getConnection(); 
            PreparedStatement pstmt = conn.prepareStatement(sql)) {           
                pstmt.setString(1, id);
                ResultSet rs = pstmt.executeQuery();

                while(rs.next()){
                    TBL_BuyListVo vo = new TBL_BuyListVo(rs.getInt(1),
                                                         rs.getString(2), 
                                                         rs.getString(3),
                                                         rs.getInt(4),
                                                         rs.getDate(5));
                list.add(vo);
            }
        } catch (SQLException e) {
            System.out.println("주문취소 쿼리 실행 예외 :" + e.getMessage());
        }
        return list;
    }



    public List<TBL_FoodVo> searchMenu_name(String user){
        List<TBL_FoodVo> list = new ArrayList<TBL_FoodVo>();
        String sql=null;
        sql = "SELECT *\r\n" + //
            "FROM TBL_FOOD\r\n" + //
            "WHERE FNAME LIKE '%'||?||'%'";   
        try (Connection connection = getConnection();
            PreparedStatement pstmt = connection.prepareStatement(sql);
            ){pstmt.setString(1, user);
              ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                    list.add(new TBL_FoodVo(rs.getString(1), 
                                        rs.getString(2), 
                                        rs.getString(3),
                                        rs.getInt(4),
                                        rs.getInt(5),
                                        rs.getInt(6)));
            }  
        } catch (Exception e) {
            System.out.println("메뉴 이름 검색 오류 : "+e.getMessage());
        }
        return list;
    }

    public List<TBL_FoodVo> searchMenu_category(String category){
        List<TBL_FoodVo> list = new ArrayList<TBL_FoodVo>();
        String sql=null;
        sql = "SELECT *\r\n" + //
            "FROM TBL_FOOD\r\n" + //
            "WHERE CATEGORY = ?";
        try (Connection connection = getConnection();
            PreparedStatement pstmt = connection.prepareStatement(sql);
            ){pstmt.setString(1, category);
              ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                    list.add(new TBL_FoodVo(rs.getString(1), 
                                        rs.getString(2), 
                                        rs.getString(3),
                                        rs.getInt(4),
                                        rs.getInt(5),
                                        rs.getInt(6)));
            }  
        } catch (Exception e) {
            System.out.println("메뉴 - 카테고리 검색 오류 : "+e.getMessage());
        }
        return list;
    }
    



    public void cheapsbuger1(){
        String sql = "SELECT * "+
                     "FROM TBL_FOOD WHERE CATEGORY = 'BUGER' "+
                     "AND PRICE <= 5000 "+
                     "ORDER BY PRICE ASC";
        try (Connection conn = getConnection(); PreparedStatement pstmt = conn.prepareStatement(sql)) {
            ResultSet rs = pstmt.executeQuery();
            while(rs.next()){
                TBL_FoodVo vo = new TBL_FoodVo(rs.getString(1),
                                       rs.getString(2),
                                       rs.getString(3),
                                       rs.getInt(4),
                                       rs.getInt(5),
                                       rs.getInt(6));
                                       System.out.println(vo);
                                       
            } 
        } catch (SQLException e) {
            System.out.println("버거 출력 실행 예외: " + e.getMessage());
        }
    }


  


//전체 메뉴 조회 - viewMenu
public List<TBL_FoodVo> viewMenu1(){
    List<TBL_FoodVo> list = new ArrayList<TBL_FoodVo>();
    String sql = "SELECT * FROM TBL_FOOD";
    try (Connection connection = getConnection();
        PreparedStatement pstmt = connection.prepareStatement(sql);
        ResultSet rs = pstmt.executeQuery();)
        {
        while (rs.next()) {
               list.add(new TBL_FoodVo(rs.getString(1), 
                                    rs.getString(2), 
                                    rs.getString(3),
                                    rs.getInt(4),
                                    rs.getInt(5),
                                    rs.getInt(6)));
        }  
    } catch (Exception e) {
        System.out.println("메뉴 검색 오류 : "+e.getMessage());
    }
    return list;
}   



}