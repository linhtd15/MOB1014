/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poly.bai2;

/**
 *
 * @author LinhTD
 */
public class EpKieu {

    public static void main(String[] args) {
        int a = 5;
        double b = 9.4;
        //b = a;         //ép kiểu tự động
        a = (int) b; //ép kiểu tường minh phần thập phân sẽ bị bỏ
        System.out.println("a = " + a);
    }
}
