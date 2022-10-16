/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OOP;

import java.util.ArrayList;
import java.util.Scanner;

/**
5
Cao Van Vu
50000
26
GD
Bui Thi Trang
45000
23
PGD
Do Van Truong
40000
25
PGD
Nguyen Van Cam
37000
26
TP
Truong Thi Tu Linh
45000
22
NV
 * @author ADMIN
 */
public class J05038_BangKeTienLuong {
    static class tienLuong{
        private String ma, ten;
        private int luongNgay, ngayCong;
        private String chucVu;

        public String getMa() {
            return ma;
        }
        
        public tienLuong(String ma, String ten, int luongNgay, int ngayCong, String chucVu) {
            this.ma = ma;
            this.ten = ten;
            this.luongNgay = luongNgay;
            this.ngayCong = ngayCong;
            this.chucVu = chucVu;
        }
        
        public int luongThang(){
            return luongNgay * ngayCong;
        }
        
        public int thuong(){
            if(ngayCong >= 25) return luongThang() * 20 / 100;
            else if(ngayCong >= 22 && ngayCong < 25){
                return luongThang() * 10 / 100;
            }
            return 0;
        }
        
        public int phuCap(){
            int pc = 0;
            if("GD".equals(chucVu)) pc = 250000;
            else if("PGD".equals(chucVu)){
                pc = 200000;
            }
            else if("TP".equals(chucVu)){
                pc = 180000;
            }
            else if("NV".equals(chucVu)) pc = 150000;
            return pc;
        }

        @Override
        public String toString() {
            return ma + " " + ten + " " + luongThang() + " " + thuong() + " "
                    + phuCap() + " " + (luongThang() + thuong() + phuCap());
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        ArrayList<tienLuong> arr = new ArrayList<>();
        
        int n = sc.nextInt();
        sc.nextLine();
        for(int i = 1; i <= n; ++i){
            String m = String.format("NV%02d", i);
            String t = sc.nextLine();
            int ln = sc.nextInt();
            int snc = sc.nextInt();
            sc.nextLine();
            String cv = sc.nextLine();
            
            tienLuong tmp = new tienLuong(m, t, ln, snc, cv);
            arr.add(tmp);
        }
        
        int cnt = 0;
        for(tienLuong it : arr){
            System.out.println(it);
            cnt += (it.luongThang() + it.thuong() + it.phuCap());
        }
        System.out.println("Tong chi phi tien luong: " + cnt);
    }
}
