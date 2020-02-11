/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poly.bai3;
import java.util.Scanner;
/**
 *
 * @author LinhTD
 */
public class Bai4 {
     private static Scanner us;
    public static void main(String[] args) {
        us = new Scanner(System.in);
        System.out.print("Nhap so luong sinh vien = ");
        int n = us.nextInt();
        String []A = new String[n];
        int B[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("- Nhap thong tin sinh vien thu " + i + " : ");
            System.out.print("Ho ten sv: ");
            A[i] = new Scanner(System.in).nextLine();
            System.out.print("Diem : ");
            B[i] = us.nextInt(); 

        }
        for (int i = 0; i < n; i++) {
            if (B[i] < 5) {
                System.out.println("Ten : " + A[i] + "\n Diem: " + B[i] + "\nHoc Luc: yeu");
            }
            if (B[i] > 5 && B[i] < 6.5) {
                System.out.println("Ten : " + A[i] + "\n Diem: " + B[i] + "\nHoc Luc: trung binh");
            }
            if (B[i] >= 6.5 && B[i] < 7.5) {
                System.out.println("Ten : " + A[i] + "\n Diem: " + B[i] + "\nHoc Luc: kha");
            }
            if (B[i] >= 7.5 && B[i] < 9) {
                System.out.println("Ten : " + A[i] + "\n Diem: " + B[i] + "\nHoc Luc: gioi");
            }
            if (B[i] >= 9) {
                System.out.println("Ten : " + A[i] + "\n Diem: " + B[i] + "\nHoc Luc: xuat sac");
            }
        }
    }
}
