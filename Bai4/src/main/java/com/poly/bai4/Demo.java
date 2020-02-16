package com.poly.bai4;
import java.util.Scanner;

public class Demo {
    //Khai báo các thuộc tính cho lớp Demo
    private String maSV;
    private String hoTen;
    private float diem;
    //Phương thức khởi tạo
    public Demo(){
        System.out.println("Phan mem quan ly sinh vien");
    }
    public Demo(String maSV, String hoTen, float diem){
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.diem = diem;
    }
    //Khai báo các phương thức không có giá trả về
    public void nhapSV(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ma SV: ");
        maSV = sc.nextLine();
        System.out.print("Nhap ten SV: ");
        hoTen = sc.nextLine();
        System.out.print("Nhap diem: ");
        diem = sc.nextFloat();
    }
    //Khai báo phương thức có giá trị trả về
    public String xepLoai(float diem){
        if(diem>=9) return "Xuat sac";
        else if(diem>=8) return "Gioi";
        else if(diem>=7) return "Kha";
        else if(diem>=5) return "Trung binh";
        else return "Yeu";
    }
    //Ví dụ nạp chồng phương thức
    public void xepLoai(){
        System.out.println("Phuong thuc xep loai");
    }
    public float xepLoai(float diem1, float diem2){
        return diem1+diem2;
    }
    //Phương thức main
    public static void main(String[] args) {
        Demo sv1=new Demo("PT123", "Nguyen Van A", 10);
        //Sử dụng phương thức nhapSV()
        sv1.nhapSV();
        //Hiện thị thông tin sinh viên
        System.out.println("Ma: "+sv1.maSV+", Ten: "
                +sv1.hoTen+", Diem: "+sv1.diem+", Xep loai: "+sv1.xepLoai(sv1.diem));
 
    }
}
