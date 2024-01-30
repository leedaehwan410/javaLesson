package koreait.solution;

public class ProductApp {
    
    public static void main(String[] args) {
        //[1]
        Product[] cart  = new Product[10];
        cart[0]=new Bike(123000,"MTB",25);
        cart[1]=new Electronics(35000,"USB");
        cart[3]=new Bike(99000,"삼천리",15);
        cart[5]=new Electronics(527000,"스마트tv");
        cart[7]=new Electronics(2250000,"lg냉장고");
        //[2] cart 배열5번 인덱스가 참조하는 객체 kwh 필드값을 0.9로하고
        // power()메소드를 실행하여 리턴받은 값을 출력하세요.
        if (cart[5] instanceof Electronics) {
            Electronics tv = (Electronics)cart[5];
            tv.setKwh(0.9);
            System.out.println(tv.power());
        }
        //[3] cart 배열에서 참조하는 객체중 상품 중 가격이 10만원 이상인것을
        //출력하세요. 출력은 toString 메소드로 합니다.
        for(Product p : cart){
            if(p!= null && p.getPrice()>=100000){
                System.out.println(p.toString());
            }
        }
        //[4] cart 배열이 참조하는 객체 중 Bike 객체만 ride() 
        //메소드를 실행하여 리턴받은 값을 출력합니다.
        for(Product p : cart){
            if(p!= null && p instanceof Bike){
                Bike bike = (Bike)p ;
                System.out.println(bike.ride());
            }
        }

        //[5] 인덱스 3번 객체에 대해 sell 메소드실행
        //메소드 인자값은 정수 20
    
        System.out.println(cart[3].sell(20));
        System.out.println(cart[5].sell("사운드바"));



        //[6] 인덱스 5번 객체에 대해 sell 메소드실행
        //메소드 인자값은 문자열"사운드바"
    }
}

/*
 * 자바 교재 204페이지
 * 라이브러리 클래스 : Product, Bike Electronics, 그리고 제일 중요한 자바 클래스들
 *                      ㄴ 프로그래밍에 필요한 재료로 사용되는 클래스
 *                      ㄴ 인스턴스 메소드와 static 메소드로 제공되는 기능을 사용함.
 * 실행 클래스 : ProductApp
 *                  ㄴ main 메소드를 포함하여 프로그램을 실행함.
 *                  ㄴ main 메소드는 반드시 static 이어야 합니다.
 *                  ㄴ main 메소드를 위한 객체를 먼저 생성할 수 없다.그래서 static 입니다.
 * 
 * 설명 예시 : Bike 클래스의 sell 메소드 Object 인자값은 외부에서 줍니다.
 *             여기서 외부는 이 메소드를 사용하는 main 또는 다른 클래스를 말합니다.
 *             라이브러리 클래스의 특히 인스턴스 필드값은 실행될때 결정됩니다.
 * 
 */