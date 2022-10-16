/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package File_VanBan;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class J07025_DanhSachKhachHangTrongFile {
    static class khachHang{
        private String ma, ten, gioiTinh, ngaySinh, diaChi;

        public khachHang(String ma, String ten, String gioiTinh, String ngaySinh, String diaChi) {
            this.ma = ma;
            this.ten = ten;
            this.gioiTinh = gioiTinh;
            this.ngaySinh = ngaySinh;
            this.diaChi = diaChi;
        }
        
        public String chuanHoaTen(){
            ten = ten.trim();
            String[] a = ten.split("\\s+");
            String ans = "";
            for(int i = 0; i < a.length; ++i){
                ans += Character.toUpperCase(a[i].charAt(0));
                ans += a[i].substring(1).toLowerCase();
                ans += " ";
            }
            return ans.trim();
        }
        
        public String chuanNgaySinh(){
            StringBuilder sb = new StringBuilder(ngaySinh);
            
            if(sb.charAt(1) == '/') sb.insert(0, '0');
            if(sb.charAt(4) == '/') sb.insert(3, '0');
            
            return sb.toString();
        }
        
        public String chuyen(){
            String[] a = chuanNgaySinh().split("/");
            String ans = "";
            for(int i = a.length - 1; i >= 0; --i){
                ans += a[i];
            }
            return ans;
        }

        @Override
        public String toString() {
            return ma + " " + chuanHoaTen() + " " + gioiTinh + " " + diaChi + " " + chuanNgaySinh();
        }
    }
    
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("KHACHHANG.in"));
        
        ArrayList<khachHang> arr = new ArrayList<>();
        
        int n = sc.nextInt();
        sc.nextLine();
        
        for(int i = 1; i <= n; ++i){
            String m = String.format("KH%03d", i);
            String t = sc.nextLine();
            String gt = sc.nextLine();
            String ns = sc.nextLine();
            String dc = sc.nextLine();
            
            khachHang tmp = new khachHang(m, t, gt, ns, dc);
            arr.add(tmp);
        }
        
        Collections.sort(arr, new Comparator<khachHang>(){
            @Override
            public int compare(khachHang o1, khachHang o2) {
                return o1.chuyen().compareTo(o2.chuyen());
            }
        });
        
        for(khachHang it : arr){
            System.out.println(it);
        }
    }
}
