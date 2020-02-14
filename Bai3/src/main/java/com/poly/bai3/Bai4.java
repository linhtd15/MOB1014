/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poly.bai3;
import java.util.Scanner;
import java.util.Arrays;
/**
 *
 * @author LinhTD
 */
public class Bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so luong sinh vien = ");
        int n = sc.nextInt();
        String hoten[] = new String[n];
        int diem[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("- Nhap thong tin sinh vien thu " + i + " : ");
            System.out.print("Ho ten sv: ");
            hoten[i] = new Scanner(System.in).nextLine();
            System.out.print("Diem : ");
            diem[i] = sc.nextInt(); 
        }
       System.out.println(Arrays.toString(hoten));
       System.out.println("");
       System.out.println(Arrays.toString(diem));
    }
}
