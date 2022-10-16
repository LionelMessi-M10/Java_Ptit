/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OOP;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
5 2
B17DTCN001
Nguyen Chi  Linh
0987345543
1
B17DTCN011
Vu Viet Thang
0981234567
1
B17DTCN023
Pham Trong Thang
0992123456
1
B17DTCN022
Nguyen Van  Quyet
0977865432
2
B17DTCN031
Ngo Thanh Vien
0912313111
2
Xay dung website ban dien thoai truc tuyen
Xay dung ung dung quan ly benh nhan Covid-19
 * @author ADMIN
 */
public class J06004_QuanLyBaiTapNhom_2 {
    
    static class baiTap{
        private String maSinhVien, hoTen, sdt;
        private int stt;
        private String baiTapDangKy;

        public String getMaSinhVien() {
            return maSinhVien;
        }

        public int getStt() {
            return stt;
        }

        public String getBaiTapDangKy() {
            return baiTapDangKy;
        }

        public void setBaiTapDangKy(String baiTapDangKy) {
            this.baiTapDangKy = baiTapDangKy;
        }

        public baiTap(String maSinhVien, String hoTen, String sdt, int stt) {
            this.maSinhVien = maSinhVien;
            this.hoTen = hoTen;
            this.sdt = sdt;
            this.stt = stt;
        }

        @Override
        public String toString() {
            return maSinhVien + " " + hoTen + " " + sdt + " " + stt + " " + baiTapDangKy;
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        ArrayList<baiTap> arr = new ArrayList<>();
        
        int n = sc.nextInt(), m = sc.nextInt();

        for(int i = 1; i <= n; ++i){
            sc.nextLine();
            String ma = sc.nextLine();
            String ten = sc.nextLine();
            String so = sc.nextLine();
            int soTT = sc.nextInt();
            
            baiTap tmp = new baiTap(ma, ten, so, soTT);
            arr.add(tmp);
        }
        
        sc.nextLine();
        for(int i = 1; i <= m; ++i){
            String baiTapLon = sc.nextLine();
            for(baiTap it : arr){
                if(it.getStt() == i){
                    it.setBaiTapDangKy(baiTapLon);
                }
            }
        }
        
        Collections.sort(arr, new Comparator<baiTap>(){
            @Override
            public int compare(baiTap o1, baiTap o2) {
                return o1.getMaSinhVien().compareTo(o2.getMaSinhVien());
            }
        });
        
        for(baiTap it : arr){
            System.out.println(it);
        }
    }
}
