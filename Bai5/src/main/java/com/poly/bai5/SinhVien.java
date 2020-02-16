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

    //Phương thức Validate Điểm
    private boolean kiemTraDiem(float diem) {
        if (diem >= 0 && diem <= 10) {
            return true;
        } else {
            return false;
        }
    }

    //Phương thức nhập sinh viên
    public void nhapSinhVien() {
        Scanner sc = new Scanner(System.in);
        System.out.print("\tNhap ma Sinh vien: ");
        maSV = sc.nextLine();
        System.out.print("\tNhap ten Sinh vien: ");
        tenSV = sc.nextLine();
        do {
            System.out.print("\tNhap diem Java 1: ");
            diemJava1 = sc.nextFloat();
        } while (!kiemTraDiem(diemJava1));
        do {
            System.out.print("\tNhap diem Java 2: ");
            diemJava2 = sc.nextFloat();
        } while (!kiemTraDiem(diemJava2));

    }

    //Phương thức tính Điểm trung bình
    private float diemTrungBinh() {
        return (diemJava1 + diemJava2) / 2;
    }

    //Phương thức Xếp loại
    private String xepLoai() {
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

    //Overrides toString
    @Override
    public String toString() {
        return "Ma SV: " + maSV + ", Ten SV: " + tenSV + ", Diem Java1: "
                + diemJava1 + ", Diem Java2: " + diemJava2
                + ", DTB: " + diemTrungBinh() + ", Xep loai: " + xepLoai();
    }
}
