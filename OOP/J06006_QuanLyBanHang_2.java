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
2
Nguyen Van Nam
Nam
12/12/1997
Mo Lao-Ha Dong-Ha Noi
Tran Van Binh
Nam
11/14/1995
Phung Khoang-Nam Tu Liem-Ha Noi
2
Ao phong tre em
Cai
25000
41000
Ao khoac nam
Cai
240000
515000
3
KH001 MH001 2
KH001 MH002 3
KH002 MH002 4
 * @author ADMIN
 */
public class J06006_QuanLyBanHang_2 {
    
    static class MatHang{
        private String maMatHang, tenMatHang, donVi;
        private int giaMua, giaBan;

        public String getMaMatHang() {
            return maMatHang;
        }

        public String getTenMatHang() {
            return tenMatHang;
        }

        public String getDonVi() {
            return donVi;
        }

        public int getGiaMua() {
            return giaMua;
        }

        public int getGiaBan() {
            return giaBan;
        }

        public MatHang(String maMatHang, String tenMatHang, String donVi, int giaMua, int giaBan) {
            this.maMatHang = maMatHang;
            this.tenMatHang = tenMatHang;
            this.donVi = donVi;
            this.giaMua = giaMua;
            this.giaBan = giaBan;
        }
    }
    
    static class HoaDon{
        private String maHoaDon, maKH, maMH;
        private int soLuong;

        public String getMaHoaDon() {
            return maHoaDon;
        }

        public String getMaKH() {
            return maKH;
        }

        public String getMaMH() {
            return maMH;
        }

        public int getSoLuong() {
            return soLuong;
        }

        public HoaDon(String maHoaDon, String maKH, String maMH, int soLuong) {
            this.maHoaDon = maHoaDon;
            this.maKH = maKH;
            this.maMH = maMH;
            this.soLuong = soLuong;
        }
    }
    
    static class KhachHang{
        private String maKhachHang, tenKhachHang, gioiTinh, ngaySinh, diaChi;
        private String maHD, maMH, tenMH, donViMua;
        private int giaMuaHang, giaBanHang, soLuongHang;
        
        

        public void setTenMH(String tenMH) {
            this.tenMH = tenMH;
        }
        
        public void setMaKhachHang(String maKhachHang) {
            this.maKhachHang = maKhachHang;
        }

        public void setTenKhachHang(String tenKhachHang) {
            this.tenKhachHang = tenKhachHang;
        }

        public void setGioiTinh(String gioiTinh) {
            this.gioiTinh = gioiTinh;
        }

        public void setNgaySinh(String ngaySinh) {
            this.ngaySinh = ngaySinh;
        }

        public void setDiaChi(String diaChi) {
            this.diaChi = diaChi;
        }

        public void setMaHD(String maHD) {
            this.maHD = maHD;
        }

        public void setMaMH(String maMH) {
            this.maMH = maMH;
        }

        public void setDonViMua(String donViMua) {
            this.donViMua = donViMua;
        }

        public void setGiaMuaHang(int giaMuaHang) {
            this.giaMuaHang = giaMuaHang;
        }

        public void setGiaBanHang(int giaBanHang) {
            this.giaBanHang = giaBanHang;
        }

        public void setSoLuongHang(int soLuongHang) {
            this.soLuongHang = soLuongHang;
        }

        public String getMaKhachHang() {
            return maKhachHang;
        }

        public String getTenKhachHang() {
            return tenKhachHang;
        }

        public String getGioiTinh() {
            return gioiTinh;
        }

        public String getNgaySinh() {
            return ngaySinh;
        }

        public String getDiaChi() {
            return diaChi;
        }

        public String getMaMH() {
            return maMH;
        }

        public String getMaHD() {
            return maHD;
        }

        public String getTenMH() {
            return tenMH;
        }

        public String getDonViMua() {
            return donViMua;
        }

        public int getGiaMuaHang() {
            return giaMuaHang;
        }

        public int getGiaBanHang() {
            return giaBanHang;
        }

        public int getSoLuongHang() {
            return soLuongHang;
        }
        
        public KhachHang(String maKhachHang, String tenKhachHang, String gioiTinh, String ngaySinh, String diaChi) {
            this.maKhachHang = maKhachHang;
            this.tenKhachHang = tenKhachHang;
            this.gioiTinh = gioiTinh;
            this.ngaySinh = ngaySinh;
            this.diaChi = diaChi;
        }

