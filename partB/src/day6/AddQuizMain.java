package day6;

import java.util.Scanner;
 // 숙제할 때 테스트하고 사용해야할 코드
    // System.out.println(" 난수(컴퓨터가 만들어주는 임의 값) - random");
    // System.out.println(" 난수값을 만들어주는 방법은 Math.random()");
    // System.out.println(" 0~1 사이의 double 실수를 무작위로 만들어줍니다.");

    // 0 < 난수 < 1    => 로또 값처럼 1 <= 로또번호 <= 45
    //  원래 난수값 범위에 *45를 하고       0 < 난수*45 < 45   
    //  그 값에 다시 +1 하면 됩니다.        1 < 난수*45+1 < 46
    //  난수의 범위를 start ~ end 범위로 조정하려면
    //  (int)(Math.random()*(end-start+1))+start
public class AddQuizMain {
   
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        AddQuiz first = new AddQuiz(0, 0, sc.nextInt(),true );

        int userAnswer=0;

        
        int start=11; int end=99;
        for(int i=0;i<10;i++){
        int data1=(int)(Math.random()*(end-start+1))+start;
        System.out.println("11~99 범위의 난수 : " + data1);
        int data2=(int)(Math.random()*(end-start+1))+start;
        System.out.println("11~99 범위의 난수 : " + data2);
        quiz[i]= new AddQuiz(data1, data2, userAnswer, false)
        

     
        System.out.println("덧셈 10문제 퀴즈를 시작합니다.");
        System.out.println("1번."+first+"+"+first+"= ?");
        System.out.println("답 입력하세요>>>");
        userAnswer=sc.nextInt();
       System.out.println("1번."+first+"+"+first+"= ?");
        System.out.println("답 입력하세요>>>");
        userAnswer=sc.nextInt();
        System.out.println("3번");
        System.out.println("1번."+first+"+"+first+"= ?");
        userAnswer=sc.nextInt();
        System.out.println(":::::: 채점 하고 있습니다. ::::::");
        System.out.println("\t문제\t제출한답\t정답\t채점");
        System.out.println("1번.");
        System.out.println("2번.");
        System.out.println("3번.");
        System.out.println(":::맞은 갯수"+"입니다.");


        
    }
    }
}