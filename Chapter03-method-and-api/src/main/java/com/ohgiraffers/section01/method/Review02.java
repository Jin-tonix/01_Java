package main.java.com.ohgiraffers.section01.method;

public class Review02 {
    public static void main(String[] args){

        Review02 re02 = new Review02();

        int age = 20;
        re02.test(age);

        int x = 10;
        int y = 20;
        re02.test2(x);
        re02.test3(y);


    }
    public void test(int age) {
        System.out.println("당신의 나이는" + age +"입니다.");

    }
    public void test2(int x) {
        System.out.println(x);

    }
    public void test3(int y) {
        System.out.println(y);

    }

}
