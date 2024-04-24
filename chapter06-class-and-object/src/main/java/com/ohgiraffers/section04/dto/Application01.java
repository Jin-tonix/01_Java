package main.java.com.ohgiraffers.section04.dto;

import java.util.Date;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

public class Application01 {

    public static void main(String[] args) {

        UserDTO user = new UserDTO("id","pwd","쏭", new Date());

        System.out.println(user);



    }
}
