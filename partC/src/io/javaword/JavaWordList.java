package io.javaword;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import collection.myapp.JavaWord;

/**
 * JavaWordApp_V3 : 아래의 JavaWordList 를 이용해서 똑같이 메뉴가 동작하도록 
 *                  변경해 봅시다.
 * 
 * 이 단어장 프로그램이 다른 환경 예를 들면, 웹브라우저)에서 동작할 때
 * 단어는 1개, 단어장은 단어 여러개를 갖고 이를 대상하는 메소드를 명시하고
 * 그리고 단어장도 객체로 생성될 수 있게 합니다.
 * 최후 정리 : 자바단어장 클래스에 적용될 인터페이스 생성.
 */
public class JavaWordList implements WordList{
    //private : 현재 클래스에서만 사용할 목적으로 접근 제한합니다.
    //필드
    private List<JavaWord> words;
    private String filePath = "단어장.txt";
    
    public JavaWordList(String filePath) {
        System.out.println("단어장의 최대 개수 : " +WordList.MAX_LENGTH);
        words = new ArrayList<>();
        this.filePath=filePath;
    }

    //새로운 단어등록,기존단어 삭제 등의 변경사항을 파일에 저장하기
    public void fileSave() {
        File file = new File(filePath);
        int count=0;
        try(
            PrintWriter pw = new PrintWriter(file);
        ) {
            //  words 에 있는 리스트의 모든데이터를 파일로 출력하기
            for(JavaWord word : words)
            pw.println(word);
        } catch (IOException e) {
            System.out.println("파일 출력 예외 발생 :" +e.getMessage());
        }return ;

    }
    
    
    // 단어장.txt 에서 데이터를 읽어와서 words 리스트에 담기
    public void fileLoad() {    //이 메소드에서 모든 동작을 실행하도록 작성.
        
        
        try(
            BufferedReader br = new BufferedReader(new FileReader(filePath));
        ){
            String line;
            while ((line=br.readLine())!= null){
                String[] temp = line.split(",");
                JavaWord word =(new JavaWord(temp[0],
                                 temp[1],
                                Integer.parseInt(temp[2])));
                                words.add(word);




                // words.add(new JavaWord(temp[0],
                //                        temp[1],
                //                        Integer.parseInt(temp[2])));
            }

        }catch(IOException e){
            System.out.println("파일입력오류 : " + e.getMessage());
        } 
    }

    // 지정된 인덱스 i 의 JavaWord 객체 리턴
    @Override
    public JavaWord getWord(int i) {
       return words.get(i);
    }


    //단어장 전체 리스트 리턴
    @Override
    public List<JavaWord> list() {     //getWords 에서 이름 변경
        return words;
    }

    //단어 추가
    @Override
    public void add(JavaWord word) {
        if(words.size()==WordList.MAX_LENGTH){
        System.out.println("단어장이 꽉 찼습니다.");
        }
        words.add(word);
    }

    //전달받은 영어 단어의 인덱스를 배열로 리턴합니다.-조회 및 삭제 기능에 사용할 새로운 메소드
    // words 리스트의 인덱스 위치 position 부터 단어 english 를 찾기.

    @Override
    public int indexOfWord(String english,int position){
        for(int i=position;i<words.size();i++){
            if(words.get(i).getEnglish().equals(english))
                return i;       //찾으면 인덱스 리턴
        }   
        return -1;
    }

    //단어를 인덱스로 삭제
    @Override
    public JavaWord remove(int index) {
        JavaWord word = words.remove(index);
        return word;
    }

    //단어 1개 조회(여러개 일때는 처음 1개)

    public JavaWord searchFirstByEnglish(String english) {
        for(JavaWord word : words) {
            if(word.getEnglish().equals(english)) {
                return word;        //인자로 전달된 english 와 같은 word 리턴(메소드 종료)
            }
        }
        return null;            
    }
    
    //단어 목록 조회
    @Override
    public List<JavaWord> searchAllByEnglish(String english){
        List<JavaWord> list = new ArrayList<>();    //검색 결과 저장할 리스트
        for(JavaWord word : words) {
            if(word.getEnglish().equals(english)) {
               list.add(word);          //일치하는 하는 단어를 만날 때마다 저장
            }
        }
        return list;
    }


    public List<JavaWord> searchAllByLevel(int level){
        List<JavaWord> list = new ArrayList<>();    //검색 결과 저장할 리스트
        for(JavaWord word : words) {
            if(word.getLevel()==level ) {
               list.add(word);          //일치하는 하는 단어를 만날 때마다 저장
            }
        }
        return list;
    }

    @Override
    // 인스턴스 메소드 : 인스턴스 필드 words 를 사용하여 동작.
    public void print(){
        for(JavaWord word : words) {
            System.out.println(String.format("%-20s %-30s %-20s",
                                    word.getEnglish(),word.getKorean(),word.getLevel()));
        }
    }
   

    // 출력 메소드 
    //static 메소드 : 인스턴스 필드를 사용하지 않고 메소드 인자를 받아 동작.
    public static void print(List<JavaWord> list){
        for(JavaWord word : list) {
            System.out.println(String.format("%-20s %-30s %-20s",
                                    word.getEnglish(),word.getKorean(),word.getLevel()));
        }
    }

   
   

}