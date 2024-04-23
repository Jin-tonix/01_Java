package main.java.com.ohgiraffers.section02.encapsulation.problem1;

public class Monster {
    String name;
    int hp;


    // monster의 hp가 0보다 큰 값만 입력될 수 있도록 하여 버그를 막고자함.
    public void sethp(int hp){ // sethp 시작
        if(hp>0){
            this.hp = hp;
        }else{
            System.out.println("몬스터의 체력은 0보다 적을 수 없습니다.");

        }


    }// sethp 종료

    public int gethp(){
        return this.hp;

    }
}
