package com.poly.lopvadoituong;

import java.util.Scanner;

public class SinhVien {

    //Khai báo các thuộc tính
    private String hoTen, lop;
    private float diem;
    public SinhVien(){
        System.out.println("Day la phuong thuc khoi tao");
    }
    public SinhVien(String hoTen,String lop,float diem){
        this.hoTen = hoTen;
        this.lop = lop;
        this.diem = diem;
    }
    //Khai báo các phương thức
    public void nhapSinhVien() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ho ten sinh vien: ");
        hoTen = sc.nextLine();
        System.out.print("Lop: ");
        lop = sc.nextLine();
        System.out.print("Diem: ");
        diem = sc.nextFloat();
    }
    public String xepLoai(float diem){
        if(diem>=9) return "Xuat sac";
        else if (diem >=8 && diem<9) return "Gioi";
        else if (diem >=7 && diem<8) return "Kha";
        else if (diem >=6 && diem<7) return "Trung binh";
        else return "Yeu";
    }
    //Nạp chồng phương thức
    public int xepLoai(String hoten,float diem){
        return (int)diem;
    }
    public void xepLoai(){
        System.out.println("Xep loai");
    }
    
    public static void main(String[] args) {
        //Tạo đối tượng
        SinhVien sv = new SinhVien("Nguyen Huy Hoang","PT1234",7);
        //Sử dụng phương thức nhập sinh viên
        sv.nhapSinhVien();
        //Hiển thị xếp loại
        System.out.println("Xep loai: "+sv.xepLoai(sv.diem));
      
       
    }
}
