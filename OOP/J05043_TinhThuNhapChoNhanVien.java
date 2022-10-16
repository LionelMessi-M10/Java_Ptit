/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OOP;

import java.util.ArrayList;
import java.util.Scanner;

/**
4
Tran Thi Yen
NV
1000
24
Nguyen Van Thanh
BV
1000
30
Doan Truong An
TP
3000
25
Le Thanh
GD
5000
28
 * @author ADMIN
 */
public class J05043_TinhThuNhapChoNhanVien {
    static class thuNhap{
        private String ma, ten, chucVu;
        private int luongCoBan, ngayCong;

        public thuNhap(String ma, String ten, String chucVu, int luongCoBan, int ngayCong) {
            this.ma = ma;
            this.ten = ten;
            this.chucVu = chucVu;
            this.luongCoBan = luongCoBan;
            this.ngayCong = ngayCong;
        }
        
        public int luongChinh(){
            return luongCoBan * ngayCong;
        }
        
        public int phuCap(){
            int pc = 0;
            if("GD".equals(chucVu)) pc = 500;
            else if("PGD".equals(chucVu)) pc = 400;
            else if("TP".equals(chucVu)) pc = 300;
            else if("KT".equals(chucVu)) pc = 250;
            else pc = 100;
            return pc;
        }
        
        public int tamUng(){
            float tmp = (phuCap() + luongChinh())*2/3;
            if(tmp < 25000){
                return (int) Math.round((tmp / 1000)) * 1000;
            }
            return 25000;
        }

        @Override
        public String toString() {
            return ma + " " + ten + " " + phuCap() + " " + luongChinh() + " " + tamUng() + " " + (luongChinh() + phuCap() - tamUng());
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        ArrayList<thuNhap> arr = new ArrayList<>();
        
        int n = sc.nextInt();
        for(int i = 1; i <= n; ++i){
            String m = String.format("NV%02d", i);
            sc.nextLine();
            String t = sc.nextLine();
            String cv = sc.nextLine();
            int lcb = sc.nextInt();
            int snc = sc.nextInt();
            
            thuNhap tmp = new thuNhap(m, t, cv, lcb, snc);
            arr.add(tmp);
        }
        
        for(thuNhap it : arr){
            System.out.println(it);
        }
    }
}
