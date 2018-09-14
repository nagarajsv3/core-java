package com.nsv.digital.corejava.demo.prefixpostfix;

public class PrePostFixOperators {

    public static void main(String[] args) {

        int r=10;
        System.out.println("r value="+ r + ". PreIncrement="+ (++r) + ". r value after preincrement="+ r);
        int m=10;
        System.out.println("m value="+ m + ". PostIncrement="+ (m++) + ". m value after postincrement="+ m);


        int n=10;
        System.out.println("n value="+ n + ". PreDecrement="+ (--n) + ". n value after predecrement="+ n);
        int o=10;
        System.out.println("o value="+ o + ". PostDecrement="+ (o--) + ". o value after postdecrement="+ o);

    }
}
