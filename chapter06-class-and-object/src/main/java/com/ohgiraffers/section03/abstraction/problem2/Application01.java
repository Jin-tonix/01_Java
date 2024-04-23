package main.java.com.ohgiraffers.section03.abstraction.problem2;

public class Application01 {

    public static void main(String[] args) {

        Car car = new Car();
        Car car1 = new Car();

        CarRacer carRacer = new CarRacer();

        carRacer.startUp(car);
        carRacer.go(car1);
        carRacer.stop(car1);
        carRacer.turnOff(car1);


    }
}
