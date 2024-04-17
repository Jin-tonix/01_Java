package main.java.com.ohgiraffers.section01.method;

public class Review03 {
    public static void main(String[] args) {

        Review03 re03 = new Review03();

    int x = 10;
    int y = 20;


    int result = re03.plus(x,y);
    System.out.println(result);

    int result2 = re03.minus(x,y);
    System.out.println(result2);

    }

    public int plus(int x, int y) {
    int result = x+y;
    return result;
    }

    public int minus(int x, int y) {
        int result2 = x-y;
        return result2;

    }



}
