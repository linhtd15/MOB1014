package com.poly.bai4;
import java.util.ArrayList;

public class Demo {
    public static void main(String[] args) {
        //ArrayList không định kiểu
        ArrayList list1 = new ArrayList();
        list1.add("Hello");
        list1.add(10);
        list1.add(true);
        
        //ArrayList định kiểu
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("Happy");//0
        list2.add("New");//1
        list2.add("Year");//2
        list2.add("2020");//3
        System.out.println(list2.indexOf("New"));
        //list2.add(2,"ABC");
        //list2.remove("2020");
        //list2.remove(0);
        //list2.clear();
        //list2.set(3,"2021");
        //Duyệt ArrayList
        //for(int i = 0;i<list1.size();i++){
            //System.out.println(list1.get(i));
        //}
        for(String x : list2){
            System.out.println(x);
        }
    }
}
