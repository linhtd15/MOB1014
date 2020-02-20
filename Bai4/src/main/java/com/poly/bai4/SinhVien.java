package com.poly.bai4;
import java.util.Scanner;

public class SinhVien {
    private String maSV, tenSV;
    private float diemJava1, diemJava2;
    //Phuong thuc khoi tao
    public SinhVien() {
    }
    public SinhVien(String maSV, String tenSV, float diemJava1, float diemJava2) {
        this.maSV = maSV;
        this.tenSV = tenSV;
        this.diemJava1 = diemJava1;
        this.diemJava2 = diemJava2;
    }
    //Setter
    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public void setTenSV(String tenSV) {
        this.tenSV = tenSV;
    }

    public void setDiemJava1(float diemJava1) {
        this.diemJava1 = diemJava1;
    }

    public void setDiemJava2(float diemJava2) {
        this.diemJava2 = diemJava2;
    }
    //Getter
    public String getMaSV() {
        return maSV;
    }

    public String getTenSV() {
        return tenSV;
    }

    public float getDiemJava1() {
        return diemJava1;
    }

    public float getDiemJava2() {
        return diemJava2;
    }
    //Tinh diem trung binh
    public float diemTB(){
        return (diemJava1+diemJava2)/2;
    }
    //Xep loai
    public String xepLoai(){
        if(diemTB()>=9) return "Xuat xac";
        else if(diemTB()>=8) return "Gioi";
        else if(diemTB()>=7) return "Kha";
        else if(diemTB()>=5) return "Trung binh";
        else return "Yeu";
    }
    //Nhap sinh vien
    public void nhapSinhVien(){
        Scanner sc = new Scanner(System.in);
        System.out.print("\tMa SV: ");
        maSV = sc.nextLine();
        System.out.print("\tTen SV: ");
        tenSV = sc.nextLine();
        System.out.print("\tDiem Java1: ");
        diemJava1 = sc.nextFloat();
        System.out.print("\tDiem Java2: ");
        diemJava2 = sc.nextFloat();
    }
    //Hien thi sinh vien
    @Override
    public String toString(){
        return "Ma SV: " + maSV
              + "| Ten SV: " + tenSV
              + "| Diem Java1 : " + diemJava1
              + "| Diem Java2 : " + diemJava2
              + "| Diem TB: " + diemTB()
              + "| Xep loai: " + xepLoai();
    }
}
