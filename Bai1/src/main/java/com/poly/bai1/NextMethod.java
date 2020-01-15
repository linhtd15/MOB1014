/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poly.bai1;
import java.util.Scanner;
/**
 *
 * @author LinhTD
 */
public class NextMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //Tạo đối tượng Scanner
        System.out.print("Nhap du lieu: ");
        String a = sc.nextLine(); // nhận vào 1 string
        System.out.println("Du lieu vua nhap: "+a);

        System.out.print("Nhap tiep du lieu: ");
        String b = sc.next(); // cũng nhận vào 1 String
        System.out.println("Du lieu vua nhap: "+b);
        
//        int a,b,c;
//        Scanner sc = new Scanner(System.in); // Tạo đối tượng Scanner
//        System.out.print("Nhap a: ");
//        a = sc.nextInt();
//        b = sc.nextInt();
//        c = sc.nextInt();
//        System.out.println("a = "+a);
//        System.out.println("b = "+b);
//        System.out.println("c = "+c);
    }
}
