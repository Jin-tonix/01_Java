package main.java.com.ohgiraffers.section01.method;

public class Application05 {
    public static void main(String []args){
        //1. myinfo 함수 만들기
        //2. 매개변수 (String name, int age, char genter, String phone)
        //3. 매개변수 더하기 String result = name + age + gender +phpne
        //4. return result


        Application05 app5 = new Application05();

        //방법1
        String result = app5. myInfo ("목진희", 34, '여',"010-9030-2888");
        System.out.println(result);

        //방법2
        System.out.println(app5.myInfo("목진희", 34, '여',"010-9030-2888"));
    }

    public String myInfo (String name, int age, char gender, String phone){
        String result = name + age + gender +phone ;
        return result;

    }
}
