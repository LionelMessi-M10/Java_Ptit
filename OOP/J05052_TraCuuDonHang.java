/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OOP;

import java.util.ArrayList;
import java.util.Scanner;

/**
3
Kaki 2
K0252
80000
15
Jean 1
J2011
200000
24
Jean 2
J0982
150000
12
 * @author ADMIN
 */
public class J05052_TraCuuDonHang {
    
    static class donHang{
        private String tenHang, ma;
        private int donGia, soLuong;

        public donHang(String tenHang, String ma, int donGia, int soLuong) {
            this.tenHang = tenHang;
            this.ma = ma;
            this.donGia = donGia;
            this.soLuong = soLuong;
        }
        
        public long giamGia(){
            if("1".equals(this.ma.substring(this.ma.length() - 1))){
                return 1l * donGia * soLuong * 50 / 100;
            }
            return donGia * soLuong * 30 / 100;
        }
        
        public long thanhTien(){
            return 1l * donGia * soLuong - giamGia();
        }

        @Override
        public String toString() {
            return tenHang + " " + ma + " " + ma.substring(1, 4) + " " + giamGia() + " " + thanhTien();
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        ArrayList<donHang> arr = new ArrayList<>();
        
        int n = sc.nextInt();
        
        for(int i = 1; i <= n; ++i){
            sc.nextLine();
            String t = sc.nextLine();
            String m = sc.nextLine();
            int dg = sc.nextInt();
            int sl = sc.nextInt();
            
            donHang tmp = new donHang(t, m, dg, sl);
            arr.add(tmp);
        }
        
        for(donHang it : arr){
            System.out.println(it);
        }
    }
}
