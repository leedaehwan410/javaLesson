package jdbc.day1.day1;

import project.dao.TblCustomerDao;
import project.vo.CustomerVo;

public class CustomerApp {
    
    public static void main(String[] args) {
        String customId=null;
        String name=null;
        String email=null;
        int age=0;

        boolean run = true;
        CustomerVo vo = new CustomerVo(customId, name, email, age, null);
        TblCustomerDao dao = new TblCustomerDao();



        System.out.println("메뉴를 선택하세요.\n1.회원가입 \n2.회원정보수정 \n3.회원 탈퇴");
        int select=Integer.parseInt(System.console().readLine());
        

        while (run) {

            switch (select) {
                case 1:
                System.out.println("우리 쇼핑몰 [회원가입] 환영합니다.");
                System.out.println("주의사항 : 아이디는 중복된 값을 저장하면 무결성 위반 오류입니다.");
                
                System.out.print(" 아이디를 입력하세요. __ ");
                customId = System.console().readLine();
                
                System.out.print(" 이름을 입력하세요. __ ");
                name = System.console().readLine();
        
                System.out.print(" 이메일을 입력하세요. __ ");
                email = System.console().readLine();
        
                System.out.print(" 나이를 입력하세요. __ ");
                age = Integer.parseInt(System.console().readLine());
        
          
                dao.join(vo);
                System.out.println("회원 가입이 완료 되었습니다.");
                    break;
            
                case 2:
                   
        System.out.println("우리 쇼핑몰 [회원정보]-이메일과 나이 수정 합니다.");

        System.out.print(" 아이디를 입력하세요. __ ");
        customId = System.console().readLine();
        System.err.println();
        System.out.print(" 이메일을 입력하세요. __ ");
        email = System.console().readLine();
        System.out.print(" 나이를 입력하세요. __ ");
        age = Integer.parseInt(System.console().readLine());
       

        
        vo.setCustomId(customId);
        vo.setEmail(email);
        vo.setAge(age);
    

        dao.modify(vo);
                
                    break;

                case 3:
                System.out.println("우리 쇼핑몰 [회원탈퇴]- 합니다.");
                System.out.print(" 아이디를 입력하세요. __ ");
                customId = System.console().readLine();
                dao.delete(customId);


                case 4:
                        System.out.println("종료합니다.");
                    run = false;
                    break;

                    default:
                    System.out.println("잘못된 접근입니다.");
            }

        }



     


       
    }   //main end

}   // 이클래스는 TblCustomerDao 테스트를 위한 실행 클래스입니다.
