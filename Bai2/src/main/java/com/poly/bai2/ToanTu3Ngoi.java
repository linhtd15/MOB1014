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
public class ToanTu3Ngoi {
    public static void main(String[] args) {
        int a = 5, b = 10, c = 9;
        a = a < b ? a : b;
        a = a < c ? a : c;
        System.out.println("Min: " + a);
    }
}
