package jdbc.day1.day1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class OracleConnectionUtil {
        public static final String DRIVER = "oracle.jdbc.driver.OracleDriver";
        public static final String URL = "jdbc:oracle:thin:@//localhost:1521/xe";
        public static final String USERNAME = "c##idev";
        public static final String PASSWORD = "1234";

   

        //Connection 타입 객체 생성하는 메소드. 
        //Connection conn = OracleConnectionUtil.getConnection(); 로 사용할 것 입니다.
        public static Connection getConnection(){
            Connection conn = null;
            String driver = "oracle.jdbc.driver.OracleDriver";
            String url = "jdbc:oracle:thin:@//192.168.30.19:1521/XE";  //localhost는 서버의 ip로 바뀔 수 있습니다
            String user = "c##idev";
            String password="1234";
    
            try{
             
                Class.forName(driver);     
                conn= DriverManager.getConnection(url, user, password);
        }catch(Exception e){
            System.out.println("데이터베이스 연결 예외 발생 했습니다. \n\t :" +e.getMessage());
        }
    
        return conn;

        }
        //실행 순서 : 1)getConnection   2) SQL 실행     3) close
        //SQL 실행 : 개발 프로그램에서 가장 많이 실행시키는 sql은 DML 입니다.(select,insert,update,delete)
        //          OracleConnectionutil
        //인자로 전달된 Connection 객체를 close. sql 실행이 종료되면 close 해야 합니다.
        public static void close(Connection conn){
            try {
                if(conn != null)conn.close();
            } catch (SQLException e) {
                    System.out.println("데이터베이스 연결 해제 예외 발생 \n\t: " + e.getMessage());
            }
        }

}
