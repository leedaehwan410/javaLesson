package koreait.test;

public class ProductApp {
    public static void main(String[] args) {

        Product[] cart = new Product[10];
        cart[0] = new Bike(123000, "MTB", 25);
        cart[1] = new Electronics(35000, "USB", 25);
        cart[3] = new Bike(99000, "삼천리", 15);
        cart[5] = new Electronics(527000, "스마트tv", 25);
        cart[7] = new Electronics(2250000, "lg냉장고", 25);

        if (cart[5] instanceof Electronics) {
            Electronics ev = (Electronics)cart[5];
            ev.setKwh(0.9);
            System.out.println(ev.power());
        }

        for(Product p : cart){
            if (p != null && p.price >= 100000) {
                System.out.println(p.toString());
            }
        }

        for(Product p : cart){
            if (p != null && p instanceof Bike) {
                Bike bike =(Bike)p;
                System.out.println(bike.ride());
            }
        }

        System.out.println(cart[3].sell(20));
        System.out.println(cart[5].sell("사운드바"));


    }

}
