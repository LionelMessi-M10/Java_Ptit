/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package File_VanBan;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ADMIN
 */
public class J07047_QuanLyKhachSan {
    
    static class khachSan{
        private String kyHieu, tenPhong;
        private int donGia;
        private float phiPhucVu;

        public khachSan(String kyHieu, String tenPhong, int donGia, float phiPhucVu) {
            this.kyHieu = kyHieu;
            this.tenPhong = tenPhong;
            this.donGia = donGia;
            this.phiPhucVu = phiPhucVu;
        }

        public String getKyHieu() {
            return kyHieu;
        }

        public String getTenPhong() {
            return tenPhong;
        }

        public int getDonGia() {
            return donGia;
        }

        public float getPhiPhucVu() {
            return phiPhucVu;
        }
    }
    
    static class khachHang{
        private String ma, ten, maPhong, ngayDen, ngayDi;

        public khachHang(String ma, String ten, String maPhong, String ngayDen, String ngayDi) {
            this.ma = ma;
            this.ten = ten;
            this.maPhong = maPhong;
            this.ngayDen = ngayDen;
            this.ngayDi = ngayDi;
        }

        public String getMa() {
            return ma;
        }

        public String getTen() {
            return ten;
        }

        public String getMaPhong() {
            return maPhong;
        }

        public String getNgayDen() {
            return ngayDen;
        }

        public String getNgayDi() {
            return ngayDi;
        }
        
        public long ngayO(){
            long ans = 0;
            SimpleDateFormat date = new SimpleDateFormat("dd/MM/yyyy");
            
            try {
                Date den = date.parse(ngayDen);
                Date di = date.parse(ngayDi);
                
                long time = di.getTime() - den.getTime();
                ans = time / (24 * 60 * 60 * 1000);
            } catch (ParseException ex) {
                Logger.getLogger(J07047_QuanLyKhachSan.class.getName()).log(Level.SEVERE, null, ex);
            }
            return ans;
        }
    }
    
    static class HoaDon{
        private String maKH, tenKH, maPhong;
        private long ngayLuuTru;
        private double tienTra;

        public HoaDon() {
        }

        public void setMaKH(String maKH) {
            this.maKH = maKH;
        }

        public void setTenKH(String tenKH) {
            this.tenKH = tenKH;
        }

        public void setMaPhong(String maPhong) {
            this.maPhong = maPhong;
        }

        public void setNgayLuuTru(long ngayLuuTru) {
            this.ngayLuuTru = ngayLuuTru;
        }

        public void setTienTra(double tienTra) {
            this.tienTra = tienTra;
        }

        public long getNgayLuuTru() {
            return ngayLuuTru;
        }

        @Override
        public String toString() {
            return maKH + " " + tenKH + " " + maPhong + " " + ngayLuuTru + " " + String.format("%.2f", tienTra); 
        }
    }
    
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA.in"));
        
        ArrayList<khachSan> list1 = new ArrayList<>();
        ArrayList<khachHang> list2 = new ArrayList<>();
        ArrayList<HoaDon> list3 = new ArrayList<>();
        
        int n = sc.nextInt();
        for(int i = 1; i <= n; ++i){
            String kyhieu = sc.next();
            String ten = sc.next();
            int dongia = sc.nextInt();
            float phi = sc.nextFloat();
            
            khachSan tmp = new khachSan(kyhieu, ten, dongia, phi);
            list1.add(tmp);
        }
        
        int m = sc.nextInt();
        sc.nextLine();
        for(int i = 1; i <= m; ++i){
            String ma = String.format("KH%02d", i);
            String ten = sc.nextLine();
            String maP = sc.nextLine();
            String den = sc.nextLine();
            String di = sc.nextLine();
            
            khachHang tmp = new khachHang(ma, ten, maP, den, di);
            list2.add(tmp);
        }
        
        for(khachHang it : list2){
            HoaDon tmp = new HoaDon();
            tmp.setMaKH(it.getMa());
            tmp.setTenKH(it.getTen());
            tmp.setMaPhong(it.getMaPhong());
            tmp.setNgayLuuTru(it.ngayO());
            
            for(khachSan it1 : list1){
                if(it1.getKyHieu().equals(Character.toString(it.getMaPhong().charAt(2)))){
                    double tien = 0;
                    long ngay = it.ngayO();
                    if(ngay == 0) ngay = 1;
                    double tienPhong = 1.0 * it1.getDonGia() * ngay + 1.0 * it1.getPhiPhucVu() * it1.getDonGia() * ngay;
                    if(tmp.getNgayLuuTru() < 10) tien = 1.0 * tienPhong;
                    
                    else if(tmp.getNgayLuuTru() >= 10 && tmp.getNgayLuuTru() < 20){
                        tien = 1.0 * (tienPhong - 1.0 * tienPhong * 2 / 100);
                    }
                    
                    else if(tmp.getNgayLuuTru() >= 20 && tmp.getNgayLuuTru() < 30){
                        tien = 1.0 *(tienPhong - 1.0 * tienPhong * 4 / 100);
                    }
                    
                    else{
                        tien = 1.0 * (tienPhong - 1.0 * tienPhong * 6 / 100);
                    }
                    
                    tmp.setTienTra(tien);
                    list3.add(tmp);
                    tmp = new HoaDon();
                }
            }
        }
        
        Collections.sort(list3, new Comparator<HoaDon>(){
            @Override
            public int compare(HoaDon o1, HoaDon o2) {
                if(o2.getNgayLuuTru() - o1.getNgayLuuTru() > 0){
                    return 1;
                }
                return -1;
            }
        });
        
        for(HoaDon it : list3){
            System.out.println(it);
        }
    }
}
