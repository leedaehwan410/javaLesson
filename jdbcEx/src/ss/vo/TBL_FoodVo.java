package ss.vo;

public class TBL_FoodVo {
    private String fcode;
    private String fname;
    private String category;
    private int price;
    private int gram;
    private int kal;
    

    @Override
    public String toString() {
        return String.format("||%4s%-20s %-35s\t %s %9d%1s %8d%1s %8d%-8s||\n","",fcode,fname,category,price,"원",gram,"g",kal,"kcal");
    }

    public String getFcode() {
        return fcode;
    }

    public String getFname() {
        return fname;
    }

    public String getCategory() {
        return category;
    }

    public int getPrice() {
        return price;
    }

    public int getGram() {
        return gram;
    }

    public int getKal() {
        return kal;
    }

    public TBL_FoodVo(String fcode, String fname, String category, int price, int gram, int kal) {
        this.fcode = fcode;
        this.fname = fname;
        this.category = category;
        this.price = price;
        this.gram = gram;
        this.kal = kal;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((fcode == null) ? 0 : fcode.hashCode());
        result = prime * result + ((fname == null) ? 0 : fname.hashCode());
        result = prime * result + ((category == null) ? 0 : category.hashCode());
        result = prime * result + price;
        result = prime * result + gram;
        result = prime * result + kal;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        TBL_FoodVo other = (TBL_FoodVo) obj;
        if (fcode == null) {
            if (other.fcode != null)
                return false;
        } else if (!fcode.equals(other.fcode))
            return false;
        if (fname == null) {
            if (other.fname != null)
                return false;
        } else if (!fname.equals(other.fname))
            return false;
        if (category == null) {
            if (other.category != null)
                return false;
        } else if (!category.equals(other.category))
            return false;
        if (price != other.price)
            return false;
        if (gram != other.gram)
            return false;
        if (kal != other.kal)
            return false;
        return true;
    }

    



}
