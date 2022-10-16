/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OOP;

import java.util.ArrayList;
import java.util.Scanner;

/**
3
B19DCCN999
Le Cong Minh
D19CQAT02-B
B19DCCN998
Tran Truong Giang
D19CQAT02-B
B19DCCN997
Nguyen Tuan Anh
D19CQCN04-B
B19DCCN998 xxxmxmmvmx
B19DCCN997 xmxmxxxvxx
B19DCCN999 xvxmxmmvvm
 * @author ADMIN
 */
public class J05074_DiemDanh_1 {
    
    static class diemDanh{
        private String ma, ten, lop;
        private String maDiemDanh;

        public String getMa() {
            return ma;
        }

        public void setMaDiemDanh(String maDiemDanh) {
            this.maDiemDanh = maDiemDanh;
        }
        
        public int tinhDiem(){
            int tmp = 10;
            for(int i = 0; i < maDiemDanh.length(); ++i){
                if(maDiemDanh.charAt(i) == 'x') tmp -= 0;
                else if(maDiemDanh.charAt(i) == 'm') tmp -= 1;
                else tmp -= 2;
            }
            if(tmp < 0) return 0;
            return tmp;
        }
        
        public String ghiChu(){
            if(tinhDiem() == 0) return "KDDK";
            return "";
        }

        public diemDanh(String ma, String ten, String lop) {
            this.ma = ma;
            this.ten = ten;
            this.lop = lop;
        }

        @Override
        public String toString() {
            return ma + " " + ten + " " + lop + " " + tinhDiem() + " " + ghiChu();
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        ArrayList<diemDanh> arr = new ArrayList<>();
        
        int n = sc.nextInt();
        sc.nextLine();
        
        for(int i = 1; i <= n; ++i){
            String m = sc.nextLine();
            String t = sc.nextLine();
            String l = sc.nextLine();
            
            diemDanh tmp = new diemDanh(m, t, l);
            arr.add(tmp);
        }
        
        for(int i = 1; i <= n; ++i){
            String m = sc.next();
            String dd = sc.next();
            for(diemDanh it : arr){
                if(it.getMa().equals(m)){
                    it.setMaDiemDanh(dd);
                }
            }
        }
        
        for(diemDanh it : arr){
            System.out.println(it);
        }
    }
}
