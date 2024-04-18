package com.ohgiraffers.section01.conditional;

import java.util.Scanner;

// D_switch라는 클래스를 모두가 사용할 수 있도록 만든다.
public class D_switch {//D_switch의 시작

    // 클래스 내부속성
    // testSimpleSwitchStatement 라는 반환값이 없는 메서드를 모두가 사용할 수 있도록 만든다.
    public void testSimpleSwitchStatement() { // testSimpleSwitch 메서드의 시작
        /*
         *[Switch문 표현식]
         * switch(비교대상값){
         *   case 비교값 : 비교값이 참인 경우 실행할 구문; break;
         *   case 비교값 : 비교값이 참인 경우 실행할 구문; break;
         *   default : case에 모두 해당하지 않는 경우; break;
         * }
         */

        //사용자한테 값을 입력받을 수 있는 객채를 생성함
        Scanner sc = new Scanner(System.in);
        System.out.println("반환된 결과는 application03에서 즐겨주세요.");

        //화면에 첫 번째 정수 입력 : 을 입력하라는 내용을 출력함.
        System.out.println("첫 번째 정수 입력 : ");
        //사용자가 입력한 값을 정수로 받아서 first에 대입함.
        int first = sc.nextInt();
        //사용자의 화면에 두번째 정수를 입력하라고 출력함.
        System.out.println("두 번째 정수 입력 : ");
        //사용자가 입력한 값을 second라는 변수에 정수로 받아서 대입함.
        int second = sc.nextInt();
        //사용자의 화면에 연산 기호를 입력하라고 출력함.
        System.out.println("연산 기호 입력");
        //사용자가 입력한 연산 기호를 문자로 받아서 op에 대입함
        char op = sc.next().charAt(0);


        //아래의 계산기를 완성합니다.
        //연산은 + - * / 가 가능하며 이의는 계산 불가능이라는 결과를 화면에 출력합니다.

        switch (op) {// op변수를 기준으로 아래의 값과 일치하는지 확인함.
            // op가 +와 같다면 first + second 결과를 화면에 출력함.
            case '+':
                System.out.println(first + second);
                break;
            // op가 -와 같다면 first -second 결과를 화면에 출력함.
            case '-':
                System.out.println(first - second);
                break;
            // op가 * 와 같다면 first * second 결과를 화면에 출력함.
            case '*':
                System.out.println(first * second);
                break;
            // op가 /와 같다면 first / second 결과를 화면에 출력함.
            case '/':
                System.out.println(first / second);
                break;
            //op가 위의 수식에 모두 만족하지 않으면 같지 않음을 출력함.
            default:
                System.out.println("연산불가");
                break;
        }


    } //testSimpleSwitch 메서드의 종료

    // 계산기를 만들고 결과를 반환합니다. (Switch를 이용함) 반환된 결과는 application03에서 즐겨주세요.
    // +-/* 만 제공하고 일치하는 연산이 없는 경우 연산불가라는 결과를 출력하고 반환 값을 0.0으로 합니다.

    //1. 값을 입력받음
    //2. 첫 수 입력받기
    //3. 두번째 수 입력받기
    //4. 연산기호 입력
    //5. 연산기호를 비교
    //6. 반환


    public double switchCalculator() {
        Scanner sc = new Scanner(System.in);
        System.out.println("반환된 결과는 application03에서 즐겨주세요.");
        int first = sc.nextInt();
        int second = sc.nextInt();
        char op = sc.next().charAt(0);
        double result = 0.0;

        switch (op) {
            case '+':
                result = first + second;
                break;
            case '-':
                result = first - second;
                break;
            case '*':
                result = first * second;
                break;
            case '/':
                result = first / second;
                break;
            default:
                System.out.println("연산불가");
                break;
        }
        return result;

    }

    public void Calculator2() {
        Scanner sc = new Scanner(System.in);
        System.out.println("반환된 결과는 application03에서 즐겨주세요.");

        int grade = sc.nextInt();
        String result = sc.nextLine();

        if (grade == 100) {
            result = "a+";
        } else if (90 <= grade && grade < 100) {
            result = "a";
        } else if (85 <= grade && grade < 90) {
            result = "b+";
        } else if (75 <= grade && grade < 85) {
            result = "b";
        } else if (60 <= grade && grade < 75) {
            result = "c";
        } else if (60 < grade) {
            result = "d";
        } else {
            result = "F는 없다.";
        }
        System.out.println("입력하신 학생의 점수는" + result + "입니다.");

    }


    // 등급 계산기 프로그램
    //main에서 학생의 성적을 입력받고 아래의 메서드에서 학생의 등급을 화면에 출력해주세요.
    // 100 = a+
    // 100-90 = a
    // 90-85 = b+
    // 85-75 = b
    // 75-60 = c
    // 60 미만 = d
    // F는 없다.

    public void gradeCal(int score){
        Scanner sc = new Scanner(System.in);
        System.out.println("반환된 결과는 application03에서 즐겨주세요.");

        String grade;

        if(score == 100){
            grade = "A+";
        }else if(score < 100 && score >= 90){
            grade = "A";
        } else if (score < 90 && score >= 85) {
            grade = "B+";
        } else if (score < 85 && score >= 75) {
            grade = "B";
        } else if (score < 75 && score >= 60) {
            grade = "C";
        }else{
            grade = "D";
        }
        System.out.println("입력하신 학생의 점수는 " + grade +"등급 입니다.");
    }



} // D_switch의 종료
