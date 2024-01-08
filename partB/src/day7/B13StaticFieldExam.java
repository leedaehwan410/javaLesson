package day7;
//대표적인 자바클래스 static 필드 확인해보기
public class B13StaticFieldExam {

    public static void main(String[] args) {
        //Wrapper 클래스들 : 기본 자료형을 클래스 타입 즉 객체로 다룰 수 있게 해줍니다.
        
        //Integer
        System.out.println("Integer.MAX_VALUE="+Integer.MAX_VALUE);
        System.out.println("Integer.MIN_VALUE="+Integer.MIN_VALUE);
        System.out.println("Interger.SIZE="+Integer.SIZE);   //32비트
        System.out.println("Interger.BYTES="+Integer.BYTES); //4바이트
        //Long
        System.out.println("\nLong.MAX_VALUE="+Long.MAX_VALUE);
        System.out.println("\nLong.MIN_VALUE="+Long.MIN_VALUE);
        System.out.println("\nLong.SIZE="+Long.SIZE);   //32비트
        System.out.println("\nLong.BYTES="+Long.BYTES); //4바이트
        //Double
        System.out.println("\nDouble.MAX_VALUE="+Double.MAX_VALUE);
        System.out.println("\nDouble.MIN_VALUE="+Double.MIN_VALUE);
        System.out.println("\nDouble.SIZE="+Double.SIZE);   //32비트
        System.out.println("\nDouble.BYTES="+Double.BYTES); //4바이트
        //Character
        System.out.println("\nCharacter.MAX_VALUE="+(int)Character.MAX_VALUE);
        System.out.println("\nCharacter.MIN_VALUE="+(int)Character.MIN_VALUE);
        System.out.println("\nCharacter.SIZE="+Character.SIZE);   //32비트
        System.out.println("\nCharacter.BYTES="+Character.BYTES); //4바이트

        System.out.println("Shape.MAX_WIDTH="+Shape.MAX_WIDTH);     //100
        System.out.println("Diamond.MAX_WIDTH="+Diamond.MAX_WIDTH); //100 ->상속받음
        System.out.println("Triangle.MAX_WIDTH="+Triangle.MAX_WIDTH);//90 -> 상수 재정의

    }
}
/*
 * public : 모두에게 공개
 * static : 객체없이 사용할 수 있는 필드 또는 값.정적인..메모리 공유영역에 모여서 저장됨.
 * final 필드: 값을 변경 못함. 
 * (참고)fianl 메소드 : 오버라이딩 제한.(못함)
 * 
 * public static int abc;
 * public final int xyz;
 * 
 * 위의 2가지 경우보다는 의미상 조합이 public static final 이 맞습니다.
 * 영원히 고정되는 값에 대해 기호를 부여하는 상수의 개념입니다.
 * 그리고 상수는 모두 대문자로 약속해서 작성합니다.
 */