package basic.day2;

public class A09HangulCharTest {
    /*
    
     *1. 문자 '나' 부터 '넀' 까지 while문으로 출력해보세요.     ->  변수 char start='나';
     * 2.                       모두 몇개의 문자가 있는지 갯수 구하기.  int codeNa, codeNet
     */
    public static void main(String[] args) {
        

        //1.
        char start='나';
        char end = '낟';
       
      
        //이 시점에서의 start는 ? 
        //2.
        // 더하거나 뺄려면 정수 형태로 바꿔줘야댐 char 는 사칙연산x
        System.out.println();
        int codeNa = start;
        System.out.println(codeNa);
        int codeNet = end;
        System.out.println(codeNet);
        System.out.println(codeNet-codeNa+1);
    

  while (start<=end) {
        System.out.print(start++);
            

        //이시점에서의 start는 ?
        System.out.println("\nstart=????"+start);
        
        }
    }

}


