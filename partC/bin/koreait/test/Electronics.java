class Electronics extends Product{
    private double kwh;
    protected String prdName;
    protected String price;
    
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
@Override
public void sell(){
 System.out.println(String.format("[%s] 증정_%s"));
}
@Override
public String toString() {
    return "Bike [pirce="+price+",prdName="+prdName+",speed=" + kwh+ "]";
}



}