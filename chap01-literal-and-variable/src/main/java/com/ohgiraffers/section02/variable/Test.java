package com.ohgiraffers.section02.variable;

public class Test {
    public static void main(String[] args){

        int prize;
        prize = 5000;
        int gold;
        gold = 1000;
        int a;
        a = prize + gold;

        System.out.println("1번 고객님께 Prize + Gold 지급합니다." );
        System.out.println("1번 고객님께 " + ( prize + gold ) + " 지급합니다." );
        System.out.println("1번 고객님께 " + ((prize+gold)+(2000)) + " 지급합니다." );
        System.out.println("1번 고객님께 " + (prize += 2000) + " 지급합니다." );
        System.out.println("1번 고객님께 " + ((a)+=(2000)) + " 지급합니다." );
        System.out.println("1번 고객님께 " + ((a)+=(2000)) + " 지급합니다." );
        System.out.println("1번 고객님께 " + ((a)+=(2000)) + " 지급합니다." );
        System.out.println("1번 고객님께 " + ((a)+=(2000)) + " 지급합니다." );

        String name = "목진희";
        int age = 33;
        char gender = '여';

        System.out.println(name + age + gender + "입니다.");

        System.out.print(name);
        System.out.print(age);
        System.out.println(gender);




    }
}
