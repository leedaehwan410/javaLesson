package day6;

public class MaraTang {
    
    private String mushroom;
    private String meet;
    private String noodle;

    //커스텀 생성자
    public MaraTang(String mushroom,String meet,String noodle){
        this.mushroom=mushroom;
        this.meet=meet;
        this.noodle=noodle;


    }



    //getter 만들기
    public String getMushroom() {
        return mushroom;
    }
    public String getMeet() {
        return meet;
    }
    public String getNoodle() {
        return noodle;
    }
    //마라탕 출력 메소드
    public String getmaratang(){
        return ("버섯은="+mushroom+",고기는="+meet+",면은="+noodle+"인 마라탕");
    }



}
