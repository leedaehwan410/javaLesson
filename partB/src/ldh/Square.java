package ldh;

import day7.Shape;

public class Square extends Shape{  //다른 패키지 클래스는 import 필요.
    

    //etc setter
    public void setetc(String etc){
        this.etc=etc;           //protected 접근한정자를 사용햇기에 shape클래스에 
                                //자식클래스이기 때문에 사용 가능
    }
    //round setter
    public void setround(int round){
        // this.round.round; //  접근한정자가 없기때문에 day7 패키지 클래스가 아니라서 오류
    }
    
    @Override
	public void draw() {
		System.out.println("정사각형 " + this.getShapeName()+"를 그립니다.");
	}


}
