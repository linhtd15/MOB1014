package com.poly.bai5;

import java.util.Scanner;
import java.util.ArrayList;

public class QuanLySinhVien {

    Scanner sc = new Scanner(System.in);
    private ArrayList<SinhVien> dsSinhVien;

    public void setDsSinhVien(ArrayList<SinhVien> dsSinhVien) {
        this.dsSinhVien = dsSinhVien;
    }

    public ArrayList<SinhVien> getDsSinhVien() {
        return dsSinhVien;
    }

    public QuanLySinhVien() {
        dsSinhVien = new ArrayList<SinhVien>();
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
}
