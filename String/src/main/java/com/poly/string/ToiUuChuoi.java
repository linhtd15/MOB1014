package com.poly.string;

/**
 *
 * @author LinhTD
 */
public class ToiUuChuoi {
    public static void main(String[] args) {
        //Tối ưu chuỗi
        String str="         Nguyen                 Van            Anh";
        str=str.trim();
        String arr_str[]=str.split(" ");
        String result="";
        /*
        for(int i=0; i<arr_str.length; i++)
            if (arr_str[i].trim().length()!=0)
            result += arr_str[i] + " ";
        */
        for (String arr_str1 : arr_str) {
            if (arr_str1.trim().length() != 0) {
                result += arr_str1 + " ";
            }
        }
        System.out.println("Chuoi da toi uu: " + result);
    }
}
