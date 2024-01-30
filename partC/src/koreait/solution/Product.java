package koreait.solution;

public abstract class Product {
    protected int price;
    protected String prdName;
        
    public Product(int price,String prdName){
        this.price=price;
        this.prdName=prdName;
    }
    public int getPrice() {
        return price;
    }
    public String getProName() {
        return prdName;
    }
    
    public abstract String sell(Object o);

    
    @Override
    public String toString() {
        return "Product [price=" + price + ", proName=" + prdName + "]";
    }



    
}


