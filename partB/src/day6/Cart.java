package day6;

public class Cart {
    
private String userid;
private String[] productNames;
private int[] price;
private int total_Money;


public String getuserid(){
    return this.userid;
}
public String[] getproductNames(){
    return this.productNames;
}
public int[] getprice(){
    return this.price;
}
public int getTotal_Money() {
    return total_Money;
}

public void setUserid(String userid) {
    this.userid = userid;
}
public void setProductNames(String[] productNames) {
    this.productNames = productNames;
}
public void setPrice(int[] price) {
    this.price = price;
}
public void setTotal_Money(int total_Money) {
    this.total_Money = total_Money;
}

//추가적인 인스턴스 메소드 : 해결방법 ????
public int total_Money(int[] select){   //setter 역할
    
    int sum=0;
    for(int i=0; i<select.length;i++){
        int temp = select[i];
        
        if(temp == -1) break;
        sum=sum+price[temp];

    }
     this.total_Money=sum;   
    return sum;

    }  

}


// 내가썻던거
// public int total_Money(int[] select){
        // int sum=0;
        // int temp=0;

    
//     for(int i=0; i<select.length;i++)
//           int temp =select[i];
//          sum= sum+price[temp]

//         return sum;
// } 

