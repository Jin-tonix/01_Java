package main.java.com.ohgiraffers.section3;

import java.util.Scanner;

public class Application01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Book[] book = new Book[3];

        book[0].title = "가나다";
        book[1].title = "나다라";
        book[2].title = "다마바";

        book[0].author = "A";
        book[1].author = "B";
        book[2].author = "C";

        book[0].number = 01;
        book[1].number = 02;
        book[2].number = 03;

        Person person = new Person();
        person.name = "목진희";
        person.book = book[1];





    }

}

/// case = "제목 : " + books[0].title + ", "+ "저자 : " + books[0].author + ", " +"번호 : " + books[0].number;