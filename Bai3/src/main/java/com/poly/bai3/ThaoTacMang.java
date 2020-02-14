package com.poly.bai3;
import java.util.Arrays;
import java.util.Scanner;

public class ThaoTacMang {
    public static void main(String[] args) {
        //Nhập/xuất mảng
        int n;
        System.out.print("Nhap so luong phan tu mang: ");
        Scanner sc=new Scanner(System.in);
        
        n = sc.nextInt();
        String arr[] = new String[n];
        //Nhập dữ liệu cho các phần tử mảng
        
        for(int i=0;i<arr.length;i++){
            System.out.print("arr["+ i +"] = ");
            //Xóa bộ đệm khi nhập chuỗi bằng cách khởi tạo lại đối tượng Scanner
            arr[i] = new Scanner(System.in).nextLine();
        }
        //Xuất mảng
        System.out.println("Mang vua nhap:");
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+" ");
        }
        //Sắp xếp mảng
        Arrays.sort(arr);
        
    }
}
