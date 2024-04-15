package com.ogiraffers.section05.logical;

public class Application02 {
    public static void main (String [] args) {
        /*
        *논리 연산자의 우선순위와 활용
        *   논리 and 연산자와 논리 or 연산자의 우선순위
        *   $$ :11 순위
        *   || :12 순위
        *   논리 and 연산자 우선순위가 논리 or 연산자 우선순위 보다 높다.
         */

        int num1 = 55;
        System.out.println("1부터 100 사이인지 확인 :" + (num1 >= 1 && num1 <=100));

        int num2 = 166;
        System.out.println("num2가 1부터 100사이인지 확인" + (num2>=1 && num2<=100));

        char ch1 = 'G';
        System.out.println("ch1이 대문자인지 확인하기" + (ch1 == 'G' || ch1 =='g'));

        char ch3 = 'Y';
        System.out.println("영문자 y인지 확인: " + (ch3 == 'y' || ch3 == 'Y'));

        char ch4 = 'y';
        System.out.println("영문자 y인지 확인: " + (ch4 == 'y' || ch4 == 'Y'));

        char ch5 = 'f';
        System.out.println( "영문자인지 확인 : " + (ch5 == 'f'));

        int num3 = 102;
        System.out.println(num3>1 && num3<100);
        System.out.println(num3>1 && num3 >100);
        System.out.println(num3<1 || num3 <100);
        System.out.println(num3>1 || num3 <100);

    }
}
