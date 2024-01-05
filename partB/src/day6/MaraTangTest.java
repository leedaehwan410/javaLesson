package day6;

public class MaraTangTest {
    
    public static void main(String[] args) {
        
    MaraTang mara1 = new MaraTang("목이", "소고기", "옥수수면");
    MaraTang mara2 = new MaraTang("새송이", "소고기", "분모자");
    MaraTang mara3 = new MaraTang("팽이", "양고기", "넙적당면");

        //출력해봅시다

        System.out.println(mara1);
        System.out.println(mara2);
        System.out.println(mara3);


        System.out.println(mara1.getmaratang());
        System.out.println(mara2.getmaratang());
        System.out.println(mara3.getmaratang());

        




    }
}
