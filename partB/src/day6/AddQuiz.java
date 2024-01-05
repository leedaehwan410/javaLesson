package day6;
public class AddQuiz {
    
//시나리오: 초등학교 2학년 수학 연습 문제 프로그램(빨간펜)
// 2. 요구 사항: 1) 2자리 덧셈 연습. 2) 덧셈 피연산값은 2자리 정수로 11~99 범위로 랜덤 생성
// 3) 클래스와 배열을 사용합니다. 4) 아래 다이어그램과 실행 예시 참고



private int data1;
private int data2;
private int userAnswer;
private boolean isRight;



//커스텀 생성자

public int getData1() {
    return this.data1;
}
public int getData2() {
    return this.data2;
}
public int getUserAnswer() {
    return this.userAnswer;
}
public boolean getisRight() {
     return this.isRight;
}
public void setData1(int data1) {
    this.data1 = data1;
}
public void setData2(int data2) {
    this.data2 = data2;
}
public void setUserAnswer(int userAnswer) {
    this.userAnswer = userAnswer;
}
   public boolean isRight() {
    return userAnswer == (data1 + data2);
}




// public AddQuiz(int data1, int data2){
//     this.data1 = data1;
//     this.data2 = data2;
    

}










