/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OOP;

import java.util.ArrayList;
import java.util.Scanner;

/**
2
A001
Tu lanh
A
P002
May giat
B
2
A001 500 100 300
P002 1000 1000 500
 * @author ADMIN
 */
public class J05076_NhapXuatHang {
    
    static class NxHang{
        private String ma, ten, xepLoai;
        private int soLuongNhap, donGiaNhap, soLuongXuat;

        public String getMa() {
            return ma;
        }

        public void setSoLuongNhap(int soLuongNhap) {
            this.soLuongNhap = soLuongNhap;
        }

        public void setDonGiaNhap(int donGiaNhap) {
            this.donGiaNhap = donGiaNhap;
        }

        public void setSoLuongXuat(int soLuongXuat) {
            this.soLuongXuat = soLuongXuat;
        }
        
        public int tongGiaTriNhap(){
            return soLuongNhap * donGiaNhap;
        }
        
        public int tongGiaTriXuat(){
            int tmp = soLuongXuat * donGiaNhap;
            if("A".equals(xepLoai)){
                return tmp + tmp * 8 / 100;
            }
            else if("B".equals(xepLoai)){
                return tmp + tmp * 5 / 100;
            }
            return tmp + tmp * 2 / 100;
        }

        public NxHang(String ma, String ten, String xepLoai) {
            this.ma = ma;
            this.ten = ten;
            this.xepLoai = xepLoai;
        }

        @Override
        public String toString() {
            return ma + " " + ten + " " + tongGiaTriNhap() + " " + tongGiaTriXuat();
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        ArrayList<NxHang> arr = new ArrayList<>();
        
        int n = sc.nextInt();
        sc.nextLine();
        
        for(int i = 1; i <= n; ++i){
            String m = sc.nextLine();
            String t = sc.nextLine();
            String xl = sc.nextLine();
            
            NxHang tmp = new NxHang(m, t, xl);
            arr.add(tmp);
        }
        
        int m = sc.nextInt();
        for(int i = 1; i <= m; ++i){
            String mh = sc.next();
            int sln = sc.nextInt();
            int dgn = sc.nextInt();
            int slx = sc.nextInt();
            
            for(NxHang it : arr){
                if(it.getMa().equals(mh)){
                    it.setSoLuongNhap(sln);
                    it.setDonGiaNhap(dgn);
                    it.setSoLuongXuat(slx);
                    System.out.println(it);
                }
            }
        }
    }
}
