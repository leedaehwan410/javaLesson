package day8_interface.beable;

public class Human implements Thinkable,Cookable,Runnable{

    @Override
    public int calculate(int a, int b) {
        int result=0;
        if(a>=99999 && b>=99999){
            System.out.println("사람이 암산으로 할 수 없는 연산입니다.");
            result = -999999;
        }else{
            System.out.println("사람이 할수 있는 덧셈입니다.");
            result = a+b;
        }
        return result;
    }

    @Override
    public void think() {
        System.out.println("휴먼은 창의적으로 생각합니다\t"
        +"단, 데이터가 너무많으면 그냥 포기합니다.");

    }

    @Override
    public String beAble() {
        return "생각하고 요리하고 달리기도 합니다.";
    }

    @Override
    public void cook(String material) {
        System.out.println(material+"를 사용해서 요리합니다.");
    }

    @Override
    public String run(int speed) {

        return "달립니다."+speed+"km/h 로 달립니다.\n 최대속도 10km/h...";
    }
    

}
