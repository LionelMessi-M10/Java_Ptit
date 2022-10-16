/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package File_VanBan;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class J07053_XetTuyen {
    
    static class xetTuyen{
        private String ma, ten, ngaySinh;
        private float lyThuyet, thucHanh;

        public xetTuyen(String ma, String ten, String ngaySinh, float lyThuyet, float thucHanh) {
            this.ma = ma;
            this.ten = ten;
            this.ngaySinh = ngaySinh;
            this.lyThuyet = lyThuyet;
            this.thucHanh = thucHanh;
        }
        
        public float diemThuong(){
            if(lyThuyet >= 8 && thucHanh >= 8){
                return 1;
            }
            else if(lyThuyet >= 7.5 && lyThuyet < 8 && thucHanh >= 7.5 && thucHanh < 8){
                return (float) 0.5;
            }
            return 0;
        }
        
        public int tongDiem(){
            float tong = (lyThuyet + thucHanh)/2 + diemThuong();
            if(tong > 10) return 10;
            return (int) Math.round(tong);
        }
        
        public String xepLoai(){
            String ans = "";
            if(tongDiem() < 5) ans = "Truot";
            else if(tongDiem() == 5 || tongDiem() == 6){
                ans = "Trung binh";
            }
            else if(tongDiem() == 7) ans = "Kha";
            else if(tongDiem() == 8) ans = "Gioi";
            else if(tongDiem() == 9 || tongDiem() == 10){
                ans = "Xuat sac";
            }
            return ans;
        }

        public String chuanHoaTen(){
            String ans = "";
            ten = ten.trim();
            String[] a = ten.split("\\s+");
            
            for(int i = 0; i < a.length; ++i){
                ans += Character.toUpperCase(a[i].charAt(0));
                ans += a[i].substring(1).toLowerCase();
                ans += " ";
            }
            return ans.trim();
        }
        
        public String chuanHoaNgaySinh(){
            StringBuilder sb = new StringBuilder(ngaySinh);
            
            if(sb.charAt(1) == '/') sb.insert(0, "0");
            if(sb.charAt(4) == '/') sb.insert(3, "0");
            
            return sb.toString();
        }
        
        @Override
        public String toString() {
            return ma + " " + chuanHoaTen() + " " + (2021 - Integer.parseInt(chuanHoaNgaySinh().substring(6))) + 
                    " " + tongDiem() + " " + xepLoai();
        }
    }
    
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("XETTUYEN.in"));
        
        ArrayList<xetTuyen> arr = new ArrayList<>();
        
        int n = sc.nextInt();
        for(int i = 1; i <= n; ++i){
            String ma = String.format("PH%02d", i);
            sc.nextLine();
            String t = sc.nextLine();
            String ns = sc.nextLine();
            float lt = sc.nextFloat();
            float th = sc.nextFloat();
            
            xetTuyen tmp = new xetTuyen(ma, t, ns, lt, th);
            arr.add(tmp);
        }
        
        for(xetTuyen it : arr){
            System.out.println(it);
        }
    }
}
