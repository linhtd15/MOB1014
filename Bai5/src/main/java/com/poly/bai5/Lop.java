package com.poly.bai5;
import java.util.Scanner;
import java.util.ArrayList;

public class Lop {
    public static void main(String[] args) {
        //Khai báo một Array List Sinh vien
        ArrayList<SinhVien> dsSinhVien = new ArrayList<>();
        //Số lượng sinh viên nhập vào từ bàn phím
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so luong sinh vien: ");
        int n = sc.nextInt();
        //Nhập thông tin Sinh viên
        for(int i=0;i<n;i++){
            System.out.println(">>> Nhap thong tin sinh vien "+ (i + 1)+":");
            SinhVien sv = new SinhVien();
            sv.nhapSinhVien();
            dsSinhVien.add(sv);
        }
        //Có các thao tác thêm, xóa
        SinhVien svMoi = new SinhVien("PT4","C",4,6);
        dsSinhVien.add(0,svMoi);
        dsSinhVien.remove(0);
        //Thao tác tìm và xóa sinh viên tên C
        //Tìm xem C có không ? Nếu có thì xuất index của C trong Array List
        //Xóa thì dùng remove(index)
        //Hiển thị thông tin sinh viên
        System.out.println("======= DANH SACH SINH VIEN =======");
        for(int i=0;i<dsSinhVien.size();i++){
            System.out.println("---> Thong tin Sinh vien " + (i+1)+": ");
            System.out.println("\t"+dsSinhVien.get(i).toString());
        }
    }
    
}
