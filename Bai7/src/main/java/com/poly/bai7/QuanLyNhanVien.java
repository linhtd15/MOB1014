package com.poly.bai7;

import java.util.Scanner;
import java.util.ArrayList;

public class QuanLyNhanVien {

    Scanner sc = new Scanner(System.in);
    private ArrayList<NhanVien> dsNhanVien = new ArrayList<>();

    public QuanLyNhanVien() {
    }

    public void fn_themNV() {
        boolean chk = true;
        while (chk) {
            System.out.print("Chon [1-CNTT; 2-Kinh doanh]: ");
            int loaiNV = sc.nextInt();
            switch (loaiNV) {
                case 1:
                    NhanVienCNTT nvCNTT = new NhanVienCNTT();
                    nvCNTT.nhapNV();
                    dsNhanVien.add(nvCNTT);
                    chk = false;
                    break;
                case 2:
                    NhanVienKD nvKD = new NhanVienKD();
                    nvKD.nhapNV();
                    dsNhanVien.add(nvKD);
                    chk = false;
                    break;
                default:
                    System.out.println("Chon sai, moi chon lai!");
                    break;
            }
        }
    }

    public void fn_hienNV() {
        System.out.println(">>>>> DANH SACH NHAN VIEN <<<<<");
        System.out.format("%-10s ", "Ma NV");
        System.out.format("%-20s ", "Ten Nhan vien");
        System.out.format("%-10s ", "Luong CB");
        System.out.format("%-10s ", "So NC");
        System.out.format("%-10s ", "Luong KD");
        System.out.format("%-15s\n", "Luong");
        //Duyệt và hiển thị danh sách sinh viên
        for (NhanVien nv : dsNhanVien) {
            nv.hienNV();
            System.out.println("\n");
        }
    }
}
