package com.ohgiraffers.section03.branching;

public class A_break {



    /*
     * break문 실행 흐름을 확인하기 위한 용도의 기능을 제공 분기문(break) 기본 흐름에 대해 확인
     */

    public void testSimpleBreakStatement() {
        int i = 2;
        test:
        while (true) {
            int x = 0;

            while (x <= 9) {
                if (i > 10) {
                    break test;
                }
                if (x >= 5) {
                    break;
                }
                if (x == 0) {
                    x++;
                    continue;
                }
                         System.out.println(i + " * " + x + " =" + i * x);
                x++;
            }
            i++;

        }
    }
}
