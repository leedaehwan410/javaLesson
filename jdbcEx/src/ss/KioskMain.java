package ss;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import ss.dao.TBL_BuyListDao;
import ss.dao.TBL_CustomerDao;
import ss.dao.TBL_FoodDao;
import ss.vo.TBL_BuyListVo;
import ss.vo.TBL_FoodVo;
public class KioskMain {


    private TBL_BuyListDao buyListDao = new TBL_BuyListDao();
    private TBL_FoodDao foodDao = new TBL_FoodDao();
    private TBL_CustomerDao customerDao = new TBL_CustomerDao();
    private List<TBL_FoodVo> buylist = new ArrayList<>();
    private List<TBL_BuyListVo> buylist2 = new ArrayList<>();
    private String id = null;
    private int idx = 0;
    private int quantity=0;
    

public static void main(String[] args) {
    KioskMain kiosk = new KioskMain();
    kiosk.start();
}


    private void orderMenu() {
        System.out.println("구매할 음식 코드를 입력__\n뒤로 돌아가고 싶으시면 r을 입력하세요");
        String pcode =System.console().readLine();
        pcode=pcode.toUpperCase();
        if(pcode.equalsIgnoreCase("r")){
            return;
        }
        System.out.println("구매할 음식의 갯수를 입력__");
        int quantity = Integer.parseInt(System.console().readLine());
        TBL_BuyListVo vo = new TBL_BuyListVo(0, id, pcode, quantity, null);

        if (buyListDao.insert(vo)==1) {
            System.out.println("음식을 주문했습니다.");
        }else{
                System.out.println("음식코드 또는 고객 아이디 오류입니다.");
        }
    }    
   

    private void modifyOrder(){
        
        System.out.println("주문 수량을 변경 할 제품 번호를 입력__\n 뒤로 돌아가고싶으면 0을 입력하세요");
        
        idx = Integer.parseInt(System.console().readLine());
        if(idx==0){
            return;
        }
        System.out.println("변경할 수량을 입력__");
        quantity = Integer.parseInt(System.console().readLine());

        Map<String,Integer> arg = new HashMap<>();

        arg.put("idx", idx);
        arg.put("quantity", quantity);

        if (buyListDao.modify(arg)==1) 
            System.out.println("정상적으로 수정 되었습니다.");
        else
            System.out.println("없는 구매번호 입니다.");
    }


  
    private void setMenu(String id) {
        boolean run=false;
        while(run != true){
            System.out.println("햄버거 상품코드를 입력하세요");
            for(int i = 0; i<=22; i++){
                System.out.println(foodDao.viewMenu1().get(i));
            }
            String pcode = System.console().readLine();
            pcode = pcode.toUpperCase();
            System.out.println("수량을 입력하세요");
            int quantity1 = Integer.parseInt(System.console().readLine());
            
        if(buyListDao.buyHistory2(pcode)==1)
            {buylist2.add(new TBL_BuyListVo(0, id, pcode, quantity1, null));
            System.out.println("상품을 담았습니다.");
            run = true;}
        else
            {System.out.println("상품코드 또는 고객 아이디 오류입니다.");
            continue;}}
        
        boolean run2=false;
        while(run2 != true){    
            System.out.println("디저트 상품코드를 입력하세요");
            for(int i = 24; i<=34; i++){
                System.out.println(foodDao.viewMenu1().get(i));
            }
            String pcode2 = System.console().readLine();
            pcode2 = pcode2.toUpperCase();
            System.out.println("수량을 입력하세요");
            int quantity2 = Integer.parseInt(System.console().readLine());
            if(buyListDao.buyHistory2(pcode2)==1)
                {buylist2.add(new TBL_BuyListVo(0, id, pcode2, quantity2, null));
                System.out.println("상품을 담았습니다.");
                run2 = true;}
            else {System.out.println("상품코드 또는 고객 아이디 오류입니다.");
                continue;}
            }
        boolean run3=false;
        while(run3 != true){ 
            System.out.println("음료수 상품코드를 입력하세요");
            for(int i = 43; i<=58; i++){
                System.out.println(foodDao.viewMenu1().get(i));
            }
            String pcode3= System.console().readLine();
            pcode3 = pcode3.toUpperCase();
            System.out.println("수량을 입력하세요");
            int quantity3 = Integer.parseInt(System.console().readLine());
        
            if(buyListDao.buyHistory2(pcode3)==1)
                {buylist2.add(new TBL_BuyListVo(0, id, pcode3, quantity3, null));
                System.out.println("상품을 담았습니다.");
                run3 = true;}
            else
                {System.out.println("상품코드 또는 고객 아이디 오류입니다."); 
                continue;}} 
            System.out.println("\n"+buylist2.get(1).getId()+"님의 현재 장바구니 목록");
            System.out.println();
            for (int i = 0; i < buylist2.size(); i++) {
                System.out.println("상품코드: "+buylist2.get(i).getPcde()+"\t 구매수량: "+buylist2.get(i).getQuantity());
            }
            System.out.println("\n구매하시겠습니까? Y/N");
            String buyselect = System.console().readLine();
            buyselect=buyselect.toUpperCase();
            if(buyselect.equals("Y")){
                System.out.println("결제가 완료 되었습니다. 초기메뉴로 돌아갑니다.");
                buyListDao.insertMany(buylist2);
                start();}
            else {System.out.println("주문이 취소되었습니다. 초기 메뉴로 돌아갑니다.");
                buylist2.removeAll(buylist2);
                start();}
    }


