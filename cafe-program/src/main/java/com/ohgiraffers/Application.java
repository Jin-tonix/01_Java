package com.ohgiraffers;

import com.ohgiraffers.order.controller.OrderController;
import com.ohgiraffers.order.dto.OrderDTO;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
                OrderController orderController = new OrderController();
        boolean order = true;
        String result = "";
        String result1 = "";
        while(order){

            System.out.println("1. 주문등록");
            System.out.println("2. 주문삭제");
            System.out.println("3. 주문수정");
            System.out.println("4. 주문전체조회");
            System.out.println("5. 주문상세조회");
            System.out.println("어떤 메뉴를 동작하시겠나요?");

            int input = sc.nextInt();
            sc.nextLine();
            OrderDTO orderDTO = new OrderDTO();

            switch (input) {
                case 1: // 주문등록
                    System.out.println("주문할 메뉴 이름을 등록해주세요.");
                    orderDTO.setMenuName(sc.nextLine());
                    System.out.println("수량을 입력해주세요.");
                    int quantity = sc.nextInt();
                    System.out.println("가격을 입력해주세요.");
                    int price = sc.nextInt();
                    orderDTO.setQuantity(quantity, price);
                    result = orderController.order(orderDTO);

                    break;
                case 2: // 주문삭제
                    orderController.orderDelete();
                    break;
                case 3: // 주문수정
                    orderController.orderModify();
                    break;
                case 4: //주문전체조회
                    orderController.orderRead();
                    break;
                case 5: //주문상세조회
                    orderController.viewAll();
                    break;


                    default :
                        System.out.println("입력이 잘못되었습니다");
                        break;

            }
            System.out.println(result);

            System.out.println("주문을 종료하시겠나요?");
            order = sc.nextBoolean();
        }
    }

}

