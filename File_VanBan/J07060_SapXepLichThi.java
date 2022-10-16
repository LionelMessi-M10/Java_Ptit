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
public class J07060_SapXepLichThi {
    
    static class MonThi{
        private String maMon, tenMon, hinhThucThi;

        public MonThi(String maMon, String tenMon, String hinhThucThi) {
            this.maMon = maMon;
            this.tenMon = tenMon;
            this.hinhThucThi = hinhThucThi;
        }

        public String getMaMon() {
            return maMon;
        }

        public String getTenMon() {
            return tenMon;
        }

        public String getHinhThucThi() {
            return hinhThucThi;
        }
    }
    
    static class CaThi{
        private String maCaThi, ngayThi, gioThi, phongThi;

        public CaThi(String maCaThi, String ngayThi, String gioThi, String phongThi) {
            this.maCaThi = maCaThi;
            this.ngayThi = ngayThi;
            this.gioThi = gioThi;
            this.phongThi = phongThi;
        }

        public String getMaCaThi() {
            return maCaThi;
        }

        public String getNgayThi() {
            return ngayThi;
        }

        public String getGioThi() {
            return gioThi;
        }

        public String getPhongThi() {
            return phongThi;
        }
    }
    
    static class LichThi{
        private String maCaThi, maMon, maNhom;
        private int soSV;

        public LichThi(String maCaThi, String maMon, String maNhom, int soSV) {
            this.maCaThi = maCaThi;
            this.maMon = maMon;
            this.maNhom = maNhom;
            this.soSV = soSV;
        }

        public String getMaCaThi() {
            return maCaThi;
        }

        public String getMaMon() {
            return maMon;
        }

        public String getMaNhom() {
            return maNhom;
        }

        public int getSoSV() {
            return soSV;
        }
    }
    
    static class KetQua{
        private String maCaThi;
        private String ngayThi, gioThi, IDPhong, tenMon, Nhom;
        private int soSV;

        public KetQua() {
        }

        public void setNgayThi(String ngayThi) {
            this.ngayThi = ngayThi;
        }

        public void setGioThi(String gioThi) {
            this.gioThi = gioThi;
        }

        public void setIDPhong(String IDPhong) {
            this.IDPhong = IDPhong;
        }

        public void setTenMon(String tenMon) {
            this.tenMon = tenMon;
        }

        public void setNhom(String Nhom) {
            this.Nhom = Nhom;
        }

        public void setSoSV(int soSV) {
            this.soSV = soSV;
        }

        public void setMaCaThi(String maCaThi) {
            this.maCaThi = maCaThi;
        }

        public String getMaCaThi() {
            return maCaThi;
        }

        public String getGioThi() {
            return gioThi;
        }

        @Override
        public String toString() {
            return ngayThi + " " + gioThi + " " + IDPhong + " " + tenMon 
                    + " " + Nhom + " " + soSV;
        }
    }
    
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc1 = new Scanner(new File("MONTHI.in"));
        Scanner sc2 = new Scanner(new File("CATHI.in"));
        Scanner sc3 = new Scanner(new File("LICHTHI.in"));
        
        ArrayList<MonThi> list1 = new ArrayList<>();
        ArrayList<CaThi> list2 = new ArrayList<>();
        ArrayList<LichThi> list3 = new ArrayList<>();
        ArrayList<KetQua> res = new ArrayList<>();
        
        int n = sc1.nextInt();
        sc1.nextLine();
        for(int i = 1; i <= n; ++i){
            String ma = sc1.nextLine();
            String ten = sc1.nextLine();
            String hinhThuc = sc1.nextLine();
            
            MonThi tmp = new MonThi(ma, ten, hinhThuc);
            list1.add(tmp);
        }
        
        int m = sc2.nextInt();
        sc2.nextLine();
        for(int i = 1; i <= m; ++i){
            String maCaThi = String.format("C%03d", i);
            String ngayThi = sc2.nextLine();
            String gioThi = sc2.nextLine();
            String phong = sc2.nextLine();
            
            CaThi tmp = new CaThi(maCaThi, ngayThi, gioThi, phong);
            list2.add(tmp);
        }
        
        int k = sc3.nextInt();
        for(int i = 1; i <= k; ++i){
            String macathi = sc3.next();
            String maMon = sc3.next();
            String nhom = sc3.next();
            int sosv = sc3.nextInt();
            
            LichThi tmp = new LichThi(macathi, maMon, nhom, sosv);
            list3.add(tmp);
        }
        
        for(LichThi it : list3){
            KetQua tmp = new KetQua();
            for(CaThi it1 : list2){
                if(it1.getMaCaThi().equals(it.getMaCaThi())){
                    int sum = 0;
                    for(MonThi it2 : list1){
                        if(it2.getMaMon().equals(it.getMaMon())){
                            tmp.setMaCaThi(it1.getMaCaThi());
                            tmp.setNgayThi(it1.getNgayThi());
                            tmp.setGioThi(it1.getGioThi());
                            tmp.setIDPhong(it1.getPhongThi());
                            tmp.setTenMon(it2.getTenMon());
                            tmp.setNhom(it.getMaNhom());
                            sum += it.getSoSV();
                        }
                    }
                    tmp.setSoSV(sum);
                    res.add(tmp);
                    tmp = new KetQua();
                    break;
                }
            }
        }
        
        Collections.sort(res, new Comparator<KetQua>(){
            @Override
            public int compare(KetQua o1, KetQua o2) {
                if(!o1.getGioThi().equals(o2.getGioThi())){
                    return o1.getGioThi().compareTo(o2.getGioThi());
                }
                return o1.getMaCaThi().compareTo(o2.getMaCaThi());
            }
        });
        
        for(KetQua it : res){
            System.out.println(it);
        }
    }
}
