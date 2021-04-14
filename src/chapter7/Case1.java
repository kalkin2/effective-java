package chapter7;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Case1 {

    public static void main(String[] args) {

        //코드 42-1 익명 클래스의 인스턴스를 함수 객체로 사용 : 낡은 기법!
        List<String> words = Arrays.asList("1000","100","10","1");
        Collections.sort(words, new Comparator<String>(){
            public int compare(String s1, String s2) {
                return Integer.compare(s1.length(), s2.length());
            }
        });
        System.out.println("words1==>"+words);

        //코드 42-2 람다식을 함수 객체로 사용 - 익명 클래스 대체
        List<String> words2 = Arrays.asList("1000","100","10","1");

        Collections.sort(words2, (s1,s2) -> Integer.compare(s1.length(), s2.length()));
        System.out.println("words2==>"+words2);

        //비교자 생성 메서드 사용
        List<String> words3 = Arrays.asList("1000","100","10","1");

        Collections.sort(words3, Comparator.comparingInt(String::length));
        System.out.println("words3==>"+words3);



    }

}
