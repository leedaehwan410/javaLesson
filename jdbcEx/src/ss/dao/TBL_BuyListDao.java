package ss.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import ss.vo.TBL_BuyListVo;

public class TBL_BuyListDao {
    public static final String URL ="jdbc:oracle:thin:@//localhost:1521/xe";
    public static final String USERNAME = "c##idev";
    private static final String PASSWORD = "1234";

private static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USERNAME, PASSWORD);
    }

// 구매하기
public int insert(TBL_BuyListVo vo){
    
    String sql = "insert into tbl_buyList VALUES" +
    "(LIST_SEQ.NEXTVAL, ? , ? , ? , sysdate)";
    int result = 0;
    try(Connection connection = getConnection();        
        PreparedStatement pstmt = connection.prepareStatement(sql);) {
      pstmt.setString(1, vo.getId());
      pstmt.setString(2, vo.getPcde());
      pstmt.setInt(3, vo.getQuantity());
     

            result = pstmt.executeUpdate();
    } catch (SQLException e) {
       
        System.out.println("구매하기 실행 예외 발생 : " + e.getMessage());
    }return result;
}




public int modify (Map<String, Integer> arg){ 
    int result = 0;
    String sql = "UPDATE TBL_BUYLIST SET QUANTITY = ? WHERE idx = ?";
    try (Connection connection = getConnection();
        PreparedStatement pstmt = connection.prepareStatement(sql);){
            pstmt.setInt(1, arg.get("quantity"));
            pstmt.setInt(2, arg.get("idx"));
            result = pstmt.executeUpdate(); 
          
    } catch (SQLException e) {
        System.out.println("구매 수량 변경 예외 발생 : " + e.getMessage());
    } return result;

}

public int delete(int idx){
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




//세트구매
public int insertMany (List<TBL_BuyListVo> cart){ //여러번의 (cart 크기)만큼 insert 실행
    String sql = "INSERT INTO TBL_BUYLIST (IDX, ID, FCODE, QUANTITY, BUY_DATE)\r\n" + //
                "VALUES(LIST_SEQ.NEXTVAL, ?, ?, ?, TO_DATE(sysdate,'yyyy-mm-dd'))";
    int count =0;
    Connection connection=null;
    PreparedStatement pstmt=null;

    try {connection = getConnection();       //auto close
        pstmt = connection.prepareStatement(sql);
        connection.setAutoCommit(false);  //※auto commit 해제
            for(TBL_BuyListVo vo:cart){
                pstmt.setString(1, vo.getId());
                pstmt.setString(2, vo.getPcde());
                pstmt.setInt(3, vo.getQuantity());
                pstmt.addBatch(); // sql을 메모리에 모아두기, insert sql에 대입되는 매개변수 값이 매번 다름
                count++;
                }
                pstmt.executeBatch();   //sql 일괄실행
                connection.commit();
        } catch (SQLException e) { //예외발생: 트랜젝션 처리, 실행 중 무결성 오류 생기면 catch에서 rollback,
            try {                   //정상실행시 commit
                connection.rollback();
               
            } catch (Exception e1) {}
            count= -1;  //어차피 결제 못했으니 카운트를 음수로 (실패의 대표값)
            System.out.println("구매 불가능한 상품이 있습니다.");
            System.out.println("장바구니 구매 실행 예외 발생 : " + e.getMessage());
         }finally{  
            try{    
                pstmt.close();
                connection.close();
            }catch (Exception e1) {}
        }
    return count;
    } 
  
//세트메뉴 구매확인
public int buyHistory2(String pcde){
    boolean run1 = true;
    String sql = "SELECT FCODE\r\n" + //
                "FROM TBL_FOOD \r\n" + //
                "WHERE FCODE = ?";
    try (Connection connection = getConnection();
        PreparedStatement pstmt = connection.prepareStatement(sql);    
    ) {pstmt.setString(1, pcde);
        ResultSet rs = pstmt.executeQuery();
        run1 = rs.next();
    } catch (SQLException e) {
        System.out.println("구매내역 조회 오류"+e.getMessage()
        );
    } if(run1==true) return 1;
    else return 0;

}



}