        public KhachHang(String maKhachHang, String tenKhachHang, String gioiTinh, String ngaySinh, String diaChi, String maHD, String maMH, String tenMH, String donViMua, int giaMuaHang, int giaBanHang, int soLuongHang) {
            this.maKhachHang = maKhachHang;
            this.tenKhachHang = tenKhachHang;
            this.gioiTinh = gioiTinh;
            this.ngaySinh = ngaySinh;
            this.diaChi = diaChi;
            this.maHD = maHD;
            this.maMH = maMH;
            this.tenMH = tenMH;
            this.donViMua = donViMua;
            this.giaMuaHang = giaMuaHang;
            this.giaBanHang = giaBanHang;
            this.soLuongHang = soLuongHang;
        }
        
        public int thanhTien(){
            return giaBanHang * soLuongHang;
        }
        
        public int loiNhuan(){
            return thanhTien() - giaMuaHang * soLuongHang;
        }

        @Override
        public String toString() {
            return maHD + " " + tenKhachHang + " " + diaChi + " " + tenMH +
                    " " + soLuongHang + " " + thanhTien() + " " + loiNhuan(); 
        }
    }
    
    
/*
HD003 Tran Van Binh Phung Khoang-Nam Tu Liem-Ha Noi Ao khoac nam 4 2060000 1100000
HD002 Nguyen Van Nam Mo Lao-Ha Dong-Ha Noi Ao khoac nam 3 1545000 825000
HD001 Nguyen Van Nam Mo Lao-Ha Dong-Ha Noi Ao phong tre em 2 82000 32000
*/
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        ArrayList<MatHang> mh = new ArrayList<>();
        ArrayList<HoaDon> hd = new ArrayList<>();
        ArrayList<KhachHang> kh = new ArrayList<>();
        ArrayList<KhachHang> ans = new ArrayList<>();
        
        int n = sc.nextInt();
        sc.nextLine();
        for(int i = 1; i <= n; ++i){
            String ma = String.format("KH%03d", i);
            String ten = sc.nextLine();
            String gt = sc.nextLine();
            String ns = sc.nextLine();
            String dc = sc.nextLine();
            
            KhachHang tmp = new KhachHang(ma, ten, gt, ns, dc);
            kh.add(tmp);
        }
        
        int m = sc.nextInt();
        for(int i = 1; i <= m; ++i){
            String ma = String.format("MH%03d", i);
            sc.nextLine();
            String ten = sc.nextLine();
            String dv = sc.nextLine();
            int mua = sc.nextInt();
            int ban = sc.nextInt();
            
            MatHang tmp = new MatHang(ma, ten, dv, mua, ban);
            mh.add(tmp);
        }
        
        int k = sc.nextInt();
        for(int i = 1; i <= k; ++i){
            String ma = String.format("HD%03d", i);
            String makhach = sc.next();
            String mahang = sc.next();
            int sl = sc.nextInt();
            
            for(KhachHang it : kh){
                if(it.getMaKhachHang().equals(makhach)){
                    it.setMaHD(ma);
                    it.setMaMH(mahang);
                    it.setSoLuongHang(sl);
                    for(MatHang it1 : mh){
                        if(it1.getMaMatHang().equals(it.getMaMH())){
                            it.setTenMH(it1.getTenMatHang());
                            it.setDonViMua(it1.getDonVi());
                            it.setGiaMuaHang(it1.getGiaMua());
                            it.setGiaBanHang(it1.getGiaBan());
                        }
                    }
                    KhachHang tmp = new KhachHang(it.getMaKhachHang(), it.getTenKhachHang(), it.getGioiTinh(), it.getNgaySinh(), it.getDiaChi(), it.getMaHD(), it.getMaMH(), it.getTenMH(), it.getDonViMua(), it.getGiaMuaHang(), it.getGiaBanHang(), it.getSoLuongHang());
                    ans.add(tmp);
                }
            }
        }
        
        Collections.sort(ans, new Comparator<KhachHang>(){
            @Override
            public int compare(KhachHang o1, KhachHang o2) {
                return o2.loiNhuan() - o1.loiNhuan();
            }
        });
        
        for(KhachHang it : ans){
            System.out.println(it);
        }
    }
}
