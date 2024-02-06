package jdbc.day1.day3;

public class Kiosk {


    private void orderMenu(){
        System.out.println("주문할 음식이름을 입력하세요");
        String fname= System.console().readLine();
        System.out.println("주문할 수량을 입력하세요");
        int quantity= Integer.parseInt(System.console().readLine());
        
    }


    private void showMenu() {
        System.out.println(".".repeat(70));
        System.out.println("[C] 주문하기      [P] 주문 수정     [M]주문 취소 ");
        System.out.println("[B] 구매 내역   [D] 메뉴 검색  [Q] 전체 메뉴 조회  [X] 구매 종료");
        System.out.println(".".repeat(70));
    }


    public void start() {
        
        System.out.println("구매할 사용자 간편 로그인 필요합니다.");
        System.out.print("아이디 입력 __");
        String id = System.console().readLine();
        System.out.println( " 님 환영합니다.♡");
        boolean run = true;
        while (run) {       //메뉴 선택 반복
            showMenu();
            System.out.print("선택하세요>>> ");   
           String select = System.console().readLine();
            switch (select.toUpperCase()) {
                case "C": 
                // orderMenu() - 주문하기
                    break;
                case "P":
                // modifyOrder() - 주문수정
                    break;  
                case "M":
                // cancelOrder() - 주문취소
                    break;
                case "B":
                // buyHistory() - 구매내역
                    break;
                case "D":
                // searchMenu() - 메뉴검색
                    break;    
                case "Q":
                // viewMenu() - 전체메뉴조회
                    break;
                case "X":
                    run=false;
                    break;                
                default:
                    break;
            }
        }

    }
}
