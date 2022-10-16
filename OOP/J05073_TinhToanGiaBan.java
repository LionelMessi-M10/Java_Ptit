/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OOP;

import java.util.ArrayList;
import java.util.Scanner;

/**
2
TTVC 400 300
CCAK 200 200
 * @author ADMIN
 */
public class J05073_TinhToanGiaBan {
    static class GiaBan{
        private String maDonHang;
        private int donGia, soLuong;

        public GiaBan(String maDonHang, int donGia, int soLuong) {
            this.maDonHang = maDonHang;
            this.donGia = donGia;
            this.soLuong = soLuong;
        }
        
        public int tienHang(){
            return donGia * soLuong;
        }
        
        public float thue(){
            if(maDonHang.charAt(0) == 'T'){
                return (float) (1.0 * tienHang() * 29 / 100.0);
            }
            else if(maDonHang.charAt(0) == 'C'){
                return (float) (1.0 * tienHang() * 10 / 100.0);
            }
            else if(maDonHang.charAt(0) == 'D'){
                return (float) (1.0 * tienHang() * 8 / 100.0);
            }
            return (float) (tienHang() * 2 / 100.0);
        }
        
        public float phiVanChuyen(){
            if(maDonHang.charAt(0) == 'T'){
                return (float) (1.0 * tienHang() * 4 / 100.0);
            }
            else if(maDonHang.charAt(0) == 'C'){
                return (float) (1.0 * tienHang() * 3 / 100.0);
            }
            else if(maDonHang.charAt(0) == 'D'){
                return (float) (1.0 * tienHang() * 2.5 / 100.0);
            }
            return (float) (tienHang() * 0.5 / 100.0);
        }
        
        public float thanhTien(){
            float tien = (float) (1.0 * tienHang() + 1.0 * phiVanChuyen());
            if(maDonHang.charAt(maDonHang.length() - 1) == 'C'){
                tien += 1.0 * thue() * 95 / 100;
            }
            else tien += thue();
            return (float) (((1.0*(tien + tien * 20 / 100.0)/soLuong))/100.0) * 100;
        }

        @Override
        public String toString() {
            return maDonHang + " " + String.format("%.2f", thanhTien());
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        ArrayList<GiaBan> list = new ArrayList<>();
        
        int n = sc.nextInt();
        for(int i = 1; i <= n; ++i){
            String s = sc.next();
            int gia = sc.nextInt();
            int sl = sc.nextInt();
            
            GiaBan tmp = new GiaBan(s, gia, sl);
            list.add(tmp);
        }
        
        for(GiaBan it : list){
            System.out.println(it);
        }
    }
}
