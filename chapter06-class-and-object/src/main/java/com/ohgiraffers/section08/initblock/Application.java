package main.java.com.ohgiraffers.section08.initblock;

public class Application {
   // 목차. 1. 필드를 초기화 하지 않으면 JVM이 정한 기본값으로 객체가 생성된다. /
   private String name;
    private int price;
    private static String brand;

    //목차. 2. 명시적 초기화 /
    private String name = "갤럭시";
    private int price = 1000000;
    private static String brand = "삼송";

    // 목차. 3. 인스턴스 초기화 블럭 /
    {
        name = "사이언";
        price = 900000;

        // 주의사항.

////인스턴스 초기화 블럭에서는 static 필드를 초기화 할 수 있는것 처럼 보인다.
//하지만 static 초기화 블럭은 클래스가 로드될 때 이미 기본값으로 초기화를 진행했다.
//
//따라서 인스턴스 초기화 블럭이 동작하는 시점에서는 이미 초기화가 진행된 정적 필드에
//인스턴스 초기화 블럭에서 대입한 값으로 덮어 쓰게 되는 것이다.
//*/
    brand = "사과";
System.out.println("인스턴스 초기화 블럭 동작함...");
}

static {

  /* 주의사항.
static 초기화블럭에서는 non-static 필드를 초기화하지 못한다.
정적 초기화 블럭은 클래스 로드 시에 동작한다.
따라서 정적 초기화 블럭의 동작 시점에는 인스턴스가 아무 것도 존재할 수 없기 때문에,
존재하지 않는 인스턴스변수에 초기화 하는 것은 시기상으로 불가능하다.
*/
//        name = "아이뽕";
//        price = 1000000;

    brand = "헬지";
    System.out.println("정적 초기화 블럭 동작함...");
}

/* 설명. 기본생성자 /
public Product() {
    System.out.println("기본 생성자 호출됨...");
}

/ 목차. 4. 매개변수 있는 생성자 /
/ 필기.

매개변수 있는 생성자
위에서 초기화된 값을 다 무시하고 생성자에 작성한 초기화 내용으로 인스턴스를 초기화시킨다.
*/
//public Product (String name, int price, String brand) {
//    this.name = name;
//    this.price = price;
//    Product.brand = brand;
//    System.out.println("매개변수 있는 생성자 호출됨...");}
//
///* 설명. 필드값 문자열 합치기 한 문자열 반환용 메소드 */
//public String getInformation() {
//
//    return "Product [name=" + this.name + ", price=" + this.price + ",brand=" + Product.brand + "]";
}
//public static void main(String[] args) {

        /* 수업목표. 초기화블럭의 동작 순서를 이해하고 이를 활용하여 인스턴스를 생성할 수 있다. /
        / 필기.

초기화 블럭
복잡한 초기화를 수행할 수 있는 블럭을 제공하며, 인스턴스 초기화 블럭과 정적 초기화 블럭으로 구분된다.
인스턴스 초기화 블럭
: 인스턴스가 생성되는 시점에 생성자 호출 이전에 먼저 실행이 된다.
인스턴스를 호출하는 시점마다 호출이 된다.
인스턴스변수를 초기화하며 정적필드에는 실행시점마다 값을 덮어쓴다.
{
초기화 내용 작성
}
정적 초기화 블럭
: 클래스가 로드될 때 한 번 동작한다.
정적 필드를 초기화하며, 인스턴스변수는 초기화하지 못한다.
static {
초기화 내용 작성
}
*/

        /* 설명. 인스턴스 생성 /
        Product product = new Product();

        / 목차. 1. 자료형별 기본값으로 초기화 된 내용 확인 /
//        System.out.println(product.getInformation());

        / 목차. 2. 명시적 초기화로 필드 초기화 확인 /
        / 설명. 명시적 초기값을 Product 클래스에 작성하고 다시 실행하면 기본값을 명시적 초기값이 덮어 쓴다. /
        System.out.println(product.getInformation());

        / 목차. 3. 초기화블럭으로 필드 초기화 확인 /
        / 설명. 명시적 초기값을 Product 클래스에 작성하고 다시 실행하면 기본값을 명시적 초기값이 덮어 쓴다. /
        System.out.println(product.getInformation());

        / 목차. 4. 매개변수 있는 생성자를 이용한 초기화 확인 /
        Product product2 = new Product("대륙폰", 300000, "샤우미");
        System.out.println(product2.getInformation());

        / 필기.

여기서 알 수 있는 초기화 순서는
인스턴스변수 : 기본값 -> 명시적초기값 -> 인스턴스초기화블럭 -> 생성자
클래스변수 : 기본값 -> 명시적초기값 -> 정적초기화블럭 -> 인스턴스초기화블럭 -> 생성자
*/