package basic.day4;
//A25 소스파일은 구글드라이브에 올려주세요.

public class A25MySampleMethod {

    public static void main(String[] args) {
        //A22번 1) ~5) 을 각각 메소드로 정의해 보기 - 메소드안에서 출력문 만들지 않기
        // 1) sumToN    2) multiply1ToN 3) sumMToN  4) multiplyMToN 5)multiplyNof2
        

        System.out.println(sumToN(6));
        System.out.println(multiply1ToN(5));
        System.out.println(sumMToN(2, 9));
        System.out.println(multiplyMToN(5,9 ));
        System.out.println(multiplyNof2(8));
        // printGuguDan();

        int result= addMToN(2,5);

        boolean isOK = checkJumsu(200);
        System.out.println(isOK);
        System.out.println(addMToN(5, 8));

    }
     
     
    
   
     

    private static boolean checkJumsu(int i) {
        return i>0 && i<=100;
    }


    private static int addMToN(int i, int j) {
        int sum=0;
        for(int k=i;k<=j;k++){
            sum+=k;
        }
        return sum;
    }






    //1) 1부터 정수 n까지 더하기        
    public static int sumToN(int n) {
        int sum=0;
        for(int i=1; i<=n;i++){
        sum+=i;
        }
        return sum;
    }   //2) 1부터 정수 n까지 곱하기
    public static long multiply1ToN(int n) {
        long longresult=1;
        for(int i=1;i<=n; i++) {
            longresult*=i;
    }   return longresult;

    }   
    //3) 시작값 정수 m 부터 마지막값 n까지 더하기

    public static int sumMToN(int m,int n) {
       int sum=0;
        for(int i=m;i<=n;i++){
            sum+=i;
    }
        return sum;
    }
      //4) 시작값 정수 m 부터 마지막값 n까지 곱하기
      public static long multiplyMToN(int m,int n){
        long longresult=1;
        for(int i=m;i<=n;i++){
            longresult*=i;
      }  return longresult;
    }

    //5) 2의 n승 구하기 : 2를 n번 곱하기 (2진수에서는 많이 사용되는 연산)
    public static long multiplyNof2(int n){
        long longresult=1;
        for(int i=1;i<=n;i++){
            longresult*=2;
    }   return longresult;
}

    // 6) 구구단 '출력'하는 메소드. 리턴은 void.printGuguDan
    public static void printGuguDan(){
        for(int i=2; i<=9;i++)
     { 
        System.out.println("지금..."+i+"단을 출력합니다.");
        for(int j=1;j<10;j++){
        System.out.println(String.format("%3dx%3d=%3d", i,j,i*j)); 
    }
}       
    }



}