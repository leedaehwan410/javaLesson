// package koreait.solution;

// // 0) 객체의 구성 요소 : 인스턴스 필드와 인스턴스 메소드
// //    클래스 구성 요소 : 객체의 구성 요소+static 메소드와 필드
// //    클래스는 객체가 만들어지는 인스턴스 요소를 정의하는 상위 개념.
// public class Bike extends Product{
// private int speed; 


//     public Bike(int price, String prdName, int speed) {
//     super(price, prdName);
//     this.speed = speed;
// }
    

//     public String ride(){
//         return "당신은 이것을 시속 "+this.speed+"km로 탈수 있습니다.";
//     }

//     @Override
//     public String sell(Object o) {
//         return String.format("%s[행사]- %d %% 인하",prdName,o);
//     }


//     public int getSpeed() {
//         return speed;
//     }


//     public void setSpeed(int speed) {
//         this.speed = speed;
//     }


//     @Override
//     public String toString() {
//         return "Bike [speed=" + speed + ", price=" + price + ", prdName=" + prdName + "]";
//     }


   
    


// }

// class Electronics extends Product{

//     private double kwh;



    
//     public Electronics(int price, String proName) {
//         super(price, proName);
        
//     }


//     public double power(){
//         return this.kwh*24;
//     }

//     @Override
//     public String sell(Object o) {
//         return String.format("[%s] 증정-%s", prdName,o);
//     }




//     public double getKwh() {
//         return kwh;
//     }




//     public void setKwh(double kwh) {
//         this.kwh = kwh;
//     }


//     @Override
//     public String toString() {
//         return "Electronics [kwh=" + kwh + "]";
//     }


    

// }