package com.ohgiraffers.section01.array;

import java.util.Scanner;

public class Test {

    /*
     * A학생의 평균 점수를 구하는 프로그램을 만들어주세요.
     * 시험의 과목은 5개로 정수 단위 입니다.
     * 5개 과목의 점수를 입력받고 평균을 구하여 화면에 출력합니다.
     * 예) A학생의 수학 : 90점, 영어 :80점, 국어 :100 점, 과학: 79점, 사회 :80점이며 평균은 X입니다.
     */

    // 평균 = 합계 / 과목수
    // 과목 5개 점수 입력 받기
    //

    public void avg() {

            Scanner sc = new Scanner(System.in);
            int[] score = new int[5];
            int result = 0;

            String[] subject = {"수학", "영어", "국어", "과학", "사회",};

            for (int i =0; i<score.length; i++){
                System.out.println(subject[i] +" 점수를 입력해주세요.");
                score [i] =sc.nextInt();
                result += score[i];


            }
            double avg = result / score.length;



            for (int i =0; i <score.length; i++){// int i=0 기본값이기떄문, new int[5]로 score length 를 이미 설정해 주어서 0에서 5가 될때까지 1,2,3,4,의작업의 범위 설정.
                System.out.println(subject[i] +" : " + score[i] + "  ");// 첫번째로 위에서 설정해주었던 subject 하나씩 + : + 입력하는 Score를 출력 (score length)만큼 반복
            }
                System.out.println("평균점수 : "+ avg); //위의 작업에서 avg 평균점수 연산한 것을 출력한다.


        }
    }
