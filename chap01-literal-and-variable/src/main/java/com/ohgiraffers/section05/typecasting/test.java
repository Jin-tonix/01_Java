package com.ohgiraffers.section05.typecasting;

public class test  {
    public static void main (String[] args) {

        byte bnum = 1;
        short snum = bnum;
        int inum = snum;
        long lnum = inum;

        int num1 = 10;
        long num2 = 20;

        long result1 = num1 + num2;

        System.out.println("result1 : " + result1);

        float fnum = 4.0f;
        double dnum = fnum;

        double result2 = fnum + dnum;

        System.out.println("result2 "+ result2);


        long eight = 8;
        float four = eight;

        System.out.println("four :" + four);

        float result3 = eight + four;

        System.out.println("result3 :" + result3);

        char ch1 = 'a';
        int charNumber = ch1;

        System.out.println("charNumber : " + charNumber);

        char ch2 =65;

        System.out.println("ch2 : " + ch2);

        char ch3 ='b';
        int charNum = ch3;

        System.out.println("ch3 : " +ch3);


    }

}
