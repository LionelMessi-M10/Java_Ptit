/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OOP;

import java.util.ArrayList;
import java.util.Scanner;

/**
3
GV01
Nguyen Kim Loan
1420000
HT05
Hoang Thanh Tuan
1780000
GV02
Tran Binh Nguyen
1468000
 * @author ADMIN
 */
public class J05064_BangThuNhapGiaoVien {
    
    static class giaoVien{
        private String ma, ten;
        private int luongCoBan;

        public giaoVien(String ma, String ten, int luongCoBan) {
            this.ma = ma;
            this.ten = ten;
            this.luongCoBan = luongCoBan;
        }

        public String getMa() {
            return ma;
        }
        
        public int heSo(){
            return Integer.parseInt(ma.substring(2));
        }
        
        public int phuCap(){
            String tmp = ma.substring(0, 2);
            if("HT".equals(tmp)) return 2000000;
            else if("HP".equals(tmp)) return 900000;
            return 500000;
        }
        
        public int thuNhap(){
            return luongCoBan * heSo() + phuCap();
        }

        @Override
        public String toString() {
            return ma + " " + ten + " " + heSo() + " " + phuCap() + " " + thuNhap();
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        ArrayList<giaoVien> arr = new ArrayList<>();
        
        int n = sc.nextInt();
        for(int i = 1; i <= n; ++i){
            sc.nextLine();
            String m = sc.nextLine();
            String t = sc.nextLine();
            int lcb = sc.nextInt();
            
            giaoVien tmp = new giaoVien(m, t, lcb);
            arr.add(tmp);
        }
        
        int ht = 0;
        int hp = 0;
        
        for(giaoVien it : arr){
            if("HT".equals(it.getMa().substring(0, 2)) && ht < 1){
                System.out.println(it);
                ++ht;
            }
            else if("HP".equals(it.getMa().substring(0, 2)) && hp < 2){
                System.out.println(it);
                ++hp;
            }
            else if("GV".equals(it.getMa().substring(0, 2))) System.out.println(it);
        }
    }
}
