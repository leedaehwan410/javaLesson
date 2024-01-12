import java.util.List;

import collection.myapp.JavaWord;
import collection.myapp.JavaWordBook;

public class JavaWordApp {
    

    public static void main(String[] args) {
        
        //단어장을 시작하는 프로그램입니다.
        //1, 단어장을 생성 
        JavaWordBook myBook = new JavaWordBook();

        //2. 단어 추가
        JavaWord newWord = new JavaWord("public", "공용의", 1);
        myBook.addWord(newWord);
        myBook.addWord(new JavaWord("private", "개인적인", 1));
        myBook.addWord(new JavaWord("protected", "보호하는", 3));
        myBook.addWord(new JavaWord("collection", "수집" ,2));
        myBook.addWord(new JavaWord("application", "응용프로그램", 2));
        myBook.addWord(new JavaWord("binary", "2진수의", 3));

        //메모장 출력
        myBook.wordAllprint();
        //3. 단어 조회
        //1) 영어단어 입력하면 찾아주기
        String findText = "";
        JavaWord result = myBook.searchWord(findText);
        System.out.println(findText+ "조회 결과 : " + result);


        //2) List<javaWord> searchWordByLevel(int level) :  레벨로 조회하기
            List<JavaWord> list = myBook.searchWordByLevel(3);
            myBook.wordListPrint(list);

        //4. 단어 삭제


    }
}
