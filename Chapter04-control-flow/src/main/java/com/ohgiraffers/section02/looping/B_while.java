package com.ohgiraffers.section02.looping;

public class B_while {


    public void testSimpleWhileStatement() {
        /*
         *[while문 표현식]
         *while(조건식){
         *   조건식을 만족하는 경우 수행할 구문 (반복할 구문);
         *   증감식;
         * }
         *
         * while(조건식){
         *   조건식을 만족하는 경우 수행할 구문
         * }
         */

        int x = 2;
        int y = 1;

        while (x <= 9) {
            while (y <= 9) {
                System.out.println(x + "*" + y + "=" + (x * y));
                y++;
            }
            x++;
            y = 1;
        }
    }

    public void whileGugudan() {
        // 1. 초기식 작성
        //2. while문의 조건식
        //3. 중첩 while 조건식
        //4. 연산 x * Y
        //5. 출력
        //6. 중첩 while 증감식
        //7. while 증감식
        //8. 중첩 while의 조건 초기화


        int x = 2;
           while (x <= 9) {
               int y =1;
                 while (y <= 9) {

                     System.out.println(x + "*" + y + "=" + (x * y));
            y++;
           }
            x++;
        }
    }
}