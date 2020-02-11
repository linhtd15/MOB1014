package com.poly.string;

/**
 *
 * @author LinhTD
 */
public class ThaoTacCoBan {
    public static void main(String[] args) {
        String s = "Happy ";
        String s1 = "New Year";
        //Tính chiều dài chuỗi
        int len=s.length(); //6
        //Nối chuỗi s1 và chuỗi s: tương đương s + s1
        s.concat(s1); //Happy New Year
        //Lấy một ký tự tại một vị trí bất kỳ
        char result = s.charAt(7); //N
        //So sánh hai chuỗi
        String s2 = "New Year";
        s2.compareTo(s1); //0 (trả về <0 hoặc >0)
        //Tìm vị trí xuất hiện đầu tiên của chuỗi s2 trong chuỗi s
        s.indexOf(s2); //6
        ////////////////////
        String str="Happy New Year";
        String str1="Happy";
        String str2="New";
        //Tìm vị trí xuất hiện cuối cùng của str2 trong str
        str.lastIndexOf(str2); //6 (trả về -1 nếu không tìm thấy)
        //Thay thế chuỗi str1 bằng str2 trong chuỗi str
        str.replace(str1, str2); //New New Year
        //Loại bỏ khoảng trắng thừa bên trái và bên phải chuỗi
        str.trim();
        //Tạo chuỗi con str4 từ chuỗi str từ vị trí số 6
        String str4=s.substring(6); //New Year
    }
}
