package ldh;

import day7.Diamond;

public class B11DiamonTest {
    //B10과 동일한 코드 작성하면서 실행해보기

    public static void main(String[] args) {
        
        Diamond diamond = new Diamond();

        System.out.println("다이아몬드 너비 :" + diamond.getWidth());
        System.out.println("다이아몬드 높이 :" + diamond.getHeight());
        System.out.println("다이아몬드 넓이 :"+ diamond.calculateArea());
        diamond.print();


        //아래 주석 코드는 모두 오류
        // diamond.round =3;       // 접근한정자가 없기때문에 day7 패키지 클래스가 아니라서 오류
        // diamond.etc="테스트";   // 자식의 자식클래스이고 day7 패키지 클래스가아니라서 사용불가?

        diamond.border=3.45;    //패키지도 다르고 상속관계도 아니지만 public 필드는 어디서나 사용가능



    }

}
