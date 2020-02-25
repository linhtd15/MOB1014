package com.poly.bai7;

public class NhanVienCNTT extends NhanVien {

    private int soNgayCong;

    public NhanVienCNTT() {
        super();
    }

    public NhanVienCNTT(int soNgayCong) {
        super();
        this.soNgayCong = soNgayCong;
    }

    public int getSoNgayCong() {
        return soNgayCong;
    }

    public void setSoNgayCong(int soNgayCong) {
        this.soNgayCong = soNgayCong;
    }

    //Ghi đè phương thức nhập, hiện, tính lương nhân viên
    @Override
    public void nhapNV() {
        super.nhapNV();
        System.out.print("\tSo ngay cong: ");
        soNgayCong = sc.nextInt();
    }

    @Override
    public int tinhLuong() {
        return luong = luongCB * soNgayCong;
    }

    @Override
    public void hienNV() {
        super.hienNV();
        System.out.format("%-10d ", soNgayCong);
        System.out.format("%-10s ", "0");
        System.out.format("%-10d ", tinhLuong());
    }
}
