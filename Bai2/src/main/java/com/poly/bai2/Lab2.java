package com.poly.bai2;
import java.util.Scanner;
/**
 *
 * @author LinhTD
 */
public class Lab2 {
    public static void main(String[] args) {
        menu();
        Scanner sc = new Scanner(System.in);
        System.out.println("Hay chon chuc nang [1,2,3,4,5]: ");
        int fn = sc.nextInt();
        switch (fn){
            case 1:
                bai1();
                break;
            case 2:
                bai2();
                break;
            case 3:
                bai3();
                break;
            case 4:
                bai4();
                break;
            case 5:
                System.exit(0);
                break;
        }
    }
    
    public static void menu() {
        System.out.println("============= MENU ==============");
        System.out.println("| 1. Giai phuong trinh bac nhat |");
        System.out.println("| 2. Giai phuong trinh bac hai  |");
        System.out.println("| 3. Tinh tien dien             |");
        System.out.println("| 4. Tinh so ngay trong thang   |");
        System.out.println("| 5. Thoat                      |");
        System.out.println("================================|");
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
    public static void bai4() {
        System.out.println("Bai 4");
    }
}
