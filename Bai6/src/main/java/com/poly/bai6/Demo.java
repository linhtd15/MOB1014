package com.poly.bai6;

import java.util.Scanner;

public class Demo {

    public static void main(String[] args) {
        //Nhập username từ bàn phím, tối thiểu 4 ký tự. Sai bắt nhập lại
        //Nhập password từ bàn phím, tối thiểu 6 ký tự. Sai bắt nhập lại
        //Nếu nhập sai quá 3 lần thì thoát chương trình
        //Nếu nhập đúng yêu thì so sánh với Tài khoản: admin , mật khẩu: abc@123
        //Nếu đúng thì thông báo đăng nhập thành công, sai quá 3 lần cũng thoát CT
        
        //Nhập vào mã sinh viên: Đúng 6 ký tự HOA, không bắt đầu bằng ký tự số
        //Mật khẩu ít nhất 7 ký tự
        //Họ tên: Chỉ dùng alphabet và ký tự trắng
        //Email: Thực hiện đúng định dạng email
        //Điện thoại: bắt đầu bằng số 0 hoặc +84 và không chứa ký tự chữ
        //Kiểm tra địa Website
        //http://dantri.vn   https://123.vn
        Scanner sc = new Scanner(System.in);
        String regex ="(https://|http://)\\w+\\.\\w{1,5}";
        while (true) {
            System.out.print("Text: ");
            String txt = sc.nextLine();
            if(!txt.matches(regex)) System.out.println("Dinh dang sai");
            else {
                System.out.println("Dinh dang dung");
                break;
            }
            
        }
        
    }
}
