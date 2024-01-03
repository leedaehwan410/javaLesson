package basic.day3;

public class HomeCharType {
    public static void main(String[] args) {
        
        /* :::: [과제-2024/01/03 22시까지 제출] 문자열을 구성하는 문자의 종류 분석하기 ::::
        1) 문자열을 임의로 저장합니다. 예시 : "Hello* Java Hi* Linux~~~" 
        2) 1)번의 문자열을 구성하는 문자 하나하나가  '대문자' '소문자' '숫자' '기호' 중 어떤 종류의 문자인지 검사합니다.
        3) 2)번의 검사를 통해서 문자열을 구성하는 문자의 종류와 개수를 구하여 출력합니다.
        변수명 :      대문자의 갯수 upperCount , 
              소문자의 갯수 lowerCount, 
              숫자의 갯수 numberCount, 
              기호의 갯수 symbolCount 
        출력 예시 :  
        ------------------------------------------------------------
        문자열 : Hello* Java Hi* Linux~~~
        문자 종류 : 대문자 4개, 소문자 12개, 숫자 0개, 기호 8개  
         */
        String str = "Hello* Java Hi* Linux~~~";

        int upperCount=0;
        int lowerCount=0;
        int numberCount=0;
        int symbolCount=0;
System.out.println(str.length());

        
        
        System.out.println("---------------------------------------");
        System.out.println("문자열:"+str);
        for(int i =0; i<str.length();i++){
            char temp = str.charAt(i);
          
            if('A'<=temp && temp<='Z'){
                upperCount++;
            }else{
            }
        }

         for(int i =0; i<str.length();i++){
            char temp = str.charAt(i);
          
            if('a'<=temp && temp<='z'){
                lowerCount++;
            }else{
            }
        }
         for(int i =0; i<str.length();i++){
            char temp = str.charAt(i);
          
            if('0'<=temp && temp<='9'){
                numberCount++;
            }else{
            }
        }
        symbolCount=(str.length()-(upperCount+lowerCount+numberCount));
        
        
        System.out.println("문자종류 : "+upperCount+"개, 소문자"+lowerCount+"개, 숫자"
        +numberCount+"개, 기호"+symbolCount+"개");















    }
}
