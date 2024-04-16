package main.java.com.ohgiraffers.section01.method;

public class Application01 {
    public static void main(String [] args){
        /*
        * 메소드
        * 메소드는 어떤 특정 작업을 수행하기 위한 명령문의 집합이라고 할 수 있다.
        */
        System.out.println("main() 시작됨...");

        Application01 app1 = new Application01(); //(Application = 하나의 자료형으로 만들수 있는 레퍼런스)
        app1.methodA();

        System.out.println("main()종료됨...");

    }

    public void methodA(){
        // * public = 접근제어자
        // * void 자리는 반환타입을 (return) 지정하는 자리 (int, long)
        // * void 는 반환이 없을때 (return으로 끝내지 않아도 됨)
        // * 문자열 + 정수 = 문자열 (String)
        //***접근제어자 + 반환타입 + method () {}
        System.out.println("methodA()를 시작됨");
        methodB();
        System.out.println("methodA()를 종료됨");
    }

    public void methodB(){

        System.out.println("methodB()를 시작됨");
        methodC();
        System.out.println("methodB()종료됨");

    }

    public void methodC(){
        System.out.println("methodC() 시작됨");
        System.out.println("methodC() 종료됨");
    }


}
