package day7;

// Shape 와 Triangle 을 객체 생성하고 메소드 테스트 해보기.

public class B09ShapeMain {
  public static void main(String[] args) {
    Shape squre = new Shape("네모", 50, 30);
    Triangle tr = new Triangle("세모", 10, 4, 75);

    //getWidth, getHight는 부모클래스 Shape에서 정의했음.
    //자식이 실행가능.
    System.out.println("네모 이름 : " +squre.getShapeName());
    System.out.println("네모 면적 : " +squre.calculateArea());
    System.out.println("네모 높이 : " +squre.getHeight());
    System.out.println("네모 너비 : " +squre.getWidth());

    //부모 클래스가 정의한 메소드 실행 확인
    squre.print();
    tr.print();

    System.out.println(tr.getShapeName());
    System.out.println(tr.calculateArea());
    System.out.println(tr.getHeight());

    System.out.println(tr.getAngle()); //자식 클래스에서 정의한 메소드 실행확인
    //shape.getAngle(); //부모가 자식 객체의 메소드 실행 못함.

    //~~~상속에서의 변수 참조 타입 - 자식 클래스 타입, 부모 클래스 타입.
    //1) 자식 객체를 부모 타입으로 참조하기 ****중요*****
    Shape tempShape = new Triangle("세모2", 30, 40, 90);

    System.out.println("~~~~재정의 메소드 실행 확인~~~~~~");
    System.out.println("부모타입 참조이나 객체의 실체는 Triangle이므로 재정의");
    System.out.println("\t너비는 재정의 메소드로 실행됩니다.");
    System.out.println(tempShape.getShapeName()+"의 넓이:"+tempShape.calculateArea());

    System.out.println("~~~~자식 클래스에서 정의한 메소드 실행확인~~~~~~");
    System.out.println("Triangle자식 객체를 부모타입 Shape으로 참조할 때에는 아래 메소드는 오류");
    System.out.println("\t getAngle은 부모 타입에는 없는 메소드 입니다.");
    //System.out.println("세모각도:"+tempShape.getAngle()); //오류

    //내가 해본 테스트
    System.out.println("네모 이름 : " +tempShape.getShapeName());
    System.out.println("네모 면적 : " +tempShape.calculateArea());

    //2) 부모 객체를 자식 타입으로 참조할 수 있음????? 없음xxxxxxx
    // Triangle tempTriangle = new Shape("임시도형", 20, 30);
    // 부모 객체를 자식 타입으로 참조하기 위해 강제 캐스팅.
    Triangle tempTriangle = (Triangle) new Shape("임시도형", 20, 30);
    //강제 캐스팅은 했으나 Triangle에 필요한 인스턴스 필드가 안 만들어져서 오류

    //1) 과 2)에 대해 메소드 사용 제한 확인해보세요~~~



    
  }
  
}