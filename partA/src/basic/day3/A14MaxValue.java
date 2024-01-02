package basic.day3;

public class A14MaxValue {
    
    public static void main(String[] args) {
        int n1 = 21;
        int n2 = 32;
        int n3 = 42; 

        int max=0;
        //1) 조건식이 참/거짓 각각 실행명령어가 다릅니다.
        if(n1>n2) {
            max=n1;
        }else{
            max=n2;
        }
        //2) 조건식이 참일 때만 실행하는 명령어가 있습니다.
        if (max<n3){
            max=n3;
        }

        System.out.println("n1="+n1+",n2="+n2+"n3="+n3);
        System.out.println("max="+n3);


        
        n1= 99; n2=88; n3= 77;

        //조건 삼항연산을 대입문에 활용해 봅니다.
        max= 0;
        max= n1>n2? n1:n2;
        max = max<n3? n3:max;


          

        

        




    }
}
