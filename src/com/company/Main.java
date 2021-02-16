package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String x ="dogum tarihi";
        System.out.println(x);
        System.out.println("lutfen dogum tarhini giriniz");
        Scanner scan = new Scanner(System.in);
        int a =scan.nextInt();
        System.out.println("sizin yasiniz " + (2021-a) );


    }
}
