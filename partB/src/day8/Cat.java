package day8;

public class Cat extends Animal{
    public static final String TYPE="고양이";

    public Cat() {
    }
    
    public Cat(String color) {
        //supre();          //생략가능. super()는 자식클래스 생성자에서 기본 호출됩니다.
        this.color=color;   //super 로 주면안댐
    }
    
    public Cat(String color, String name) {
        super(color, name);
    }
    


    @Override
    public void sound() {
        System.out.println("고양이는 야옹 😸하고소리를 냅니다");
    }


   @Override
   public String toString() {
    return TYPE+"[color=" + color + ", name=" + name + "]";
   }






















}
