package basic.day2;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class HomeStringFormat {
    
    public static void main(String[] args) {
        //String.format()에 대한 예제를 작성하고 실행도 해보세요.
        
        double n = 123.45678;

        System.out.println(3.4);
        System.out.println(n);
        System.out.println();
        
        System.out.println(String.format("%f_", 3.4));
        System.out.println(String.format("%f_", n));
        System.out.println(String.format("%.6f_", n));
        System.out.println(String.format("%15f_", n));
        System.out.println(String.format("%-15f_", n));
        System.out.println(String.format("%.3f_", n));
        System.out.println(String.format("%.2f_", n));
        System.out.println(String.format("%15.2f_", n));
        System.out.println(String.format("%-15.2f_", n));
        System.out.println(String.format("%015f_", n));
        System.out.println(String.format("%015.2f_", n));
    

    }
}
