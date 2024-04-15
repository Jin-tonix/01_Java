package com.ogiraffers.section03.increment;

public class Application01 {
    public static void main (String [] args){
        /*
        *증감연산자
        * 피연산자의 앞 또는 뒤에 사용이 가능하다. (X는 피연산자)
        * '++' : 1의 증가를 의미한다.
        * '--' : 1의 감소를 의미한다.
        * ++x or X++
         */

        int num = 0;

        int x = 10 + (++num);
        System.out.println(x);
        System.out.println(num);

        num =0;
        x = 10 + num++ ;
        System.out.println(x);
        System.out.println(num);




    }
}
