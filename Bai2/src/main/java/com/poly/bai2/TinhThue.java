package com.poly.bai2;

import java.util.Scanner;

public class TinhThue {

    public static void main(String[] args) {
        thucDon();
        int fn;
        Scanner sc=new Scanner(System.in);
        System.out.print("Moi chon chuc nang [1-3]: ");
        fn = sc.nextInt();
        switch(fn){
            case 1:
                bai1();
                break;
            case 2:
                bai2();
                break;
            case 3:
                bai3();
                break;
            default:
                System.out.println("Ban nhap ngoai pham vi chuc nang");
                break;
        }
    }
    
    public static void thucDon() {
        System.out.println("======= MENU =======");
        System.out.println("1. Bai 1");
        System.out.println("2. Bai 2");
        System.out.println("3. Bai 3");
    }
    
    public static void bai1() {
        System.out.println("Bai 1");
    }
    
    public static void bai2() {
        System.out.println("Bai 2");
    }
    
    public static void bai3() {
        System.out.println("Bai 3");
    }
}
