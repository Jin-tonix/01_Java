package com.ohgiraffers.section01.conditional;
import java.util.Scanner;

public class Application01 {
    public static void  main (String[] args) {
        com.ohgiraffers.section01.conditional.A_if
                aIf = new A_if();
        aIf.testSimpleIfStatement();


        /* 계산기 만들기
         * 두 수와 수식을 입력받아
         * 수식에 맞는 연산을 수행하는 프로그램을 만들어주세요.
         */
    }
    public double calculator () {
        // 입력받을 수 있는 기능을 추가한다.
        Scanner sc = new Scanner(System.in);
        //2. 첫번째 수를 입력받는다.
        int first = sc.nextInt();
        //3. 두번째 수를 입력받는다.
        int second = sc.nextInt();
        //4. 연산 기호를 입력받는다.
        char operator = sc.nextLine().charAt(0);
        //5. 연산 기호를 확인한다.
        double result;
        if (operator == '+') {
            result = first + second;
        } else if (operator == '-') {
            result = first - second;
        } else if (operator == '*') {
            result = first * second;
        } else if (operator == '/') {
            result = first / second;
        }
        return 0.0;
    }
    //6. 연산을 진행한다.
    //7. 반환한다.
}
