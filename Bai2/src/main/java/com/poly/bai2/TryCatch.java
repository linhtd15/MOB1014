/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poly.bai2;

import java.util.Scanner;

/**
 *
 * @author LinhTD
 */
public class TryCatch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int a = sc.nextInt();
            System.out.println("Ban da nhap dung");
        } catch (Exception ex) {
            System.out.println("Vui long nhap so");
        }

    }
}
