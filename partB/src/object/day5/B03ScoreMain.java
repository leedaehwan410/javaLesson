package object.day5;
//B03, Score 2개 파일 구글드라이브에 올려주세요
public class B03ScoreMain {
    
    public static void main(String[] args) {
        //학생 4명의 성적을 저장해보세요.
        //1학년 2명(모모,다현) 3과목 2학년 2명(나연,쯔위) 4과목
        // 점수는 마음대로 저장

        //모모
        Score momo = new Score();
        momo.setname("모모");
        momo.setgrade(1);
        int[] onescore={50,80,70};
        momo.setjumsues(onescore);
        System.out.println(momo.sum());
        //다현
        Score dh = new Score();
        dh.setname("다현");
        dh.setgrade(1);
        dh.setjumsues(onescore);

        //나연
        Score ny = new Score();
        ny.setname("나연");
        ny.setgrade(2);
        int[] twoscore={75,81,78,50};
        ny.setjumsues(twoscore);

        //쯔위
        Score jw = new Score();
        jw.setname("쯔위");
        jw.setgrade(1);
        jw.setjumsues(twoscore);



        momo.printData();
        dh.printData();
        ny.printData();
        jw.printData();  

    }
}
