package day8_interface;

import day8_interface.beable.AI;
import day8_interface.beable.BeAble;
import day8_interface.beable.Cookable;
import day8_interface.beable.Dog;
import day8_interface.beable.Human;
import day8_interface.beable.Thinkable;
import day8_interface.beable.Runnable;
public class B19BeAbleMain {

     // 1)추상메소드구현 2)다중구현
    
    public static void main(String[] args) {
        
        Thinkable th1 = new AI();
        AI ai = (AI)th1;    ai.setOp('*');
        Thinkable th2 = new Human();
        // Thinkable th3 = new Dog();

        Runnable run1 = new Human();
        Runnable run2 = new Dog();
        // Runnable run3 = new AI();

        Cookable cook = new Human();

        BeAble[] beAbles = new BeAble[5];
        beAbles[0] = th1;
        beAbles[1] = th2;
        beAbles[2] = run2;
        
        System.out.println("beable 테스트");
        for( BeAble able:beAbles) {
            System.out.println(able.beAble());
            if(able instanceof Thinkable) {
                //다운 캐스팅
            Thinkable temp = (Thinkable) able;
            System.out.println(able.getClass().getName() + "이 계산합니다.");
            char op = temp instanceof AI ?((AI)temp).getOp() : '+';
            System.out.println("\t 연산 :" + op);
            System.out.println("\t 정답 :" + temp.calculate(2024, 3));
            }else{
                System.out.println(able.getClass().getName()+"은 계산 못합니다.");
            }
        }   //결론 : 업캐스팅 또는 다운캐스팅 목적은 상속과 같은 방식으로 사용합니다.
            //      업캐스팅 : 다형성.  업캐스팅 타입이 갖는 메소드만 실행합니다.
            //      다운캐스팅 : 업캐스팅 타입이 갖는 추상메소드가 아닌 메소드 실행하기 위함.


        Thinkable[] thnks = new Thinkable[2];








    }


}
