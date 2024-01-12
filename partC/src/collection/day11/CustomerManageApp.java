package collection.day11;

import java.util.ArrayList;
import java.util.List;

public class CustomerManageApp {
    //1월14일 저녁 9시까지 제출해주세요.

    private List<Customer> gg = new ArrayList<>();
    private void start() {
        initialize();
        //메뉴 선택 : 등록,검색(이름/그룹),삭제,수정,전체출력
        System.out.println("고객관리 프로그램 시작합니다.~~~"+"~".repeat(30));
        while (true) {
            System.out.println("\t <메뉴를 선택하세요.>");
            System.out.println("\t 1. 고객 등록");
            System.out.println("\t 2. 고객 목록 출력");
            System.out.println("\t 3. 고객 검색");
            System.out.println("\t 4. 고객 삭제");
            System.out.println("\t 5. 고객 수정");
            System.out.println("\t 6. 프로그램 종료");
            System.out.print("선택 > ");             
            int select=Integer.parseInt(System.console().readLine());
            switch (select) {
                case 1:
                    addCustomer();
                    break;
                case 2: listCustomer();
                    break;
                case 3:searchCustomer();
                    break;
                case 4:removeCustomer();
                    break;
                case 5://modify();
                    break;
                case 6:
                    System.out.println("프로그램을 종료합니다.");
                    System.exit(0);
                default:
                System.out.println("잘못된 선택값 입니다");
            }
        }
    }
    
    private void initialize(){
        gg.add(new Customer("이대환", "z플립",3));
        gg.add(new Customer("권태윤", "아이폰",2));
        gg.add(new Customer("강주찬", "매직홀",1));
        gg.add(new Customer("노희영", "베가레이서", 3));
    }

    private void addCustomer() {
        System.out.println("고객을 등록합니다");
        System.out.println("이름을 입력하세요.");
        String name=System.console().readLine();
        System.out.println("핸드폰을 입력하세요.");
        String phone=System.console().readLine();
        System.out.println("그룹을 입력하세요.");
        int group=Integer.parseInt(System.console().readLine());
        gg.add(new Customer(name, phone, group));
    }
    private void listCustomer(){
        System.out.println("\t고객 목록 출력합니다");
       
        printCustomerList(gg);
    }

private void printCustomerList(List<Customer> list) {
    for(Customer customer : gg){
        System.out.println(String.format("%-20s %-30s %-20s",
         customer.getName(),customer.getPhone(),customer.getGroup()));

    }
}
private List<Customer> searchAllCustomer(String name){
    List<Customer> list = new ArrayList<>();
    for(Customer customer : gg) {
        if(customer.getName().equals(name)){
            list.add(customer);
        }
    }              return list;
}
private List<Customer> searchAllCustomer(int group){
    List<Customer> list = new ArrayList<>();
    for(Customer customer : gg) {
        if(customer.getGroup()==group){
            list.add(customer);
        }
    }           return list;
}


private void searchCustomer() {
    System.out.println("\t 고객명을 검색합니다.(핸드폰조회는1,그룹조회는2)");
    String find = null;
    List<Customer> list = null;
    switch (System.console().readLine()) {
        case "1":
        System.out.println("검색할 고객의 핸드폰을 입력하세요");
        find=System.console().readLine();
        list=searchAllCustomer(find);
            break;
        case "2":
        System.out.println("검색할 고객의 그룹을 입력하세요");
        find=System.console().readLine();
        int group=Integer.parseInt(find);
        list=searchAllCustomer(group);
        break;
        default:
        System.out.println("1,2만입력하세요.");
        return;
    }   
    System.out.println("\t:: 검색 결과 입니다.");
    if(list.size()==0) {System.out.println("찾는 고객이 명단에 없습니다.");}
    else printCustomerList(list);
}

private void removeCustomer() {
    System.out.println("\t 고객 삭제합니다.");
    System.out.println("삭제할 고객의 이름을 입력하세요.");
    String find = System.console().readLine();
    boolean isFind = false;
    for(int i=0;i<gg.size();i++) {
        if(gg.get(i).getName().equals(find)){
            isFind=true;
            System.out.println("인덱스"+i+"에서 고객을 찾았습니다.");
            System.out.println("삭제하려면 엔터, 취소는 n을 입력하세요.");
            if (System.console().readLine().equals("n")) 
                continue;
            else{
                gg.remove(i); System.out.println("단어 삭제 완료!");
            }
        }
    }
    if(!isFind)
        System.out.println("삭제할 고객은 고객명단에 없습니다.");
}

private void modify() {
    System.out.println("\t 고객님의 정보를 수정합니다.");
    System.out.println("수정할 고객의 이름을 입력하세요.");
    String find = System.console().readLine();
    boolean isFind = false;
    for (Customer customer : gg) {
        if (customer.getName().equals(find)) {

            isFind=true;
            System.out.println("고객을 찾았습니다.");
            System.out.println("수정하려면 엔터, 취소는 n을 입력하세요.");
            if (System.console().readLine().equals("n")) 
                continue;

                System.out.println("핸드폰을 입력하세요");
                String phone=System.console().readLine();
                System.out.println("그룹을 입력하세요.1.일반2.vip 3.기타");
                int group=Integer.parseInt(System.console().readLine());
                customer.modify(phone,group);
                System.out.println("수정이 완료되었습니다.");
                break;

            
        }
    }
    if(!isFind)
        System.out.println("수정할 고객은 고객명단에 없습니다.");
}



















    public static void main(String[] args) {
        //JavaWordApp V2 형식으로 하세요
     
        CustomerManageApp app = new CustomerManageApp();
        app.start();





    }

  
}
