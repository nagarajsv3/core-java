package com.nsv.digital.corejava.demo.passbyreference;

public class PassByReference {


    public static void main(String[] args) {

        Book b = new Book("How to Program", "Dietel");
        System.out.println(b);
        System.out.println(b.getAuthor());
        System.out.println("******After change******");
        changeAuthor(b);
        System.out.println(b);
        System.out.println(b.getAuthor());
    }

    private static void changeAuthor(Book b) {
        b.setAuthor("Paul Dietel");
    }

}
