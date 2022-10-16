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
public class J07036_BangDiemTheoLop {
    
    
    static class sinhVien{
        private String ma, ten, lop, mail;

        public sinhVien(String ma, String ten, String lop, String mail) {
            this.ma = ma;
            this.ten = ten;
            this.lop = lop;
            this.mail = mail;
        }

        public String getMa() {
            return ma;
        }

        public String getTen() {
            return ten;
        }

        public String getLop() {
            return lop;
        }

        public String getMail() {
            return mail;
        }
        
        public String chuanTen(){
            String[] a = ten.trim().split("\\s+");
            String ans = "";
            for(int i = 0; i < a.length; ++i){
                ans += Character.toUpperCase(a[i].charAt(0));
                ans += a[i].substring(1).toLowerCase();
                ans += " ";
            }
            return ans.trim();
        }

        @Override
        public String toString() {
            return ma + " " + chuanTen() + " " + lop;
        }
    }
    
    static class monHoc{
        private String ma, ten;
        private int soTin;

        public monHoc(String ma, String ten, int soTin) {
            this.ma = ma;
            this.ten = ten;
            this.soTin = soTin;
        }

        public String getMa() {
            return ma;
        }

        public String getTen() {
            return ten;
        }

        public int getSoTin() {
            return soTin;
        }
    }
    
    static class bangDiem{
        private String maSV, maMon;
        private float diem;

        public bangDiem(String maSV, String maMon, float diem) {
            this.maSV = maSV;
            this.maMon = maMon;
            this.diem = diem;
        }

        public String getMaSV() {
            return maSV;
        }

        public String getMaMon() {
            return maMon;
        }

        public float getDiem() {
            return diem;
        }

        @Override
        public String toString() {
            if(diem - (int)diem == 0){
                return String.format("%d", (int)diem);
            }
            return String.format("%.1f", diem);
        }
    }
    
    static class ketQua{
        private String ma, ten, maMon, monHoc;
        private float diemThi;

        public ketQua() {
        }

        public void setMa(String ma) {
            this.ma = ma;
        }

        public void setTen(String ten) {
            this.ten = ten;
        }

        public void setMaMon(String maMon) {
            this.maMon = maMon;
        }

        public void setMonHoc(String monHoc) {
            this.monHoc = monHoc;
        }

        public void setDiem(float diemThi) {
            this.diemThi = diemThi;
        }

        public String getMa() {
            return ma;
        }

        public float getDiemThi() {
            return diemThi;
        }

        public String getMaMon() {
            return maMon;
        }

        @Override
        public String toString() {
            String ans = ma + " " + ten + " " + maMon + " " + monHoc + " ";
            if(diemThi - (int)diemThi == 0){
                ans += String.format("%d", (int)diemThi);
            }
            else ans += String.format("%.1f", diemThi);
            return ans;
        }
    }
    
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc1 = new Scanner(new File("SINHVIEN.in"));
        Scanner sc2 = new Scanner(new File("MONHOC.in"));
        Scanner sc3 = new Scanner(new File("BANGDIEM.in"));
        
        ArrayList<sinhVien> list1 = new ArrayList<>();
        ArrayList<monHoc> list2 = new ArrayList<>();
        ArrayList<bangDiem> list3 = new ArrayList<>();
        
        int n = sc1.nextInt();
        sc1.nextLine();
        for(int i = 1; i <= n; ++i){
            String ma = sc1.nextLine();
            String ten = sc1.nextLine();
            String lop = sc1.nextLine();
            String mail = sc1.nextLine();
            
            sinhVien tmp = new sinhVien(ma, ten, lop, mail);
            list1.add(tmp);
        }
        
        int m = sc2.nextInt();
        
        for(int i = 1; i <= m; ++i){
            sc2.nextLine();
            String ma = sc2.nextLine();
            String ten = sc2.nextLine();
            int tc = sc2.nextInt();
            
            monHoc tmp = new monHoc(ma, ten, tc);
            list2.add(tmp);
        }
        
        int k = sc3.nextInt();
        
        for(int i = 1; i <= k; ++i){
            String maSV = sc3.next();
            String maMon = sc3.next();
            float diem = sc3.nextFloat();
            
            bangDiem tmp = new bangDiem(maSV, maMon, diem);
            list3.add(tmp);
        }
        
        int test = sc3.nextInt();
        while(test-- > 0){
            String checkLop = sc3.next();
            
            System.out.println("BANG DIEM lop " + checkLop + ":");
            
            ArrayList<ketQua> res = new ArrayList<>();
            
            // Trong sinh vien.
            for(sinhVien it : list1){
                ketQua tmp = new ketQua();
                if(it.getLop().equals(checkLop)){
                    for(bangDiem it1 : list3){
                        if(it1.getMaSV().equals(it.getMa())){
                            for(monHoc it2 : list2){
                                if(it2.getMa().equals(it1.getMaMon())){
                                    tmp.setMa(it.getMa());
                                    tmp.setTen(it.chuanTen());
                                    tmp.setMaMon(it1.getMaMon());
                                    tmp.setMonHoc(it2.getTen());
                                    tmp.setDiem(it1.getDiem());
                                    res.add(tmp);
                                    tmp = new ketQua();
                                }
                            }
                        }
                    }
                }
            }
            
            Collections.sort(res, new Comparator<ketQua>(){
                @Override
                public int compare(ketQua o1, ketQua o2) {
                    if(!o1.getMaMon().equals(o2.getMaMon())){
                        return o1.getMaMon().compareTo(o2.getMaMon());
                    }
                    return o1.getMa().compareTo(o2.getMa());
                }
            });
            
            for(ketQua it : res){
                System.out.println(it);
            }
        }
    }
}
