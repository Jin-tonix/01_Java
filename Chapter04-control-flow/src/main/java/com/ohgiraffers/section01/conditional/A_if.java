package com.ohgiraffers.section01.conditional;
import java.util.Scanner;
public class A_if {
    public void testSimpleIfStatement(){

    Scanner sc = new Scanner(System.in);
    System.out.println("값을 입력해주세요.");
    int num = sc.nextInt();

        //2의 배수면 n은 2의 배수입니다.
        //0이면 n은 0입니다.
        //2의 배수가 아니면 n은 2의 배수가 아닙니다.

        if(num == 0){
            System.out.println(num+ "는 0입니다.");
        }else if (num % 2 == 0){
            System.out.println(num+ "는 2의 배수입니다.");
        }else if (num % 2 != 0){
            System.out.println(num + "는 2의 배수가 아닙니다.");
        }


    }


}
