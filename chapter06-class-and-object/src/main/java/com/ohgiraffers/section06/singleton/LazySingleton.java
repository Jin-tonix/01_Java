package main.java.com.ohgiraffers.section06.singleton;

public class LazySingleton {

    private static LazySingleton lazy;

    private LazySingleton() {
        System.out.println("lazy 생성됨");
    }


    public static LazySingleton getInstance() {


        if (lazy == null) {
            System.out.println();
            lazy = new LazySingleton();

        }

        return lazy;
    }
}