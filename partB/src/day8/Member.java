package day8;

public class Member {  //Animal 을 use

    protected int age;
    protected String name;

   
    public Member(int age, String name){
        this.age=age;
        this.name=name;

    }
    	//ㄴ 강아지는 15세이상, 고양이는 18세이상, 토끼는 13세 이상 그 외에는 20세 이상 분양받을 수 있습니다.		
	//	ㄴ Member 클래스 isAdopt 메소드에서 실행. -> instanceof 연산 사용
    public boolean isAdopt(Animal animal){
        if(animal instanceof Puppy && age>=15){
                return true;
        }else if(animal instanceof Cat && age>=18){
                return true;
        }else if(animal instanceof Rabbit && age>=13){
                return true;
        }else if(age>=20){
            return true;
        }else{
                return false;
    }
    }
}


