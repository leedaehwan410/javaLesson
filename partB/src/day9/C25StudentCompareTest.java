package day9;

import java.util.Arrays;
import java.util.Comparator;

//Arrays.sort 메소드에 두번째 인자로 Comparator 인터페이스 타입 객체를 전달하면
//              비교 기준과 정렬 방법을 실행시점에서 결정됩니다.
public class C25StudentCompareTest {
    

    public static void main(String[] args) {
        
        Student[] students = new Student[4];
        students[0] = new Student("장모모", 23);
        students[1] = new Student("박나연", 22);
        students[2] = new Student("김다현", 24);
        students[3] = new Student("사나", 21);

        System.out.println("초기 students 배열 :" + Arrays.toString(students));
       // Arrays.sort(students);  //오류 : Student 객체를 Comparable 이 아닙니다.
        

        Arrays.sort(students,(o1,o2) -> {
                return o1.getName().compareTo(o2.getName());
        });     //o1(왼쪽) , o2(오른쪽) 이며 오름/내림 상관없이 교환을 안해도 되는
        //      경우를 음수값으로 리턴합니다.
        //sort 메소드 정렬 알고리즘은 비교결과 음수 리턴하면 교환하지 않고
        //                                  양수 리턴하면 교환합니다.
        //위의 람다식은 Comparator 구현 클래스 정의 : 추상메소드 1개는 compare
        //               메소드의 인자는 Student 타입 o1,o2
        //               메소드 실행과 리턴은 {몸통} 에 작성.
        
        Arrays.sort(students,(o2,o1) -> {
                return o2.getName().compareTo(o1.getName());
        });

        // Arrays.sort(students,new Comparator<Student>() {
        
        //     @Override
        //     public int compare(Student o1, Student o2) { //o1,02 객체를 비교하는 기준
        //         return o1.getName().compareTo(o2.getName());
        //     }
        // });


        // Arrays.sort(students,new Comparator<Student>() {
        
        //     @Override
        //     public int compare(Student o2, Student o1) { //o1,02 객체를 비교하는 기준
        //         return o2.getName().compareTo(o1.getName());
        //     }
        // });


        // Arrays.sort(students,ageAscending);
        // Arrays.sort(students,ageAscending);
        // Arrays.sort(students,nameAscending);
        // Arrays.sort(students,ageAscending);

        System.out.println("수정후 students 배열 :" + Arrays.toString(students));
    }
}


    //ageDecending
    //nameAscending
    //nameDecending