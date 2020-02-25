package com.poly.bai6;

import java.util.Scanner;

public class Demo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Nhập vào mã sinh viên: Đúng 6 ký tự HOA, không bắt đầu bằng ký tự số
        //Mật khẩu ít nhất 7 ký tự
        //Họ tên: Chỉ dùng alphabet và dấu cách
        //Email: Thực hiện đúng định dạng email {1,4}
        //Điện thoại: bắt đầu bằng số 0 hoặc +84 và chỉ chứa ký tự số
        //Kiểm tra địa Website
        //http://dantri.vn   https://123.vn
        String regex="(http://|https://)\\w+\\.\\w{1,4}";
        // (http://|https://)\w+\.\w{1-4}
        while(true){
            System.out.print("Input Text: ");
            String txt = sc.nextLine();
            if(txt.matches(regex)){
                System.out.println("Correct!");
                break;
            }
            else {
                System.out.println("Wrong!");
            }
        }
    }
}
