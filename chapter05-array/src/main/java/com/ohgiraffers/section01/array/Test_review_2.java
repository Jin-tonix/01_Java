package com.ohgiraffers.section01.array;

import java.util.Scanner;

public class Test_review_2 {

    public void sum(){
//       구입 물품의 총합을 구하는 프로그램을 만들어주세요.
//     * 물품의 개수는 4개로 정수 단위 입니다.
//     * 4개 물품의 가격을 입력받고 평균을 구하여 화면에 출력합니다.
  //   * 사과  주스 시금치 당근

        Scanner sc = new Scanner(System.in);
        int[] price = new int[4];
        int sum = 0;

        String[] item = {"사과", "주스", "시금치", "당근"};

        for (int i = 0 ; i<4 ;i++){
            System.out.println(item [i] + "의 값을 입력해주세요.") ;
            price [i] = sc.nextInt();

            sum += price [i];
        }

        }
    }

