/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OOP;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
2
INT1155 Tin hoc co so 2
INT1306 Cau truc du lieu va giai thuat
2
GV01 Nguyen Van An
GV02 Hoang Binh Minh
2
GV01 INT1155 113.2
GV02 INT1306 126.72
 * @author ADMIN
 */
public class J06007_BangTinhGioChuan {
    
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
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
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
        
        int m = sc.nextInt();
        for(int i = 1; i <= m; ++i){
            String ma = sc.next();
            String ten = sc.nextLine();
            ten = ten.trim();
            
            thongTinGiangVien tmp = new thongTinGiangVien(ma, ten);
            ttgv.add(tmp);
        }
        
        int k = sc.nextInt();
        for(int i = 1; i <= k; ++i){
            String ma = sc.next();
            String maMH = sc.next();
            double gc = sc.nextDouble();
            
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
