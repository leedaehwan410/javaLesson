 package koreait.test;
   
   
   public class Bike extends Product{
    
    private int speed;
    protected String prdName;
    protected String price;


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

    @Override
    public void sell(){
     System.out.println(String.format("[%s]행사 _%d %% 인하 "));

    }

    @Override
    public String toString() {
        return "Bike [pirce="+price+",prdName="+prdName+",speed=" + speed + "]";
    }
            
    }
 