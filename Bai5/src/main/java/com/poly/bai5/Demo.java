package com.poly.bai5;
import java.util.ArrayList;

public class Demo {
    public static void main(String[] args) {
        //Khai báo Array List không định kiểu
        ArrayList ds1 = new ArrayList();
        //Phương thức thêm phần tử add
        ds1.add("Hello");//0
        ds1.add(1);//1
        ds1.add(3.5);//2
        for(int i=0;i<ds1.size();i++){
            //Truy xuất đến các phần tử sử dụng get
            System.out.println(ds1.get(i));
        }
        //Duyệt Array List bằng foreach
        System.out.println("Duyet bang foreach");
        for(Object x : ds1){
            System.out.println(x);
        }
        //Khai báo Array List định kiểu
        ArrayList<String> ds2=new ArrayList<>();
        ds2.add("Chuc");//0
        ds2.add("Nam");
        ds2.add("Moi");
        ds2.add(1,"Mung");
        ds2.add("2019");
        ds2.set(4, "2020");
        ds2.remove(0);
        for(String a:ds2){
            System.out.println(a);
        }
        
    }
    
    
}
