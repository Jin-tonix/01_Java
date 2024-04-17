package com.ohgiraffers.section01.conditional;

import java.util.Scanner;

public class Application02 {
    public static void main(String[] args) {
        /*
         *계산기 만들기
         * 두 수와 연산기호를 입력받아
         * 연산기호에 맞는 연산을 수행하는 프로그램을 만들어주세요.
         */
        //1. Calculator 메서드를 만든다.

        Application02 app1 = new Application02();
        app1.call();

    }

    public String calculator() {
        // 입력받을 수 있는 기능을 추가한다.
        Scanner sc = new Scanner(System.in);
        //2. 첫번째 수를 입력받는다.
        System.out.println("값을 입력해주세요");

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
        } else {
            return "연산식 오류";
        }
        return String.valueOf(result);
    }
    //6. 연산을 진행한다.
    //7. 반환한다.

    // 한번에 연산식 입력받기
    public String call() {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] target = input.split(" ");
        int result = 0;

        if (target[1].equals("+")) {
            result = Integer.parseInt(target[0]) + Integer.parseInt(target[2]);
            System.out.println(result);

        }else if (target[1].equals("-")) {
            result = Integer.parseInt(target[0]) + Integer.parseInt(target[2]);
            System.out.println(result);
        }else if (target[1].equals("*")) {
            result = Integer.parseInt(target[0]) + Integer.parseInt(target[2]);
            System.out.println(result);
        }else if (target[1].equals("/")) {
            result = Integer.parseInt(target[0]) + Integer.parseInt(target[2]);
            System.out.println(result);
        }

        return "" + result;

    }
}