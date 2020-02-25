package com.poly.bai7;

public class NhanVienKD extends NhanVien {

    private int luongKD;

    public NhanVienKD() {
        super();
    }

    public NhanVienKD(int luongKD) {
        super();
        this.luongKD = luongKD;
    }

    public int getLuongKD() {
        return luongKD;
    }

    public void setLuongKD(int luongKD) {
        this.luongKD = luongKD;
    }

    //Ghi đè phương thức nhập, hiện, tính lương nhân viên
    @Override
    public void nhapNV() {
        super.nhapNV();
        System.out.print("\tLuong kinh doanh: ");
        luongKD = sc.nextInt();
    }

    @Override
    public int tinhLuong() {
        return luong = luongCB + luongKD;
    }

    @Override
    public void hienNV() {
        super.hienNV();
        System.out.format("%-10s ", "0");
        System.out.format("%-10d ", luongKD);
        System.out.format("%-10d ", tinhLuong());
    }
}
