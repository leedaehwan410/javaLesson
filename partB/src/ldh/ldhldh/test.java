package ldh.ldhldh;

public abstract class test {

    protected int price;
    protected String prdName;
    
    public abstract String sell(Object o); 
    
    public test(int price, String prdName) {
        this.price = price;
        this.prdName = prdName;
    }

    public int getPrice() {
        return price;
    }

    public String getPrdName() {
        return prdName;
    }


    @Override
    public String toString() {
        return "test [price=" + price + ", prdName=" + prdName + "]";
    }

    






}

    
