package com.ohgiraffers.section01.conditional;

import java.util.Scanner;

public class B_if {
    public void Calculator() {
        Scanner sc = new Scanner(System.in);
        System.out.println("값을 입력해주세요 : ");
        double x = sc.nextDouble();
        sc.nextLine();

        System.out.println("연산을 입력해주세요 : ");
        char y = sc.nextLine().charAt(0);


        System.out.println("값을 입력해주세요. :");
        double z = sc.nextDouble();
        sc.nextLine();

        System.out.println("");
        if (y == '+') {
            System.out.println(x + z);
        } else if (y == '-') {
            System.out.println((x - z));
        } else if (y == '*') {
            System.out.println(x * y);
        } else if (y == '/') {
            System.out.println(x / y);
        }
    }
}
