package main.java.com.ohgiraffers.section01.method;

public class Review01 {

    public static void main(String[] args) {

        Review01 re1 = new Review01();

        System.out.println("main 시작됨");
        re1.functionA();
        re1.functionB();
        re1.functionB();
        System.out.println("main 종료됨");


    }
    public void functionA (){
        System.out.println("functionA 시작됨");
        functionB();
        System.out.println("functionA 종료됨");


    }
    public void functionB (){
        System.out.println("functionB 시작됨");
        functionC();
        System.out.println("functionB 종료됨");

    }
    public void functionC(){
        System.out.println("functionC 시작됨");
        System.out.println("functionC 종료됨");
    }


}
