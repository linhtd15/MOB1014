package com.poly.bai5;

import java.util.Scanner;

public class SinhVien {

    private String maSV, tenSV;
    private float diemJava1, diemJava2;

    //Constructor
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

    //Phương thức tính Điểm trung bình
    public float diemTrungBinh() {
        return (diemJava1 + diemJava2) / 2;
    }

    //Phương thức Xếp loại
    public String xepLoai() {
        if (diemTrungBinh() >= 9) {
            return "Xuat sac";
        } else if (diemTrungBinh() >= 8) {
            return "Gioi";
        } else if (diemTrungBinh() >= 7) {
            return "Kha";
        } else if (diemTrungBinh() >= 5) {
            return "Trung binh";
        } else {
            return "Yeu";
        }
    }
    //Overrides
    @Override
    public String toString(){
        return "Ma Sinh vien: " + this.maSV + ", Ten Sinh vien: " 
                + this.tenSV + ", Diem Java1: " + this.diemJava1
                + ", Diem Java2: " + this.diemJava2
                + ", Diem Trung binh: " + this.diemTrungBinh()
                + ", Xep loai: " + this.xepLoai() +"\n";
    }
}
