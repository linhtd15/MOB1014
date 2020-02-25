package com.poly.bai7;

import java.util.Scanner;

public class NhanVien {

    private String maNV, tenNV;
    protected int luongCB, luong;

    public NhanVien() {
        super();
    }

    public NhanVien(String maNV, String tenNV, int luongCB, int luong) {
        super();
        this.maNV = maNV;
        this.tenNV = tenNV;
        this.luongCB = luongCB;
        this.luong = luong;
    }

    public String getMaNV() {
        return maNV;
    }

    public String getTenNV() {
        return tenNV;
    }

    public int getLuongCB() {
        return luongCB;
    }

    public int getLuong() {
        return luong;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public void setTenNV(String tenNV) {
        this.tenNV = tenNV;
    }

    public void setLuongCB(int luongCB) {
        this.luongCB = luongCB;
    }

    public void setLuong(int luong) {
        this.luong = luong;
    }

    //Phương thức nhập nhân viên
    Scanner sc = new Scanner(System.in);

    public void nhapNV() {
        System.out.println(">>> NHAP THONG TIN NHAN VIEN: ");
        System.out.print("\tMa NV: ");
        maNV = sc.nextLine();
        System.out.print("\tTen NV: ");
        tenNV = sc.nextLine();
        System.out.print("\tLuong co ban: ");
        luongCB = sc.nextInt();
    }

    //Phương thức tính lương
    public int tinhLuong() {
        return 0;
    }

    //Phương thức hiện thị danh sách nhân viên
    public void hienNV() {
        System.out.format("%-10s ", maNV);
        System.out.format("%-20s ", tenNV);
        System.out.format("%-10d ", luongCB);
    }
}
