package basic.day3;

public class A16MaxMinValue {      //최대값 최소값 찾기
    
    public static void main(String[] args) {
        int n1 = 5;
        int n2 = 67;
        int n3 = 42;

        int min=0;
        int max=0;
        //1) 조건식이 참/거짓 각각 실행명령어가 다릅니다.
        if (n1<n2) {
            min=n1;
            max=n2;
        }else{
            min=n2;
            max=n1;
        }
        //앞으로 참 또는 거짓일 때 실행하는 명령문이 1개 이면 {} 생략하고 할 수 있습니다.



        if(min>n3) min=n3;
        if(max<n3) max=n3;
        

    System.out.println("max="+max);
    System.out.println("min="+min);


          

        

        




    }
}
