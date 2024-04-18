package com.ohgiraffers.section02.looping;

import java.util.Scanner;

public class A_for {
    public void testSimpleForStatement(){
        /*
        *[for문 표현식]
        * for(초기식; 조건식; 증감식){
        *   //조건식이 참인 경우 실행할 구문 == 반복할 구문
        * }
        */
        for(int i = 1; i<=10 ; ++i) {
            for (int x = 1; x <= 10; x++) {
                System.out.println("천원 단위" + x);
                }
                System.out.println("만원 단위" + i);
            }

        }
        // 구구단을 만들어주세요!
        // x = 2
        // x * 4,6,8
        // X * 3,6,9
        // x * 4,8,12
        public void gugudan(){

            for (int x = 2; x <= 9; x++){
                for (int y =2; y <=9; y++){
                    if (y % x == 0){
                        System.out.println(x + "*" + y + "=" + x * y);
                    }

                    }

            }

        }

    public void gugudan2(){

        for (int x = 1; x <= 9; x++){
            for (int y =1; y <=9; y++){
                if ((y % x == 0) && (x!=1) && (y!=1)){
                    System.out.println(x + "*" + y + "=" + x * y);
                }

            }

        }

    }

    //10명의 이름과 나이를 입력 받아 화면에 출력하기
    //예) 이름 000 나이 20

    public void info(){


        for(int x = 1; x<=10 ; ++x) {

            Scanner sc = new Scanner(System.in);
            System.out.println(x + " + 번째 학생의 이름을 입력해주세요.");
            String y = sc.nextLine();

            System.out.println(y + " 번째 학생의 나이를 입력해주세요.");
            int z = sc.nextInt();

            System.out.println(x + "번 학생의 이름 :" + y + "\n" + x + "번 학생의 나이 :" + z);
        }

    }

    }
