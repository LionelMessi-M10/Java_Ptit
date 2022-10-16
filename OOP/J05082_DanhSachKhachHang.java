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
2
 nGuyen VAN     nAm
Nam
12/12/1997
Mo Lao-Ha Dong-Ha Noi
 TRan    vAn     biNh
Nam
14/11/1995
Phung Khoang-Nam Tu Liem-Ha Noi
 * @author ADMIN
 */
public class J05082_DanhSachKhachHang {
    
    public static String chuanHoaNgaySinh(String s){
        StringBuilder sb = new StringBuilder(s);
            
        if(sb.charAt(1) == '/') sb.insert(0, "0");
        if(sb.charAt(4) == '/') sb.insert(3, "0");
            
        return sb.toString();
    }
    
    static class khachHang{
        private String ma, ten, gioiTinh, ngaySinh, diaChi;

        public khachHang(String ma, String ten, String gioiTinh, String ngaySinh, String diaChi) {
            this.ma = ma;
            this.ten = ten;
            this.gioiTinh = gioiTinh;
            this.ngaySinh = ngaySinh;
            this.diaChi = diaChi;
        }

        public String getNgaySinh() {
            return ngaySinh;
        }
        
        public String chuanHoaTen(){
            ten = ten.trim();
            String[] a = ten.split("\\s+");
            String ans = "";
            for(int i = 0; i < a.length; ++i){
                ans += Character.toString(a[i].charAt(0)).toUpperCase();
                ans += a[i].substring(1).toLowerCase();
                ans += " ";
            }
            return ans.trim();
        }
        
        public String chuyen(String s){
            String[] a = s.split("/");
            String ans = "";
            for(int i = a.length - 1; i >= 0; --i){
                ans += a[i];
            }
            return ans;
        }

        @Override
        public String toString() {
            return ma + " " + chuanHoaTen() + " " + gioiTinh + " " + diaChi + " " + chuanHoaNgaySinh(ngaySinh);
        }        
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        ArrayList<khachHang> arr = new ArrayList<>();
        
        int n = sc.nextInt();
        sc.nextLine();
        for(int i = 1; i <= n; ++i){
            String m = String.format("KH%03d", i);
            String t = sc.nextLine();
            String gt = sc.nextLine();
            String ns = sc.nextLine();
            String dc = sc.nextLine();
            
            khachHang tmp = new khachHang(m, t, gt, chuanHoaNgaySinh(ns), dc);
            arr.add(tmp);
        }
        
        Collections.sort(arr, new Comparator<khachHang>(){
            @Override
            public int compare(khachHang o1, khachHang o2) {
                return o1.chuyen(o1.getNgaySinh()).compareTo(o2.chuyen(o2.getNgaySinh()));
            }
        });
        
        for(khachHang it : arr){
            System.out.println(it);
        }
    }
}
