package koreait.test;
   
public class Bike extends Product{

private int speed;




public Bike(int price, String prdName, int speed) {
    this.price = price;
    this.prdName = prdName;
    this.speed = speed;
}

public String ride(){
    return "당신은 이것을 시속"+this.speed+"km로 탈 수 있습니다.";
}


@Override
public String toString() {
    return "Bike [price=" + price + ", prdName=" + prdName + ", speed=" + speed + "]";
}




@Override
public String sell(Object o) {
    return String.format("[%s] 행사 - %d %% 인하", prdName,o);
}




public int getSpeed() {
    return speed;
}




public void setSpeed(int speed) {
    this.speed = speed;
}




}

class Electronics extends Product{
   
    private double kwh;
    
    
    
    
    public Electronics(int price, String prdName, double kwh) {
        this.price = price;
        this.prdName = prdName;
        this.kwh = kwh;
    }

    public double power(){
        return this.kwh*24;
    }


    @Override
    public String toString() {
        return "Electronics [price=" + price + ", prdName=" + prdName + ", kwh=" + kwh + "]";
    }




    @Override
    public String sell(Object o) {
        return String.format("[%s] 증정 - %s", prdName,o);
    }




    public double getKwh() {
        return kwh;
    }




    public void setKwh(double kwh) {
        this.kwh = kwh;
    }
}



   
