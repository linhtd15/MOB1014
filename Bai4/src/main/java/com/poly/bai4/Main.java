package com.poly.bai4;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so luong sinh vien: ");
        int n = sc.nextInt();
        SinhVien dsSV[] = new SinhVien[n];
        for (int i = 0; i < dsSV.length; i++) {
            System.out.println(">>> Nhap thong tin sinh vien " + (i + 1));
            dsSV[i] = new SinhVien();
            dsSV[i].nhapSinhVien();
        }
        //Hien thi danh sach sinh vien
        System.out.println("======= DANH SACH SINH VIEN =======");
        for(SinhVien sv : dsSV){
            System.out.println(sv.toString());
        }
    }
}
