package com.poly.string;

/**
 *
 * @author LinhTD
 */
public class XuLyChuoi {
    public static void main(String[] args) {
        String s = "1. FPT Polytechnic";
        System.out.println("Do dai chuoi s: " + s.length());
        //Đếm chuỗi có bao nhiên chữ in HOA, in thường, số
        char []arr = s.toCharArray();
        int soInHoa = 0, soInThuong = 0, soChuSo = 0;
        for(int i = 0; i<arr.length ; i++){
            if(Character.isUpperCase(arr[i])) soInHoa++;
            if(Character.isLowerCase(arr[i])) soInThuong++;
            if(Character.isDigit(arr[i])) soChuSo++;
        }
        System.out.println("So ky tu in HOA: " + soInHoa);
        System.out.println("So ky tu in thuong: " + soInThuong);
        System.out.println("So ky tu chu so: " + soChuSo);
        ////////////////
        String path="D:\\Music\\Happy New Year.mp3";
        int lastind=path.lastIndexOf("\\");
        String song=path.substring(lastind+1);
        System.out.println("Song: " + song);
        int dotind=song.lastIndexOf(".");
        System.out.println("Song: " + song.substring(0, dotind));
    }
}
