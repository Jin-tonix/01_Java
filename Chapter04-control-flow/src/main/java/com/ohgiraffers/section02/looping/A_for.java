package com.ohgiraffers.section02.looping;

public class A_for {
    public void testSimpleForStatement(){
        /*
        *[for문 표현식]
        * for(초기식; 조건식; 증감식){
        *   //조건식이 참인 경우 실행할 구문 == 반복할 구문
        * }
        */
        for(int i = 1; i<=10 ; ++i) {
            for (int x = 1; x <= 10; x++) {
                for (int y = 0; y <= 10; y++) {
                    System.out.println("백원 단위" + y);
                }
                    System.out.println("천원 단위" + x);
                }
                System.out.println("만원 단위" + i);
                }

            }
        }
