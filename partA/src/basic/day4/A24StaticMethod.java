package basic.day4;

public class A24StaticMethod {
    //프로그램을 실행시키는 main이 static 이므로 여기서 같이 사용할 수 있는
    //          다른 static 메소드 연습을 해봅시다.
    //메소드를 만드는 목적은 특정 처리 기능을 main 에서 따로 분리하기(구조화)
    //                  한번 만들어진 메소드는 여러번 필요할 때 실행할 수 있습니다.(재사용)
    //                  메소드는 클래스의 구성요소.



    public static void main(String[] args) {
        argumentTest();             //메소드 호출. 이름과 형식이 맞는 메소드를 찾아서 실행합니다.
        argumentTest(999);
        argumentTest(100, 333);     //100,333 은 실매개변수
        //메소드가 실행될때 실매개변수값이 형식매개변수로 전달, 저장됩니다.
        // argumentTest("100", 333);    // 형식에 맞는 메소드 없음.
        int a=100, b=999, c=500;
        argumentTest(a, b);             //실매개변수 a,b 입니다

        int result =resultIntTest();
        System.out.println("result="+result);
        System.out.println("resultIntTest()리턴값"+resultIntTest());

        // result= resultBooleanTest();        //메소드 리턴형식과 변수형식이 불일치하므로 오류

        System.out.println(resultBooleanTest());    

        System.out.println(resultStringTest());
        System.out.println(resultcharTest());

        System.out.println("add(34, 56, 23)="+add(34, 56, 23));
        System.out.println("add(55.25, 15.2, 47.25)="+add(55.25, 15.2, 47.25));

        
    }
        
    
        // 1)~4)은 리턴은 없습니다. 인자로 선언된 () 안의 변수는 메소드의 지역변수 입니다.
        //1) 인자값 없는 메소드
        public static void argumentTest(){
            System.out.println("인자값 없는 메소드");
        }
        //2) 인자가 1개있는 메소드
        public static void argumentTest(int i){     //인자로 사용된 변수 i는 argumentTest 메소드에서만 사용합니다.
            System.out.println("인자가 1개 정수"+i+"입니다.");
        }
        //3) 인자가 2개있는 메소드
        public static void argumentTest(int i,int j){
            System.out.println("인자가 2개 정수i="+i+"j="+j);
            System.out.println("i+j="+(i+j));
        }
        //4)~7) 은 인자가 없습니다.
        //4) 리턴값이 int정수인 메소드 : 리턴은 메소드 실행한 결과값입니다.
            public static int resultIntTest(){
                return 999;
                

            }
        //5) 리턴값이 boolean인 메소드
        public static boolean resultBooleanTest(){
            return false;
        }

        //6) 리턴값이 String인 메소드
         public static String resultStringTest(){
            return "hello";
         }
        //7) 리턴값이 char인 메소드
          public static char resultcharTest(){
            return 'a';



          } 

          
          //인자와 리턴값을 갖는 메소드
          public static int add(int a, int b, int c){
            return a+b+c;
          }
           public static double add(double a, double b, double c){
            return a+b+c;
          }
           
          



    }

