/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poly.bai3;
import java.util.Arrays;
import java.util.Scanner;
/**
 *
 * @author LinhTD
 */
public class ViDu {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int arr[] = new int[n];
        //Nhập mảng
        for(int i=0;i<arr.length;i++){
            System.out.print("Phan tu "+i+": ");
            arr[i] = sc.nextInt();
        }
        String kq="";
        //Hiện mảng
        for(int x : arr){
            //Kiểm tra số nguyên tố
            boolean kt=true;
            if(x<=1) kt=false;
            else{
                for(int i=2;i<x-1;i++){
                    if(x%i==0){
                        kt=false;
                        break;
                    }
                }
                if(kt) kq += x+" ";
            }
        }
        //
        System.out.println("Cac so nguyen to trong mang: "+kq);
    }
}
