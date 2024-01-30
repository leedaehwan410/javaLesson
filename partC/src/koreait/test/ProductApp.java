package koreait.test;

public class ProductApp {
    public static void main(String[] args) {
        
        
        System.out.println("안녕");
        //[1]
        Product[] cart = new Product[10];
        cart[0]= new Bike(123000,"MTB",25);
        cart[1]= new Electronics(35000,"USB");
        cart[3]= new Bike(99000,"삼천리",15);
        cart[5]= new Electronics(527000,"스마트tv");
        cart[7]= new Electronics(2250000,"lg냉장고");
        
        //[2]
        (Electronics)cart[5]=
        Bike.power();
        //[3]
        for(int i = 0;i<cart.length;i++){
            if(Bike().price<100000){
                    bike.toString();
            }else if(Electronics.price<100000){
                    Electronics.toString();
            }
        }
        //[4]
        for(Product p : cart ){
            if (p !=null && p instanceof Bike) {
                 cart.ride();
            }
        }
        //[5] 
        if () {
            
        };

        //[6]
        cart[5].sell("사운드바");
    }


}
