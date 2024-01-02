package basic.day3;

import basic.day2.Stirng;

public class A17ForWhileExam {
    
    public static void main(String[] args) {
    //반복문 for가 활용되는 예시

    String message = "Hello, World~ Hoi";

    for(int i=0; i<message.length();i++) {
        char temp=message.charAt(i);
        System.out.println("i="+i+"글자="+temp);
    }   

    int k = 0;
    while (k<message.length()) {
        k++;
        System.out.println("");
    }

        // // 위의 for문을 while문으로 바꿔서 출력
    

    



            }

        

  

    }// main
// class