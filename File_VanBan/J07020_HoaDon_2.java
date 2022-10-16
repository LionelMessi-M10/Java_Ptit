/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package File_VanBan;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;


/**
 *
 * @author ADMIN
 */

public class J07020_HoaDon_2 {
    
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
        
        public KhachHang(String maKhachHang, String tenKhachHang, String gioiTinh, String ngaySinh, String diaChi) {
            this.maKhachHang = maKhachHang;
            this.tenKhachHang = tenKhachHang;
            this.gioiTinh = gioiTinh;
            this.ngaySinh = ngaySinh;
            this.diaChi = diaChi;
        }
    
        public int thanhTien(){
            return giaBanHang * soLuongHang;
        }

        @Override
        public String toString() {
            return maHD + " " + tenKhachHang + " " + diaChi + " " + tenMH +
                    " " + donViMua + " " + giaMuaHang + " " + giaBanHang +
                    " " + soLuongHang + " " + thanhTien();
        }
    }
    
/*
HD001 Nguyen Van Nam Mo Lao-Ha Dong-Ha Noi Ao phong tre em Cai 25000 41000 2 82000
HD002 Nguyen Van Nam Mo Lao-Ha Dong-Ha Noi Ao khoac nam Cai 240000 515000 3 1545000
HD003 Tran Van Binh Phung Khoang-Nam Tu Liem-Ha Noi Ao khoac nam Cai 240000 515000 4 2060000
*/
    
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("KH.in"));
        Scanner sc1 = new Scanner(new File("MH.in"));
        Scanner sc2 = new Scanner(new File("HD.in"));
        
        ArrayList<MatHang> mh = new ArrayList<>();
        ArrayList<HoaDon> hd = new ArrayList<>();
        ArrayList<KhachHang> kh = new ArrayList<>();
        
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
        
        int m = sc1.nextInt();
        for(int i = 1; i <= m; ++i){
            String ma = String.format("MH%03d", i);
            sc1.nextLine();
            String ten = sc1.nextLine();
            String dv = sc1.nextLine();
            int mua = sc1.nextInt();
            int ban = sc1.nextInt();
            
            MatHang tmp = new MatHang(ma, ten, dv, mua, ban);
            mh.add(tmp);
        }
        
        int k = sc2.nextInt();
        for(int i = 1; i <= k; ++i){
            String ma = String.format("HD%03d", i);
            String makhach = sc2.next();
            String mahang = sc2.next();
            int sl = sc2.nextInt();
            
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
                    System.out.println(it);
                }
            }
        }
    }
    
}
