/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poly.collection;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author LinhTD
 */
public class ThaoTacVoiList {

    public static void main(String args[]) {
        List<String> list = new ArrayList<String>();
        list.add("Phần tử 1");
        list.add("Phần tử 2");
        list.add("Phần tử 3");
        list.add(1, "Phần tử thêm");
        System.out.println("Phan tu co index = 2 la: " + list.get(2));
        // show list
        for (String s : list) {
            System.out.println(s);
        }
    }
}
