package main.java.com.ohgiraffers.section04.scanner;

import java.util.Scanner;

public class Application01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
                // sc 변수명 == 메모리주소 == 값

        Application01 app1 = new Application01();
        String result = app1.inputInfo();
        System.out.println(result);

    }
    /*
     *inputInfo 메서드를 만들고
     * 사용자의 이름 키 성별 나이를 입력받아 main에서 출력해주세요.
     */

    public String inputInfo() {
        Scanner sc = new Scanner(System.in);
        System.out.print("당신의 키는 몇인가요?");
        double height = sc.nextDouble();
        sc.nextLine();
        System.out.println("당신의 나이는 몇살인가요?");
        int age = sc.nextInt();
        sc.nextLine();

        System.out.println("당신의 성별은 무엇입니까?");
        char gender = sc.nextLine().charAt(0);
        System.out.println("당신의 이름은 무엇인가요?");
        String name = sc.nextLine();

        return "당신의 이름은 " + name + "입니다.\n" + "당신의 나이는 " + age + "세 입니다. \n" +"당신의 키는 " + height + "입니다. + \n" +"당신의 성별은 " + gender +"입니다.";


    }

    /*
    *inputInfo 메서드를 만들고
    * 사용자의 이름
    * 키 성별 나이를 입력받아 main에서 출력해주세요.
    * 1. inputInfo 함수를 만든다.
    *   접근제어자 반환타입의 메서드명(){}
    * 2. 사용자에게 값을 입력받는다.
    *   Scanner sc = new Scanner();
    * 3. 키 나이 성별 이름을 입력받아 문자열로 합친다.
    *   더블 키;
    *   정수 나이;
    *   문자 성별;
    *   문자열 이름;
    * 4. 문자열로 반환한다.
     */


}