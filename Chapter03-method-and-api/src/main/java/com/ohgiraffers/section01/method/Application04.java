package main.java.com.ohgiraffers.section01.method;

public class Application04 {
    public static void main(String[] args) {

        Application04 app4 = new Application04();

        String a = "목진희";
        int b = 34;
        char c = '여';
        String d = "010-9030-2888";
        String result7 = app4.myinfo(a,b,c,d);
        System.out.println(result7);

    }

    public String myinfo (String a, int b, char c, String d) {
        String result7 = ("이름:"+ a +", " + "나이:" + b + ", " +"성별:" + c +", " + "전화번호:" +d);
        return result7;

        //1. myinfo 함수 만들기
        //2. 매개변수 (String name, int age, char genter, String phone)
        //3. 매개변수 더하기 String result = name + age + gender +phpne
        // return result
    }

}
