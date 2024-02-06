package ss.vo;

import java.sql.Date;

public class TBL_BuyListVo {
    private int idx;
    private String id;
    private String pcde;
    private int quantity;
    private Date buy_date;
    
    @Override
    public String toString() {
        return "No"+idx + ". 아이디: " + id + "\t음식코드: " + pcde + "\t수량: " + quantity
        + "\t주문일자: " + buy_date;
    }

    public TBL_BuyListVo(int idx, String id, String pcde, int quantity, Date buy_date) {
        this.idx = idx;
        this.id = id;
        this.pcde = pcde;
        this.quantity = quantity;
        this.buy_date = buy_date;
    }

    public int getIdx() {
        return idx;
    }

    public String getId() {
        return id;
    }

    public String getPcde() {
        return pcde;
    }

    public int getQuantity() {
        return quantity;
    }

    public Date getBuy_date() {
        return buy_date;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + idx;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((pcde == null) ? 0 : pcde.hashCode());
        result = prime * result + quantity;
        result = prime * result + ((buy_date == null) ? 0 : buy_date.hashCode());
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
        TBL_BuyListVo other = (TBL_BuyListVo) obj;
        if (idx != other.idx)
            return false;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        if (pcde == null) {
            if (other.pcde != null)
                return false;
        } else if (!pcde.equals(other.pcde))
            return false;
        if (quantity != other.quantity)
            return false;
        if (buy_date == null) {
            if (other.buy_date != null)
                return false;
        } else if (!buy_date.equals(other.buy_date))
            return false;
        return true;
    }

    

}
