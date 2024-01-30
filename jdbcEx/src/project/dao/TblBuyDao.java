package project.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import oracle.jpub.runtime.OracleDataUtil;
import project.vo.BuyVo;
import project.vo.CustomerBuyVo;
import project.vo.ProductVo;

public class TblBuyDao {
    public static final String URL ="jdbc:oracle:thin:@//localhost:1521/xe";
    public static final String USERNAME = "c##idev";
    private static final String PASSWORD = "1234";

 private Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USERNAME, PASSWORD);
    }
    public void cart(BuyVo vo){
        String sql="insert into tbl_buy \r\n"+
        "values (buy_pk_seq.nextval,?,?,?,sysdate)";
       try(    
            Connection connection = getConnection();                   
            PreparedStatement pstmt = connection.prepareStatement(sql); 
        ){
            pstmt.setString(1,vo.getCustomid());
            pstmt.setString(2,vo.getPcode());
            pstmt.setInt(3,vo.getQuantity());
            pstmt.executeUpdate();
            
        }catch(SQLException e){
            System.out.println("cart 실행 예외 발생 : " + e.getMessage());
        }

    }
    //구매 수량 삭제 -pk 는 행 식별합니다. 특정 행을 수정하려면 where 조건컬럼은 buy_idx(pk)
    public void delete(int buy_idx){

        String sql="DELETE FROM TBL_BUY  \n"+
        "WHERE  buy_idx = ?";
       try(    
            Connection connection = getConnection();                   
            PreparedStatement pstmt = connection.prepareStatement(sql); 
        ){
            
            pstmt.setInt(1,buy_idx);
           
            pstmt.executeUpdate();
            
        }catch(SQLException e){
            System.out.println("delete 실행 예외 발생 : " + e.getMessage());
        }
    }
    //구매 수량 수정 - pk 는 행 식별합니다. 특정 행을 수정하려면 where 조건컬럼은 buy_idx(pk)
    public void modify(BuyVo vo){
        String sql="UPDATE TBL_BUY \r\n" + //
        "\tSET quantity=?\r\n" + //
        "\tWHERE buy_idx =?";
       try(    
            Connection connection = getConnection();                   
            PreparedStatement pstmt = connection.prepareStatement(sql); 
        ){
            pstmt.setInt(2,vo.getBuy_idx());
            pstmt.setInt(1,vo.getQuantity());
            pstmt.executeUpdate();
            
        }catch(SQLException e){
            System.out.println("modify 실행 예외 발생 : " + e.getMessage());
        }
    }




        //mypage 기능의 메소드.
    public List<CustomerBuyVo> selectCustomerBuyList(String customid){
            List<CustomerBuyVo> list = new ArrayList<>();
        String sql= "SELECT BUY_IDX,tb.PCODE,PNAME,PRICE,QUANTITY ,BUY_DATE \r\n" + //
                "\tFROM TBL_BUY tb\r\n" + //
                "\tJOIN TBL_PRODUCT tp \r\n" + //
                "\tON tb.PCODE = tp.PCODE \r\n" + //
                "\tWHERE tb.CUSTOMID=?\r\n"+
                "order by buy_date desc";

        try (Connection connection = getConnection();
        PreparedStatement pstmt = connection.prepareStatement(sql);) 
        {
             pstmt.setString(1, customid);
            ResultSet rs = pstmt.executeQuery();

            while (rs.next()) {  
                CustomerBuyVo vo = new CustomerBuyVo(rs.getInt(1),
                rs.getString(2),
                rs.getString(3),
                rs.getInt(4),
                rs.getInt(5),
                rs.getTimestamp(6)); 
list.add(vo);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        return list;
    }


//mypage 기능의 메소드
    // selectCustomerBuyList -> TblBuyDao에 만들어라
    // 아래 조회된 행들에 대해 컬럼과 매핑되는 CustomerBuyVO를 만들어야 한다.

}
