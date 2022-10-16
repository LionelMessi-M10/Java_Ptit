/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java_Basic;

import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

/**
2
KC740
May khoan KC1
39
18
KC742
May cat KC2
46
12
2
Le Ngoc Long
Hoang Mai
KC740
11
21/05/2009
Nguyen Sao Mai
Hoan Kiem
KC742
17
06/02/2009
 * @author ADMIN
 */
public class J07049_TinhNgayHetHanBaoHanh {

    static class SanPham{
        private String maSanPham, tenSanPham;
        private int giaBan, thoiHan;

        public SanPham(String maSanPham, String tenSanPham, int giaBan, int thoiHan) {
            this.maSanPham = maSanPham;
            this.tenSanPham = tenSanPham;
            this.giaBan = giaBan;
            this.thoiHan = thoiHan;
        }

        public String getMaSanPham() {
            return maSanPham;
        }

        public String getTenSanPham() {
            return tenSanPham;
        }

        public int getGiaBan() {
            return giaBan;
        }

        public int getThoiHan() {
            return thoiHan;
        }
    }
    
    static class KhachHang{
        private String maKH, tenKH, diaChi, maSP;
        private int soLuongMua;
        private String ngayMua;
        private int gia, thangHan;

        public void setGia(int gia) {
            this.gia = gia;
        }

        public void setThangHan(int thangHan) {
            this.thangHan = thangHan;
        }

        public String getMaKH() {
            return maKH;
        }

        public int getThangHan() {
            return thangHan;
        }

        public KhachHang(String maKH, String tenKH, String diaChi, String maSP, int soLuongMua, String ngayMua) {
            this.maKH = maKH;
            this.tenKH = tenKH;
            this.diaChi = diaChi;
            this.maSP = maSP;
            this.soLuongMua = soLuongMua;
            this.ngayMua = ngayMua;
        }

        public String ngayHetHan(){
            LocalDate date = LocalDate.parse(ngayMua, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
            date = date.plusMonths(thangHan);
            return date.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        }
        
        public String chuyen() {
            return ngayHetHan().substring(6 ) + ngayHetHan().substring(3 , 5) 
                    + ngayHetHan().substring(0 , 2);
        }
        
        public long tongTien(){
            return 1l * gia * soLuongMua;
        }

        public String getNgayMua() {
            return ngayMua;
        }

        @Override
        public String toString() {
            return maKH + " " + tenKH + " " + diaChi + " " + maSP + " " +
                    tongTien() + " " + ngayHetHan();
        }
    }

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("MUAHANG.in"));
        
        ArrayList<SanPham> list1 = new ArrayList<>();
        ArrayList<KhachHang> list2 = new ArrayList<>();
        
        int n = sc.nextInt();
        for(int i = 1; i <= n; ++i){
            sc.nextLine();
            String ma = sc.nextLine();
            String ten = sc.nextLine();
            int gia = sc.nextInt();
            int han = sc.nextInt();
            
            SanPham tmp = new SanPham(ma, ten, gia, han);
            list1.add(tmp);
        }
        
        int m = sc.nextInt();
        sc.nextLine();
        for(int i = 1; i <= m; ++i){
            String ma = String.format("KH%02d", i);
            String ten = sc.nextLine();
            String diachi = sc.nextLine();
            String maSp = sc.nextLine();
            int soLuong = sc.nextInt();
            sc.nextLine();
            String nm = sc.nextLine();
            
            KhachHang tmp = new KhachHang(ma, ten, diachi, maSp, soLuong, nm);
            
            for(SanPham it : list1){
                if(it.getMaSanPham().equals(maSp)){
                    tmp.setGia(it.getGiaBan());
                    tmp.setThangHan(it.getThoiHan());
                }
            }
            
            list2.add(tmp);
        }
        
        Collections.sort(list2, new Comparator<KhachHang>(){
            @Override
            public int compare(KhachHang t, KhachHang t1) {
                if(!t.chuyen().equals(t1.chuyen())){
                    return t.chuyen().compareTo(t1.chuyen());
                }
                return t.getMaKH().compareTo(t1.getMaKH());
            }
        });
        
        for(KhachHang it : list2){
            System.out.println(it);
        }
    }
}