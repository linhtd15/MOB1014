package com.poly.bai5;

import java.util.Scanner;

public class Main {
    public static void menu(){
        System.out.println("======== CHUONG TRINH QUAN LY SINH VIEN ========");
        System.out.println("1. Them sinh vien");
        System.out.println("2. Hien thi danh sach sinh vien");
        System.out.println("3. Sua sinh vien theo ma");
        System.out.println("4. Xoa sinh vien theo ma");
        System.out.println("5. Sap xep sinh vien theo diem TB");
        System.out.println("6. Sap xep sinh vien theo ten sinh vien");
        System.out.println("0. Thoat chuong trinh");
        System.out.println("================================================");
        System.out.print("Chon chuc nang [0-4]: ");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QuanLySinhVien qlSV = new QuanLySinhVien();
        menu();
        int fn;
        boolean thoat = false;
        while(true){
            fn = sc.nextInt();
            switch(fn){
                case 1:
                    qlSV.themSinhVien();
                    break;
                case 2:
                    qlSV.hienThiSinhVien();
                    break;
                case 3:
                    System.out.print("Nhap ma sinh vien can sua: ");
                    qlSV.suaSinhVien(new Scanner(System.in).nextLine());
                    break;
                case 4:
                    System.out.print("Nhap ma sinh vien can xoa: ");
                    qlSV.xoaSinhVien(new Scanner(System.in).nextLine());
                    System.out.print("Da xoa sinh vien thanh cong! ");
                    break;
                case 5:
                    qlSV.sxSinhVienTheoDiem();
                    System.out.println("Sinh vien da duoc sap xep");
                    break;
                case 6:
                    qlSV.sxSinhVienTheoTen();
                    System.out.println("Sinh vien da duoc sap xep");
                    break;
                case 0:
                    System.out.println("Thoat chuong trinh");
                    thoat = true;
                    break;
            }
            if(thoat) break;
            menu();
        }
    }
}
