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
4
VIETTEL
TAP DOAN VIEN THONG QUAN DOI VIETTEL
40
FSOFT
CONG TY TNHH PHAN MEM FPT - FPT SOFTWARE
300
VNPT
TAP DOAN BUU CHINH VIEN THONG VIET NAM
200
SUN
SUN*
50
1
30 50
 * @author ADMIN
 */
public class J05029_DanhSachDoanhNghiep_2 {
    static class doanhNghiep{
        private String ma, ten;
        private int soLuong;

        public String getMa() {
            return ma;
        }

        public int getSoLuong() {
            return soLuong;
        }

        public doanhNghiep(String ma, String ten, int soLuong) {
            this.ma = ma;
            this.ten = ten;
            this.soLuong = soLuong;
        }

        @Override
        public String toString() {
            return ma + " " + ten + " " + soLuong;
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        ArrayList<doanhNghiep> arr = new ArrayList<>();
        
        int n = sc.nextInt();
        for(int i = 1; i <= n; ++i){
            sc.nextLine();
            String m = sc.nextLine();
            String t = sc.nextLine();
            int sl = sc.nextInt();
            
            doanhNghiep tmp = new doanhNghiep(m, t, sl);
            arr.add(tmp);
        }
        
        Collections.sort(arr, new Comparator<doanhNghiep>(){
            @Override
            public int compare(doanhNghiep o1, doanhNghiep o2) {
                if(o1.getSoLuong() != o2.getSoLuong()){
                    return o2.getSoLuong() - o1.getSoLuong();
                }
                return o1.getMa().compareTo(o2.getMa());
            }
        });
        
        int q = sc.nextInt();
        while(q-- > 0){
            int l = sc.nextInt(), r = sc.nextInt();
            
            System.out.println("DANH SACH DOANH NGHIEP NHAN TU " + l + " DEN " + r + " SINH VIEN:");
            
            for(doanhNghiep it : arr){
                if(it.getSoLuong() >= l && it.getSoLuong() <= r){
                    System.out.println(it);
                }
            }
        }
    }
}
