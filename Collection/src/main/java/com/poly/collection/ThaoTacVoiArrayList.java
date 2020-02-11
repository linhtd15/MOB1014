package com.poly.collection;
import java.util.ArrayList;
/**
 *
 * @author LinhTD
 */
public class ThaoTacVoiArrayList {
    public static void main(String[] args) {
        //Không định kiểu
        ArrayList ds = new ArrayList();
        ds.add("Hello");
        ds.add(1);
        for(int i=0;i<ds.size();i++){
            System.out.println(ds.get(i));
        }
        //Định kiểu
        ArrayList<String> ds2 = new ArrayList<String>();
        ds2.add("Chuc");
        ds2.add("Mung");
        ds2.add("Moi");
        ds2.add("2020");
        ds2.add(2,"Nam");
        //ds2.remove("2020");
        ds2.set(ds2.size()-1, "2021");
         for(int i=0;i<ds2.size();i++){
            System.out.println(ds2.get(i));
        }
        //Duyet thong qua đối tượng Object
        for(Object data: ds2){
            System.out.println(data);
        }
    }
}
