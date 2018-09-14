package com.nsv.digital.corejava.demo;

public class PassByValueORPassByCopy {

    public static void main(String[] args) {

        int a=10;
        System.out.println("Before Change="+a);
        sum(a);
        System.out.println("PassByValue Proof="+a);

    }

    private static void sum(int r) {
        r= r+10;
        System.out.println(r);
    }

}
