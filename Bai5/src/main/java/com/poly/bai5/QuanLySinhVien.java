package com.poly.bai5;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class QuanLySinhVien {

    Scanner sc = new Scanner(System.in);
    private ArrayList<SinhVien> dsSinhVien;

    //Phương thức khởi tạo
    public QuanLySinhVien() {
        dsSinhVien = new ArrayList<SinhVien>();
    }

    //Getter và Getter
    public void setDsSinhVien(ArrayList<SinhVien> dsSinhVien) {
        this.dsSinhVien = dsSinhVien;
    }

    public ArrayList<SinhVien> getDsSinhVien() {
        return dsSinhVien;
    }

    //Kiểm tra tính hợp lệ và nhập điểm
    private float nhapDiemJava() {
        while (true) {
            try {
                float diem = Float.parseFloat((sc.nextLine()));
                if (diem < 0.0 && diem > 10.0) {
                    throw new NumberFormatException();
                }
                return diem;
            } catch (NumberFormatException ex) {
                System.out.print("Nhap sai diem, hay nhap lai: ");
            }
        }
    }

    //Thêm sinh viên
    public void themSinhVien() {
        System.out.println(">>> Nhap thong tin sinh vien: ");
        System.out.print("\tMa sinh vien: ");
        String maSV = sc.nextLine();
        System.out.print("\tTen sinh vien: ");
        String tenSV = sc.nextLine();
        System.out.print("\tDiem Java1: ");
        float diemJava1 = nhapDiemJava();
        System.out.print("\tDiem Java2: ");
        float diemJava2 = nhapDiemJava();
        SinhVien sv = new SinhVien(maSV, tenSV, diemJava1, diemJava2);
        dsSinhVien.add(sv);
    }

    //Hiển thị danh sách sinh viên
    public void hienThiSinhVien() {
        System.out.println(">>>>> DANH SACH SINH VIEN <<<<<");
        System.out.format("%-10s ", "Ma SV");
        System.out.format("%-20s ", "Ten Sinh vien");
        System.out.format("%-10s ", "Diem Java1");
        System.out.format("%-10s ", "Diem Java2");
        System.out.format("%-10s ", "Diem TB");
        System.out.format("%-15s\n", "Xep loai");
        //Duyệt và hiển thị danh sách sinh viên
        for (SinhVien sv : dsSinhVien) {
            System.out.format("%-10s ", sv.getMaSV());
            System.out.format("%-20s ", sv.getTenSV());
            System.out.format("%-10.1f ", sv.getDiemJava1());
            System.out.format("%-10.1f ", sv.getDiemJava2());
            System.out.format("%-10.1f ", sv.diemTrungBinh());
            System.out.format("%-15s\n", sv.xepLoai());
        }
    }

    //Sửa sinh viên theo mã sinh viên
    public void suaSinhVien(String maSV) {
        boolean tonTai = false;
        for (int i = 0; i < dsSinhVien.size(); i++) {
            if (dsSinhVien.get(i).getMaSV().equalsIgnoreCase(maSV)) {
                tonTai = true;
                System.out.print("Nhap ten sinh vien: ");
                dsSinhVien.get(i).setTenSV(sc.nextLine());
                System.out.print("Nhap diem Java1: ");
                dsSinhVien.get(i).setDiemJava1(nhapDiemJava());
                System.out.print("Nhap diem Java2: ");
                dsSinhVien.get(i).setDiemJava2(nhapDiemJava());
                break;
            }
        }
        if (!tonTai) {
            System.out.println("Khong tim thay sinh vien co ma " + maSV);
        }
    }

    //Xóa sinh viên theo mã sinh viên
    //Xóa đối tượng chứ không xóa theo index
    public void xoaSinhVien(String maSV) {
        SinhVien sv = null;
        for (SinhVien x : dsSinhVien) {
            if (x.getMaSV().equalsIgnoreCase(maSV)) {
                sv = x;
                break;
            }
        }
        if (sv != null) {
            dsSinhVien.remove(sv);
        } else {
            System.out.println("Khong tim thay sinh vien co ma " + maSV);
        }
    }
    //Sắp xếp danh sách sinh viên theo điểm trung bình
    Comparator<SinhVien> compDiem = new Comparator<SinhVien>() {
        @Override
        public int compare(SinhVien sv1, SinhVien sv2) {
            if(sv1.diemTrungBinh()> sv2.diemTrungBinh())
                return 1;
            return -1;
        }
    };
    public void sxSinhVienTheoDiem(){
        Collections.sort(dsSinhVien, compDiem);
    }
    //Sắp xếp sinh viên theo tên (Note: Thực hiện tối ưu???)
    Comparator<SinhVien> compTen = new Comparator<SinhVien>() {
        @Override
        public int compare(SinhVien sv1, SinhVien sv2) {
            return sv1.getTenSV().compareToIgnoreCase(sv2.getTenSV());
        }
    };
    public void sxSinhVienTheoTen(){
        Collections.sort(dsSinhVien, compTen);
    }
    
    
    
}
