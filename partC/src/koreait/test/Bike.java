
package koreait.test;
   
   
public class Bike extends Product{
    public static String TYPE="자전거";

 private int speed;


 public Bike(int price,String prdName,int speed){
     super(price,prdName);
     this.speed=speed;
 }

 public int getSpeed() {
     return speed;
 }
 public void setSpeed(int speed) {
     this.speed = speed;
 }  
 public void ride(){
     System.out.println("당신은 이것을 시속 " +getSpeed()+"km로 탈수 있습니다.");
 }

 public String sell() {
    // Corrected the formatting and added missing parameters
    return String.format("[%s] 행사 _%d %% 인하", prdName);
}


 @Override
 public String toString() {
     return "Bike [pirce="+price+",prdName="+prdName+",speed=" + speed + "]";
 }


 }











 
class Electronics extends Product{
    private double kwh;
    public static String TYPE="전자제품";
    
    public Electronics(int price,String prdName){
    super(price,prdName);


}

public double getKwh() {
    return kwh;
}
public void setKwh(double kwh) {
    this.kwh = kwh;
}
public void power(){
    System.out.println("1일 전력소모량은"+(getKwh()*24)+"입니다.");
}
public String sell() {
  
    return String.format("[%s] 행사 _%d %% 인하", prdName);
}

@Override
public String toString() {
    return "Bike [pirce="+price+",prdName="+prdName+",speed=" + kwh+ "]";
}



}