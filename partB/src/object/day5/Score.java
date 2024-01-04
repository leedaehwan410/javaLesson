package object.day5;

import java.util.Arrays;

//학생들의 성적을 객체로 만들어 줄 클래스 입니다.
public class Score {
    //인스턴스 필드
    private String name;    //학생 이름
    private int grade;      //학년
    private int[] jumsues;  //점수들이 저장될 배열
                            //배열의 크기는 학년마다 다를 수 있음.

    //인스턴스 메소드 : 인스턴스 필드를 사용하는 처리를 합니다.
    //getter
    public String getname(){
        return name;
    }
    public int getgrade(){
        return grade;
    }
    public int[] getjumsues(){
        return jumsues;
    }

    
    //setter
    public void setname(String n){
        name=n;
    }
    public void setgrade(int g){
        grade=g;
    }
    public void setjumsues(int[] j){
        jumsues=j;
    }
    
    // 이렇게하면좋음
    // public void setJumsues(int[] j){    
    //     jumsues = new int[j.length];
    //     for (int i = 0; i < j.length ; i ++)
    //         jumsues[i] = j[i];             
    // }



    //현재 객체의 점수의 합계를 리턴하는 sum() 메소드
    
   public int sum(){
    int total=0;
    for(int i=0; i<jumsues.length;i++)
            total+=jumsues[i];
       return total;
}

    //점수의 평균 double 리턴하는 average() 메소드
    public double average(){
       int temp=sum();
      
     return (double) temp/jumsues.length;
    }
    //모든 인스턴스 필드값을 확인 출력 하는 printScore() 메소드
    public void printData(){
        System.out.println("이름="+name+",학년="+grade+",점수="+Arrays.toString(jumsues)
        +",점수 합계="+sum()+",평균 점수"+average());
    }
}    
    
    
    //    //성적 평균
    //     public double Average() {   //메소드 이름이 Average인거야 
    //         int sum = Sum();
    //         return (double) sum / jumsues.length;       //평균은 합계나누기 과목수 
    //     }                                               //과목수는 점수의 갯수이지


   



