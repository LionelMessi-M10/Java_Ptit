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
Nguyen Van Thanh
20/03/1990
07:00:00
07:10:01
Nguyen Hoa Binh
01/10/1993
07:02:00
07:11:20
Le Thanh Van
15/03/1998
07:05:00
07:15:30
 * @author ADMIN
 */
public class J05055_XepHangVanDongVien_1 {
    
    static class vanDongVien{
        private String ma, ten, ngaySinh, xuatPhat, denDich;
        private int xepHang;

        public String getMa() {
            return ma;
        }

        public void setXepHang(int xepHang) {
            this.xepHang = xepHang;
        }

        public vanDongVien(String ma, String ten, String ngaySinh, String xuatPhat, String denDich) {
            this.ma = ma;
            this.ten = ten;
            this.ngaySinh = ngaySinh;
            this.xuatPhat = xuatPhat;
            this.denDich = denDich;
        }
        
        public String chuyen1(int n){
            int g = n/(60*60);
            int p = (n - g * 60 * 60) / 60;
            int s = n - g*60*60 - p*60;
            return String.format("%02d", g) + ":" + String.format("%02d", p) + ":" + String.format("%02d", s);
        }
        
        public int chuyen2(String s){
            String[] a = s.split(":");
            return Integer.parseInt(a[0]) * 60 * 60 + Integer.parseInt(a[1]) * 60 + Integer.parseInt(a[2]);
        }
        
        public String giayUuTien(){
            int tuoi = 2021 - Integer.parseInt(ngaySinh.substring(6));
            if(tuoi < 18) return "00:00:00";
            else if(tuoi >= 18 && tuoi < 25) return "00:00:01";
            else if(tuoi >= 25 && tuoi < 32) return "00:00:02";
            return "00:00:03";
        }
        
        public int thanhTichThucTe(){
            return chuyen2(denDich) - chuyen2(xuatPhat);
        }
        
        public int thanhTichUuTien(){
            return thanhTichThucTe() - chuyen2(giayUuTien());
        }

        @Override
        public String toString() {
            return ma + " " + ten + " " + chuyen1(thanhTichThucTe()) + " " + giayUuTien()
                    + " " + chuyen1(thanhTichUuTien()) + " " + xepHang;
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        ArrayList<vanDongVien> arr = new ArrayList<>();
        
        int n = sc.nextInt();
        sc.nextLine();
        for(int i = 1; i <= n; ++i){
            String m = String.format("VDV%02d", i);
            String t = sc.nextLine();
            String ns = sc.nextLine();
            String start = sc.nextLine();
            String finish = sc.nextLine();
            
            vanDongVien tmp = new vanDongVien(m, t, ns, start, finish);
            arr.add(tmp);
        }
        
        Collections.sort(arr, new Comparator<vanDongVien>(){
            @Override
            public int compare(vanDongVien o1, vanDongVien o2) {
                return o1.thanhTichUuTien() - o2.thanhTichUuTien();
            }
        });
        
        int thuTu = 1;
        int cnt = 0;
        
        for(int i = 0; i < arr.size() - 1; ++i){
            if(arr.get(i).thanhTichUuTien() == arr.get(i+1).thanhTichUuTien()){
                ++cnt;
                arr.get(i).setXepHang(thuTu);
                arr.get(i + 1).setXepHang(thuTu);
            }
            else{
                arr.get(i).setXepHang(thuTu);
                thuTu += cnt;
                arr.get(i + 1).setXepHang(thuTu + 1);
                ++thuTu;
                cnt = 0;
            }
        }
        
        Collections.sort(arr, new Comparator<vanDongVien>(){
            @Override
            public int compare(vanDongVien o1, vanDongVien o2) {
                return o1.getMa().compareTo(o2.getMa());
            }
        });
        
        for(vanDongVien it : arr){
            System.out.println(it);
        }
    }
}
