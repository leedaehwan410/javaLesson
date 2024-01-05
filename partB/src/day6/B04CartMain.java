package day6;

import java.util.Arrays;
import java.util.Scanner;

public class B04CartMain {
    
    public static void main(String[] args) {
        
        Cart momos_Cart = new Cart();       //String, String[], int[] 필드는 null

        //모모의 장바구니-상품이름 , 가격
        String[] products={"새우깡","칠성사이다","빅토리아","제주감귤","나주배","야채호빵","이클립스"};
        int[] prices = {3000,2500,9900,12000,9870,6000,1500};

        //장바구니 값을 저장합니다.
        momos_Cart.setUserid("모모");
        momos_Cart.setProductNames(products);
        momos_Cart.setPrice(prices);
        

        Scanner sc = new Scanner(System.in);

        System.out.println(momos_Cart.getuserid()+"님의 장바구니 입니다.");
        System.out.println(String.format("%s\t %15s\t\t %s","번호","상품명","가격"));

        for(int i=0;i<products.length; i++){
            System.out.println(String.format("%d\t %15s\t\t %d",i,products[i],prices[i]));
        }

        System.out.println("구매할 상품 번호를 선택하세요 선택 종료는 -1 입니다.");
        int sel=0;          //sel 값은   ,k값은 배열[]안의 입력받는index값들을 하나하나 알려주는값   
                            //*포인트는 배열을 입력받을때는 변수 선언을2개이상하자
        int[] select = new int[5];      //상품 선택 개수는 최대 5개
        int k=0;        //selcet 배열 인덱스
        while (sel!=-1 && k<select.length) {
            System.out.println("상품번호 입력>>>");
            sel = sc.nextInt();
            //sel의 선택범위는 productNames 범위안에서 선택 인덱스 범위값만
            if(sel<-1 || sel>select.length-1){
                System.out.println("없는 상품입니다.");
                continue;
            }
        }

        if(k==select.length)
            System.out.println("장바구니 가득채워주셔서 감사합니다");

        System.out.println("선택 하신 상품은" + Arrays.toString(select));
        momos_Cart.total_Money(select);
        System.out.println(momos_Cart.getuserid()+"님이 선택하신 상품 합계 :"+ momos_Cart.total_Money(select));

        //momos_Cart.setTotal_Money(200000);          //setter 메소드가 여기서는 필요없습니다.
                                                      //total_Money 메소드가 대신 값을 계산해서 저장할것입니다.

        
        

        //필요에 따라서는 기존의 setter 메소드는 사용하지 않고
        //  추가적인 비지니스 로직을 구현하는 메소드를 만듭니다.

    }

}
