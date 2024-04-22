package main.java.com.ohgiraffers.section03.copy;

public class Application01 {

    public static void main(String[] args){
        // 얕은 복사 주소값을 공유한다.
        String[] goldSideName = {"김재석", "송재희", "황정한"};
        String[] names = goldSideName;
        System.out.println(goldSideName);
        System.out.println(names);

        goldSideName[0] = "김효주";

        System.out.println(goldSideName[0]);
        System.out.println(names[0]);
        System.out.println("-------------깊은 복사 ---------------");
        // ------------
        // 깊은 복사의 대한 개념
        goldSideName = new String[]{"김재석", "송재희", "황정한"}; // 변수명을 새롭게 할당하는 것이 불편해서 임시로 재사용
        // 주소값 재할당
        names = new String[3];
        // for each
        int i = 0;
        for (String name : goldSideName) {
            names[i] = name;
            i++;
        }
        goldSideName[0] = "이상우";

        System.out.println(goldSideName[0]); // 이상우
        System.out.println(names[0]); // 이상우
    }
}
               //for (String name : goldSideName) {
                //System.out.println(name);

               // for(int i=0; i<goldSideName.length;i++){
            // String name = goldSideName[i];
            // system.out.println(name); 와 같음.




