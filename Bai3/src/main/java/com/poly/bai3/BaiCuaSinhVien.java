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
public class BaiCuaSinhVien {

    public static void main(String[] args) {
        //Nhập số lượng phần tử mảng
        System.out.print("Nhap so luong phan tu mang: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //Khai báo mảng
        int a[] = new int[n];
        //Nhập mảng
        for (int i = 0; i < a.length; i++) {
            System.out.print("a[" + i + "]= ");
            a[i] = sc.nextInt();
        }
        
    }
}
