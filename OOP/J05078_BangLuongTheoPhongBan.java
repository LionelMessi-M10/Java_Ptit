/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OOP;

import java.util.ArrayList;
import java.util.Scanner;

/**
2
HC Hanh chinh
KH Ke hoach Dau tu
2
C06HC
Tran Binh Minh
65
25
D03KH
Le Hoa Binh
59
24
KH
 * @author ADMIN
 */
public class J05078_BangLuongTheoPhongBan {
    
    static class phongBan{
        private String maPhong, tenPhong;

        public String getMaPhong() {
            return maPhong;
        }

        public String getTenPhong() {
            return tenPhong;
        }

        public phongBan(String maPhong, String tenPhong) {
            this.maPhong = maPhong;
            this.tenPhong = tenPhong;
        }
    }
    
    static class tinhLuong{
        private String ma, ten, tenPhongBan;
        private int luongCoBan, soNgayCong;

        public String getMa() {
            return ma;
        }

        public void setPhongBan(String tenPhongBan) {
            this.tenPhongBan = tenPhongBan;
        }

        public tinhLuong(String ma, String ten, int luongCoBan, int soNgayCong) {
            this.ma = ma;
            this.ten = ten;
            this.luongCoBan = luongCoBan;
            this.soNgayCong = soNgayCong;
        }
        
        public int heSo(){
            String a = Character.toString(ma.charAt(0));
            int b = Integer.parseInt(ma.substring(1, 3));
            
            int ans = 0;
            
            if("A".equals(a)){
                if(b >= 1 && b <= 3) ans = 10;
                else if(b >= 4 && b <= 8) ans = 12;
                else if(b >= 9 && b <= 15) ans = 14;
                else ans = 20;
            }
            
            if("B".equals(a)){
                if(b >= 1 && b <= 3) ans = 10;
                else if(b >= 4 && b <= 8) ans = 11;
                else if(b >= 9 && b <= 15) ans = 13;
                else ans = 16;
            }
            
            if("C".equals(a)){
                if(b >= 1 && b <= 3) ans = 9;
                else if(b >= 4 && b <= 8) ans = 10;
                else if(b >= 9 && b <= 15) ans = 12;
                else ans = 14;
            }
            
            if("D".equals(a)){
                if(b >= 1 && b <= 3) ans = 8;
                else if(b >= 4 && b <= 8) ans = 9;
                else if(b >= 9 && b <= 15) ans = 11;
                else ans = 13;
            }
            
            return ans;
        }
        
        public int luongThang(){
            return luongCoBan * soNgayCong * heSo() * 1000;
        }

        @Override
        public String toString() {
            return ma + " " + ten + " " + luongThang();
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        ArrayList<phongBan> pb = new ArrayList<>();
        ArrayList<tinhLuong> arr = new ArrayList<>();  
        
        int n = sc.nextInt();
        for(int i = 1; i <= n; ++i){
            String m = sc.next();
            String t = sc.nextLine();
            
            phongBan tmp = new phongBan(m, t);
            pb.add(tmp);
        }
        
        int k = sc.nextInt();
        for(int i = 1; i <= k; ++i){
            sc.nextLine();
            String m = sc.nextLine();
            String t = sc.nextLine();
            int lcb = sc.nextInt();
            int snc = sc.nextInt();
            
            tinhLuong tmp = new tinhLuong(m, t, lcb, snc);
            
            for(phongBan it : pb){
                if(tmp.getMa().substring(3).equals(it.getMaPhong())){
                    tmp.setPhongBan(it.getTenPhong());
                }
            }
            arr.add(tmp);
        }
        
        String check = sc.next();
        
        for(phongBan it : pb){
            if(it.getMaPhong().equals(check)){
                System.out.println("Bang luong phong" + it.getTenPhong() + ":");
                break;
            }
        }
        
        for(tinhLuong it : arr){
            if(it.getMa().substring(3).equals(check)){
                System.out.println(it);
            }
        }
    }
}
