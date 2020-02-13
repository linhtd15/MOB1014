/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poly.bai3;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        int x;
        System.out.print("Nhap x: ");
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        //Kiểm tra
        boolean check=true;
        if(x<=1) check=false;
        else{
            for(int i=2;i<x-1;i++){
                if(x%i==0){
                    check=false;
                    break;
                }
            }
        }
        if(check) System.out.println("So "+x+" la so nguyen to");
        else System.out.println("So "+x+" khong phai la so nguyen to");
    }
}