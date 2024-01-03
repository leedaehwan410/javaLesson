package basic.day4;

//for문 복습 :1) ~) 까지 구현.  6)구구단 출력하기
public class A22ForReview {

    


    public static void main(String[] args) {
        
       
      
     
       

       

        int m;
        int n;
        int sum=0;      //덧셈 결과를 저장할 변수
        long longresult=1; //곱셈 결과를 저장할 변수

        //1) 1부터 정수 n까지 더하기
        n=4;
        
        for(int i =1; i<=n;i++){
            sum+=i;        // sum=sum+i;
        }

        System.out.println(String.format("문제1) 1부터 %,d까지의 합계",n,sum));
        System.out.println("문제1) 1부터"+n+"까지의 합계:"+ sum);

          //2) 1부터 정수 n까지 곱하기
          n=4; 
          //int 타입은 정수-2147483648 ~ +2147483647 그래서 곱셈결과 큰 값이 나올것을 예상하면 long타입으로 합니다.
          //    n=20으로 int result 에 결과를 저장하면 -음수값이 나옵니다.(오버플로우)
          for(int i=1;i<=n; i++) {
            longresult*=i;
            // System.out.println(String.format("문제2) 1부터 %,d까지의 곱",n,longresult));
            System.out.println("문제2) 1부터"+n+"까지의 곱:" + longresult);
          }
          sum=0;
          longresult=1;
             //3) 시작값 정수 m 부터 마지막값 n까지 더하기
          m=5; n=8;
          for(int i=m;i<=n;i++){
            sum+=i;
            System.out.println("문제3= "+sum);
            // System.out.println(String.format("문제3) %d부터 %d까지의 더한값은=", m,n,sum));
          }
          m=2; n=2;
           //4) 시작값 정수 m 부터 마지막값 n까지 곱하기
           for(int i=m;i<=n;i++){
            longresult*=i;
            // System.out.println(String.format("문제4) %d부터 %d까지의 곱셈=", m,n,longresult));
            System.out.println("문제4="+longresult);
          }

            //5) 2의 n승 구하기 : 2를 n번 곱하기 (2진수에서는 많이 사용되는 연산)
            // n=5;
            // longresult=1; //초기화 꼭필요
            // for(int i=1;i<=n;i++){
            //     longresult*=2;
            //     System.out.println(String.format("문제5) 2의 %d 승 구하기=",n,longresult));

            // }


    }
}
