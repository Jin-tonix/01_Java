package com.ohgiraffers.section01.conditional;
import java.util.Scanner;
public class Application02_review {
    public static void main(String[] args) {

        Application02_review app1 = new Application02_review();
        app1.call();


    }

    public String calculator () {
        Scanner sc = new Scanner(System.in);

        System.out.println();


        int a = sc.nextInt();
        int b = sc.nextInt();
        char c = sc.next().charAt(0);
        double result;
        if (c == '+') {
            result = a + b;
        } else if (c == '-') {
            result = a - b;
        } else if (c == '*') {
            result = a * b;
        } else if (c == '/') {
            result = a / b;
        } else if (c == '%') {
            result = a % b;
        } else {
            return "연산식 오류입니다.";
        }
        return String.valueOf(result);
    }

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
