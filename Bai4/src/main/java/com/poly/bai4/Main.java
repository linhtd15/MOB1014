package com.poly.bai4;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so luong sinh vien: ");
        int n = sc.nextInt();
        ArrayList<SinhVien> dsSV = new ArrayList<>();
        //Nhập sinh viên vào ArrayList
        for (int i = 0; i < n; i++) {
            System.out.println(">>> Nhap thong tin sinh vien " + (i+1));
            SinhVien sv = new SinhVien();
            sv.nhapSinhVien();
            dsSV.add(sv);
        }
        //
        
        //Tìm và hiển thị thông tin sinh viên có mã PT1
        /*
        boolean tk=false;
        for(int i=0;i<dsSV.size();i++){
            if(dsSV.get(i).getMaSV().equalsIgnoreCase("PT1")){
                System.out.println("Thong tin sinh vien vua tim duoc:");
                System.out.println(dsSV.get(i).toString());
                tk=true;
                break;
            }
        }
        if(!tk) System.out.println("Khong tim thay sinh vien");
        */
        //Hãy sửa thông tin sinh viên có mã là PT1
        boolean tk=false;
        for(int i=0;i<dsSV.size();i++){
            if(dsSV.get(i).getMaSV().equalsIgnoreCase("PT1")){
                System.out.println("Nhap thong tin sinh vien can sua:");
                System.out.print("\tTen sinh vien:");
                dsSV.get(i).setTenSV(new Scanner(System.in).nextLine());
                
                System.out.print("\tDiem Java1:");
                float diemJava1= sc.nextFloat();
                dsSV.get(i).setDiemJava1(diemJava1);
                
                System.out.print("\tDiem Java1:");
                float diemJava2= sc.nextFloat();          
                dsSV.get(i).setDiemJava2(diemJava2);
                tk=true;
                break;
            }
        }
        if(!tk) System.out.println("Khong tim thay sinh vien");
        /*
        System.out.print("Nhap so luong sinh vien: ");
        int n = sc.nextInt();
        SinhVien dsSV[] = new SinhVien[n];
        for (int i = 0; i < dsSV.length; i++) {
            System.out.println(">>> Nhap thong tin sinh vien " + (i + 1));
            dsSV[i] = new SinhVien();
            dsSV[i].nhapSinhVien();
        }
        //Hien thi danh sach sinh vien
        System.out.println("======= DANH SACH SINH VIEN =======");
        for(SinhVien sv : dsSV){
            System.out.println(sv.toString());
        }
         */
        //Hiển thị danh sách sinh viên trong ArrayList
        System.out.println("====== DANH SACH SINH VIEN ======");
        for(int i=0;i<dsSV.size();i++){
            System.out.println(dsSV.get(i).toString());
        }
        System.out.println("====== ------------------- ======");
    }
}
