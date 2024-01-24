package koreait.test;

public abstract class Product {

    public static final String TYPE = "제품";
    
    protected int price;
    protected String prdName;

    public abstract String sell();

    public Product(int price, String prdName) {
        
        this.price = price;
        this.prdName = prdName;
    }

    public String getPrdName() {
        return prdName;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Product [price=" + price + ", prdName=" + prdName + "]";
    }

    
}