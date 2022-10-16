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
ML01
May lanh SANYO
12
4000000
2400000
ML02
May lanh HITACHI
4
2550000000
0
ML03
May lanh NATIONAL
5
3000000
150000
 * @author ADMIN
 */
public class J05012_TinhTien {
    
    static class hoaDon{
        private String ma, ten;
        private long soLuong, donGia, chietKhau;

        public hoaDon(String ma, String ten, long soLuong, long donGia, long chietKhau) {
            this.ma = ma;
            this.ten = ten;
            this.soLuong = soLuong;
            this.donGia = donGia;
            this.chietKhau = chietKhau;
        }
        
        public long thanhTien(){
            return donGia * soLuong - chietKhau;
        }

        @Override
        public String toString() {
            return ma + " " + ten + " " + donGia + " " + soLuong + " " + chietKhau + " " + 
                    thanhTien();
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        ArrayList<hoaDon> arr = new ArrayList<>();
        
        int n = sc.nextInt();
        for(int i = 1; i <= n; ++i){
            sc.nextLine();
            String m = sc.nextLine();
            String t = sc.nextLine();
            long dg = sc.nextLong();
            long sl = sc.nextLong();
            long ck = sc.nextLong();
            
            hoaDon tmp = new hoaDon(m, t, sl, dg, ck);
            arr.add(tmp);
        }
        
        Collections.sort(arr, new Comparator<hoaDon>(){
            @Override
            public int compare(hoaDon o1, hoaDon o2) {
                if(o2.thanhTien() - o1.thanhTien() > 0){
                    return 1;
                }
                return -1;
            }
        });
        
        for(hoaDon it : arr){
            System.out.println(it);
        }
    }
}