    public void cancelOrder(){
        System.out.println("현재 구매내역 입니다.");
        buyHistory();
        System.out.print("구매 취소 항목의 번호를 선택해 주십시오.__ 뒤로 돌아가고싶으면 0을 입력하세요");       
        int idx = Integer.parseInt(System.console().readLine());
        if (idx == 0) {
            return;
        }
        if(buyListDao.delete(idx)==1){
            System.out.println("구매취소 성공!");
        }else{
            System.out.println("구매번호 오류입니다.");
        }   
    }

    public void buyHistory(){
        System.out.println("구매내역입니다");
         System.out.println(buyListDao.buyHistory(id));

    }

    public void searchMenu(){
        

            System.out.println("메뉴를 검색합니다. \n 1. 카테고리별 검색 \t2. 이름 검색");
            int selectNum = Integer.parseInt(System.console().readLine());
            if(selectNum == 1){
                System.out.println("카테고리:\tICE\t\tDRINK\t\tCHICKEN\t\tDESSERT\t\tBUGER");
                System.out.println("카테고리를 적어주세요");
                String category = System.console().readLine();
                category = category.toUpperCase();
                buylist= foodDao.searchMenu_category(category);}
            else if(selectNum == 2 ){
                System.out.println("제품의 이름을 적어주세요");
                String fname = System.console().readLine();
                buylist = foodDao.searchMenu_name(fname);}
            else{System.out.println("잘못된 선택입니다.");
                }
            for(TBL_FoodVo vo : buylist) System.out.println(vo);
                
    
        }

    public void viewMenu(){
        System.out.println("전체 메뉴 입니다.");
        List<TBL_FoodVo> list = new ArrayList<>();
        list = foodDao.viewMenu1();
        for(TBL_FoodVo vo : list){
            System.out.println(vo);
        }
    }  

    public void cheapsbuger(){
        System.out.println("오늘의 추천 메뉴 입니다.");
        foodDao.cheapsbuger1();
    }

    
    private void showMenu() {
        System.out.println(".".repeat(70));
        System.out.println("");
        System.out.println("1. 주문 하기\t 2. 주문 수정\t\t 3. 주문 취소\t4. 구매 내역");
        System.out.println("5. 메뉴 검색\t 6. 전체 메뉴 조회\t 7. 추천 버거\t 8.세트메뉴 구매 \t 9.종료");
        System.out.println(".".repeat(70));
    }


    public void start() {
        
        System.out.println("로그인이 필요한 서비스입니다.");
        while(true){
            System.out.print("아이디 입력 __");
            id = System.console().readLine();
            if(customerDao.loginChk(id) == null){
                System.out.println("잘못된 아이디 입니다. 다시 입력해주세요.");
                continue;
            }else{
                break;
            }
        }
        System.out.println( id+" 님 환영합니다.♡");
        boolean run = true;
        while (run) {       //메뉴 선택 반복
            showMenu();
            System.out.print("선택하세요>>> ");   
           String select = System.console().readLine();
            switch (select) {
                case "1": 
                 orderMenu();  //주문하기
                    break;
                case "2":
                modifyOrder(); //- 주문수정 
                    break;  
                case "3":
                cancelOrder(); //- 주문취소
                    break;
                case "4":
                buyHistory(); //- 구매내역
                    break;
                case "5":
                searchMenu(); //메뉴 검색
                    break;
                case "6":
                viewMenu(); //전체 메뉴 검색
                    break;
                case "7":
                cheapsbuger(); //버거 추천
                break;
                case "8":
                setMenu(id); //세트메뉴 구매
                break;
                case "9":
                run=false;
                break;
                // case "10":
                // setMenu(); 
                // break;
                default:
                    break;
                   
            }
        }

    }
}
