package basic.day3;

public class A15MinValue {      //가장 작은 값 찾기
    
    public static void main(String[] args) {
        int n1 = 5;
        int n2 = 67;
        int n3 = 42; 

        int min=0;
        //1) 조건식이 참/거짓 각각 실행명령어가 다릅니다.
        if (n1<n2) {
            min=n1;
        }else{
            min=n2;
        }
        if (min>n3) {
            min=n3;
        }
        System.out.println("min="+min);

        n1=8;n2=2;n3=40;
        min=0;

        min=n1<n2?n1:n2;
        min=min<n3?min:n3;
        System.out.println("min="+min);


          

        

        




    }
}
