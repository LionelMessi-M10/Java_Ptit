/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package File_VanBan;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author ADMIN
 */
public class J07028_TinhGioChuan {
    
    static class monHoc{
        private String ma, ten;

        public monHoc(String ma, String ten) {
            this.ma = ma;
            this.ten = ten;
        }

        public String getMa() {
            return ma;
        }

        public String getTen() {
            return ten;
        }
    }
    
    static class thongTinGiangVien{
        private String maGv, tenGv;

        public thongTinGiangVien(String maGv, String tenGv) {
            this.maGv = maGv;
            this.tenGv = tenGv;
        }

        public String getMaGv() {
            return maGv;
        }

        public String getTenGv() {
            return tenGv;
        }
    }
    
    static class GiangVien{
        private String maGiangVien, maMonHoc, tenGiangVien;
        private double gioChuan;

        public double getGioChuan() {
            return gioChuan;
        }

        public String getTenGiangVien() {
            return tenGiangVien;
        }
        
        public GiangVien(String maGiangVien, String maMonHoc, double gioChuan) {
            this.maGiangVien = maGiangVien;
            this.maMonHoc = maMonHoc;
            this.gioChuan = gioChuan;
        }

        public String getMaGiangVien() {
            return maGiangVien;
        }

        public void setTenGiangVien(String tenGiangVien) {
            this.tenGiangVien = tenGiangVien;
        }

        @Override
        public String toString() {
            return tenGiangVien  + " " + String.format("%.2f", gioChuan);
        }
    }
    
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("MONHOC.in"));
        Scanner sc1 = new Scanner(new File("GIANGVIEN.in"));
        Scanner sc2 = new Scanner(new File("GIOCHUAN.in"));
        
        ArrayList<monHoc> mh = new ArrayList<>();
        ArrayList<thongTinGiangVien> ttgv = new ArrayList<>();
        ArrayList<GiangVien> gv = new ArrayList<>();
        
        int n = sc.nextInt();
        for(int i = 1; i <= n; ++i){
            String ma = sc.next();
            String ten = sc.nextLine();
            ten = ten.trim();
            
            monHoc tmp = new monHoc(ma, ten);
            mh.add(tmp);
        }
        
        int m = sc1.nextInt();
        for(int i = 1; i <= m; ++i){
            String ma = sc1.next();
            String ten = sc1.nextLine();
            ten = ten.trim();
            
            thongTinGiangVien tmp = new thongTinGiangVien(ma, ten);
            ttgv.add(tmp);
        }
        
        int k = sc2.nextInt();
        for(int i = 1; i <= k; ++i){
            String ma = sc2.next();
            String maMH = sc2.next();
            double gc = sc2.nextDouble();
            
            GiangVien tmp = new GiangVien(ma, maMH, gc);
            gv.add(tmp);
        }
        
        for(thongTinGiangVien it : ttgv){
            for(GiangVien it1 : gv){
                if(it1.getMaGiangVien().equals(it.getMaGv())){
                    it1.setTenGiangVien(it.getTenGv());
                }
            }
        }
        
        LinkedHashMap<String, Double> map = new LinkedHashMap<>();
        
        for(GiangVien it : gv){
            if(map.containsKey(it.getTenGiangVien())){
                double ts = map.get(it.getTenGiangVien());
                ts += it.getGioChuan();
                map.put(it.getTenGiangVien(), ts);
            }
            else map.put(it.getTenGiangVien(), it.getGioChuan());
        }
        
        Set<Map.Entry<String, Double>> entry = map.entrySet();
        
        for(Map.Entry<String, Double> it : entry){
            System.out.println(it.getKey() + " " + String.format("%.2f", it.getValue()));
        }
    }
}
