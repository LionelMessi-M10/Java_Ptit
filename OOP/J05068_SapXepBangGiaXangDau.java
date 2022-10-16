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
3
N89BP 4500
D00BP 3500
X92SH 2600
 * @author ADMIN
 */
public class J05068_SapXepBangGiaXangDau {
    
    static class xangDau{
        private String ma;
        private int soLuong;

        public xangDau(String ma, int soLuong) {
            this.ma = ma;
            this.soLuong = soLuong;
        }
        
        public int donGia(){
            if(ma.charAt(0) == 'X') return 128000;
            else if(ma.charAt(0) == 'D') return 11200;
            return 9700;
        }
        
        public String tenHang(){
            String tmp = ma.substring(3);
            String ans = "";
            if("BP".equals(tmp)) ans = "British Petro";
            else if("ES".equals(tmp)) ans = "Esso";
            else if("SH".equals(tmp)) ans = "Shell";
            else if("CA".equals(tmp)) ans = "Castrol";
            else if("MO".equals(tmp)) ans = "Mobil";
            else if("TN".equals(tmp)) ans = "Trong Nuoc";
            return ans;
        }
        
        public int thue(){
            String tmp = ma.substring(3);
            int ans = 0;
            if(ma.charAt(0) == 'X' && !"TN".equals(tmp)) 
                ans = (int) (1l * soLuong * donGia() * 3 / 100);
            else if(ma.charAt(0) == 'D' && !"TN".equals(tmp)) 
                ans = (int) (1l * soLuong * donGia() * 3.5 / 100);
            else if(ma.charAt(0) == 'N' && !"TN".equals(tmp)) 
                ans = (int) (1l * soLuong * donGia() * 2 / 100);
            else if("TN".equals(tmp)) ans = 0;
            return ans;
        }
        
        public long thanhTien(){
            return 1l * soLuong * donGia() + thue();
        }

        @Override
        public String toString() {
            return ma + " " + tenHang() + " " + donGia() + " " + thue() + " " + thanhTien();
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        ArrayList<xangDau> arr = new ArrayList<>();
        
        int n = sc.nextInt();
        for(int i = 1; i <= n; ++i){
            String m = sc.next();
            int sl = sc.nextInt();
            
            xangDau tmp = new xangDau(m, sl);
            arr.add(tmp);
        }
        
        Collections.sort(arr, new Comparator<xangDau>(){
            @Override
            public int compare(xangDau o1, xangDau o2) {
                if(o2.thanhTien() - o1.thanhTien() > 0) return 1;
                return -1;
            }
        });
        
        for(xangDau it : arr){
            System.out.println(it);
        }
    }
}
