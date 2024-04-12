package com.ohgiraffers.section04.overflow;

public class Application01 {
    public static void main(String[] args){

        //자료형 빌 값의 최대 범위를 벗어나는 경우 발생한 Carry를 버림처리하고 Sing bit를 반전시켜 최소값으로 순환시킴

        byte num1 = 127;
        System.out.println("byte num : " +num1);
        num1++;
        System.out.println("byte num : " +num1);


        int firstNum = 1000000000;
        int secondNum = 700000000;
        System.out.println("firstNum * secondNum = " + (firstNum * secondNum));


        long longMulti = firstNum * secondNum;
        System.out.println("firstNum * secondNum = " + longMulti);

        long result = (long) firstNum * secondNum;
        System.out.println("firstNum * secondNum = " + result);



    }
}
