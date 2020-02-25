package com.poly.bai7;
import java.util.Scanner;
/*
* Nhân viên CNTT có các thuộc tính: Mã NV, Tên NV, Lương cơ bản, Ngày công
* Nhân viên KD có các thuộc tính: Mã NV, Tên NV, Lương cơ bản, Lương kinh doanh
Do đặc thù công việc nên cách tính lương như sau:
    Lương CNTT = Lương cơ bản * Ngày công
    Lương KD = Lương cơ bản + Lương kinh doanh
Thực hiện: Thêm, hiện thị nhân viên
*/
public class Main {
     public static void menu(){
        System.out.println("======== CHUONG TRINH QUAN LY NHAN VIEN ========");
        System.out.println("1. Them nhan vien");
        System.out.println("2. Hien thi danh sach nhan vien");
        System.out.println("0. Thoat chuong trinh");
        System.out.println("================================================");
        System.out.print("Chon chuc nang [0-2]: ");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QuanLyNhanVien qlNV = new QuanLyNhanVien();
        menu();
        int fn;
        boolean thoat = false;
        while(true){
            fn = sc.nextInt();
            switch(fn){
                case 1:
                    qlNV.fn_themNV();
                    break;
                case 2:
                    qlNV.fn_hienNV();
                    break;
                case 0:
                    System.out.println("Thoat chuong trinh");
                    thoat = true;
                    break;
            }
            if(thoat) break;
            menu();
        }
        
    }
}
