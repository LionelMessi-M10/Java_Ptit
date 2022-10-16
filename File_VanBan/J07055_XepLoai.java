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
public class J07055_XepLoai {
    
    static class xepLoai{
        private String ma, ten;
        private int luyenTap, thucHanh, diemThi;

        public xepLoai(String ma, String ten, int luyenTap, int thucHanh, int diemThi) {
            this.ma = ma;
            this.ten = ten;
            this.luyenTap = luyenTap;
            this.thucHanh = thucHanh;
            this.diemThi = diemThi;
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
        
        public float tongDiem(){
            return (float) (1.0 * luyenTap * 25 / 100 + 1.0 * thucHanh * 35 / 100 + 1.0 * diemThi * 40 / 100);
        }
        
        public String Loai(){
            if(tongDiem() >= 8) return "GIOI";
            else if(tongDiem() >= 6.5 && tongDiem() < 8){
                return "KHA";
            }
            else if(tongDiem() >= 5 && tongDiem() < 6.5){
                return "TRUNG BINH";
            }
            return "KEM";
        }

        @Override
        public String toString() {
            return ma + " " + chuanHoaTen() + " " + String.format("%.2f", tongDiem()) + " " + Loai();
        }
    }
    
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("BANGDIEM.in"));
        
        ArrayList<xepLoai> arr = new ArrayList<>();
        
        int n = sc.nextInt();
        for(int i = 1; i <= n; ++i){
            String ma = String.format("SV%02d", i);
            sc.nextLine();
            String ten = sc.nextLine();
            int d1 = sc.nextInt();
            int d2 = sc.nextInt();
            int d3 = sc.nextInt();
            
            xepLoai tmp = new xepLoai(ma, ten, d1, d2, d3);
            arr.add(tmp);
        }
        
        Collections.sort(arr, new Comparator<xepLoai>(){
            @Override
            public int compare(xepLoai o1, xepLoai o2) {
                if(o2.tongDiem() - o1.tongDiem() > 0){
                    return 1;
                }
                return -1;
            }
        });
        
        for(xepLoai it : arr){
            System.out.println(it);
        }
    }
}
