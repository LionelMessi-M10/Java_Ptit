/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OOP;

import java.util.ArrayList;
import java.util.Scanner;

/**
4
DUONG
KG
7500
150
TRUNG
CHUC
10000
225
GAO
KG
14000
118
SUA
HOP
48000
430
 * @author ADMIN
 */
public class J05036_TinhGiaBan_1 {
    static class giaBanHang{
        private String ma, ten, donVi;
        private long donGia, soLuong;

        public giaBanHang(String ma, String ten, String donVi, long donGia, long soLuong) {
            this.ma = ma;
            this.ten = ten;
            this.donVi = donVi;
            this.donGia = donGia;
            this.soLuong = soLuong;
        }
        
        public long phiVanChuyen(){
            return (long)((1.0 * (donGia * soLuong) * 5 / 100) + 0.5);
        }
        
        public long thanhTien(){
            return (long) ((1.0 * (donGia * soLuong + phiVanChuyen())) + 0.5);
        }
        
        public long giaBan(){
            return (long) ((thanhTien() + 1.0 * thanhTien() * 2 / 100) + 0.5);
        }

        @Override
        public String toString() {
            return ma + " " + ten + " " + donVi + " " + phiVanChuyen() + " " + thanhTien() + " " + giaBan();
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        ArrayList<giaBanHang> arr = new ArrayList<>();
        
        int n = sc.nextInt();
        
        for(int i = 1; i <= n; ++i){
            sc.nextLine();
            String m = String.format("MH%02d", i);
            String t = sc.nextLine();
            String dv = sc.nextLine();
            long dg = sc.nextLong();
            long sl = sc.nextLong();
            
            giaBanHang tmp = new giaBanHang(m, t, dv, dg, sl);
            arr.add(tmp);
        }
        
        for(giaBanHang it : arr){
            System.out.println(it);
        }
    }
}
