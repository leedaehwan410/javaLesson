package object.day5;

import java.util.Arrays;

public class B02GetterSetterTest {
    
    /**
     * @param args
     */
    public static void main(String[] args) {
        
        MyClass2 momo = new MyClass2();
        System.out.println("MyClass2 의 field1 값(초기) :"+momo.getField1());
        momo.setFiled1("나는 모모!!");
        System.out.println("MyClass2 의 field1 값(변경후) :"+momo.getField1());
        String message="WELCOME~!!";
        momo.setFiled1(message);
        System.out.println("1456156"+momo.getField1());

        System.out.println("초기값:"+momo.getField2());
        momo.setFiled2(800);
        System.out.println("변경값:"+momo.getField2());
        int test = 1212;
        momo.setFiled2(test);
        System.out.println("ljnm"+momo.getField2());

        
        System.out.println("지금까지의 momo 객체 값들은...");
        
        momo.printData();
        
        
        System.out.println("~~~~~~field3은 double배열 타입입니다.~~~");
        double[] dArray = momo.getField3();
        System.out.println("field3 :"+dArray);
        System.out.println("field3 :"+momo.getField3());

        //방법1.
        double[] tempArray = {1.3,3.44,67.12};
        
        momo.setFiled3(new double[5]);
        System.out.println("변경된 field3 확인합니다1");
        momo.printData();
        System.out.println("변경된 field3 확인합니다1");
        momo.setFiled3(tempArray);
        momo.printData();
        
        //setField3을 변수로 전달햇을 때
        tempArray[2]=3.1415;    //변경된 값이 momo 객체에도 반영되는지 확인해봅시다.
        System.out.println("변경된 field3 확인");
        momo.printData();





    }
}
