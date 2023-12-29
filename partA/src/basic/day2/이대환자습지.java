package basic.day2;

public class 이대환자습지 {
    
    public static void main(String[] args) {
        
            //1. equals()
            //equals 는 두개의 문자열이 동일한 값을 가지고 있는지 비교하여 결과값을 리턴한다.
            //여기서 중요한 것은 a==b는 문자열 변수의 주소값을 비교하는 것이고 a.eqauls(b)는
            // 문자열이 가지고 있는 값 자체를 비교한다는 것이다.
            String a = "banana";
            String b = a;
            String c = "banana";
            String d = new String("banana");
            String e = "coconut";

            System.out.println(a==b);		
            System.out.println(a.equals(b));	

            System.out.println(a==c);		
            System.out.println(a.equals(c));	

            System.out.println(b==c);		
            System.out.println(b.equals(c));	

            System.out.println(a==d);		
            System.out.println(a.equals(d));	

            System.out.println(a==e);		
            System.out.println(a.equals(e));

            // 여기서 중요한 것은 a==c가 true인 것이다. 이유는 java에서 로컬함수 내에 같은 문자열이
            //  나오면 공유상수 pool에서 관리하기 때문에 새로운 메모리를 할당하지 않고 원래 있던 
            //  주소로 배정해주기 때문이다.
           //2.indexOf()
           //문자열에서 특정 문자가 시작되는 인덱스를 리턴한다.
           String str1 = "문자열을 공부해보자";
           String str2= "abcdef";

           System.out.println(str1.indexOf("공부"));
           System.out.println(str2.indexOf("d"));
        
            //3.length()
            //문자열의 길이를 반환한다.
            String str = "abcdef";
            int length=str.length();
            System.out.println("length="+length);

            //4.substring()
            //문자열 중 특정 부분을 뽑아낼 경우에 사용한다.사용방법은 2가지로 매개변수에 1개를 
            //입력할 경우 시작지점으로 인식하여 시작지점부터 해당 문자열의 끝까지 출력하고, 매개변수에
            // 2개를 입력할 경우 시작지점과 끝지점으로 인식하여 출력된다.
            //여기서 subString(5,8)을 사용했을 때, 인덱스 5,6,7에 해당하는 문자열만 출력되는 것에 유의하자 !!

            String str10 = "ABCDEF";
            String substring = str10.substring(0,2);
            System.out.println("substring:"+substring);

            //5.toUpperCase() 와 toLowerCase() 
            //문자열을 모두 대문자로 변경하거나 소문자로 변경할 때 사용된다.
            String str3 = "abcDEF";
            String toLowerCase = str3.toLowerCase();
            System.out.println("toLowerCase :"+toLowerCase);
            
            String str4 = "abcDEF";
            String toUpperCase = str4.toLowerCase();
            System.out.println("toUpperCase :"+toUpperCase);
            //6.split()
            //지정한 문자로 문자열을 나눌 때 사용한다.
            //나눠진 문자열은 배열로 반환되어 배열에 저장된다 !!
            String str5 = "A:B:C:D:ab:cd";
            String[] split = str5.split(":");

            System.out.println(split[1]);
            System.out.println(split[2]);
            System.out.println(split[4]);
            System.out.println(split[5]);

            //7.charAt
            //지정한 index 번째 문자를 반환한다.
            
            String str20 = "안녕하세요 호준이에욤";
            String str30 = "abced";

            System.out.println(str20.charAt(2));
            System.out.println(str30.charAt(3));





















        
    }
}
