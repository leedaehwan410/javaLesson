package basic.day4;

public class ProbStringReverse {
    //규칙찾기
    public static void main(String[] args) {
        
        String message = "Hello World";  //length: , 인덱스는 0~10
        char[] messageArray= new char[message.length()];

        int cidx = message.length()-1;      //10
        for(int i=0; i<message.length();i++) {
            char temp = message.charAt(i);  // i=0 일때 배열 인덱스 10
            messageArray[cidx]=temp;        //cidx=10 입니다.
            //i=1 일 때, cidx=9 i=2 일 때, cidx=8
            cidx--;

        }
            System.out.println("뒤집기 결과 =");
            System.out.println(messageArray);

    }
}
