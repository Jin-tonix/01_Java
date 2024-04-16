package main.java.com.ohgiraffers.section01.method;

public class Application03 {
    public static void main (String[]args) {
        int x = 10;
        int y = 20;

        Application03 app3 = new Application03();
        int result = app3.plus(x, y);
        System.out.println(result);

        int result2 = app3.multiplication(x, y);
        System.out.println(result2);

        int result3 = app3.division(x, y);
        System.out.println(result3);

        int result4 = app3.minus(x, y);
        System.out.println(result4);


    }


    // 두 수를 더하는 함수
    // 접근 제어자 + 반환타입 + 함수명(매개변수) {}
    public int plus(int x, int y){
        int result = x+y;
        return result;
    }
    public int multiplication (int x, int y) {
        int result2 = x * y;
        return result2;
    }

    public int division (int x,int y) {
        int result3 = x/y;
        return result3;
    }

    public int minus (int x, int y) {
        int result4 = x-y;
        return result4;
    }

    // 두 수를 더하는 함수
    // 접근제어자 반환타입의 함수명 (매개변수){}


}
