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
public class J07027_QuanLyBaiTapNhom {
    
    static class sinhVien{
        private String ma, ten, sdt;

        public sinhVien(String ma, String ten, String sdt) {
            this.ma = ma;
            this.ten = ten;
            this.sdt = sdt;
        }

        public String getMa() {
            return ma;
        }

        public String getTen() {
            return ten;
        }

        public String getSdt() {
            return sdt;
        }

        @Override
        public String toString() {
            return ma + " " + ten + " " + sdt + " ";
        }
    }
    
    static class baiTap{
        private String tenBai;

        public baiTap(String tenBai) {
            this.tenBai = tenBai;
        }

        public String getTenBai() {
            return tenBai;
        }

        @Override
        public String toString() {
            return tenBai;
        }
    }
    
    static class Nhom{
        private String maSV;
        private int thuTu;

        public Nhom(String maSV, int thuTu) {
            this.maSV = maSV;
            this.thuTu = thuTu;
        }

        public String getMaSV() {
            return maSV;
        }

        public int getThuTu() {
            return thuTu;
        }
    }
    
    static class ketQua{
        private String ma, ten, sdt;
        private int stt;
        private String tenBai;

        public ketQua() {
        }

        public String getMa() {
            return ma;
        }

        public void setMa(String ma) {
            this.ma = ma;
        }

        public void setTen(String ten) {
            this.ten = ten;
        }

        public void setSdt(String sdt) {
            this.sdt = sdt;
        }

        public void setStt(int stt) {
            this.stt = stt;
        }

        public void setTenBai(String tenBai) {
            this.tenBai = tenBai;
        }

        @Override
        public String toString() {
            return ma + " " + ten + " " + sdt + " " + stt + " " + tenBai;
        }
    }
    
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc1 = new Scanner(new File("SINHVIEN.in"));
        Scanner sc2 = new Scanner(new File("BAITAP.in"));
        Scanner sc3 = new Scanner(new File("NHOM.in"));
    
        ArrayList<sinhVien> list1 = new ArrayList<>();
        ArrayList<baiTap> list2 = new ArrayList<>();
        
        int n = sc1.nextInt();
        sc1.nextLine();
        for(int i = 1; i <= n; ++i){
            String m = sc1.nextLine();
            String t = sc1.nextLine();
            String so = sc1.nextLine();
            
            sinhVien tmp = new sinhVien(m, t, so);
            list1.add(tmp);
        }
        
        int m = sc2.nextInt();
        sc2.nextLine();
        for(int i = 1; i <= m; ++i){
            String t = sc2.nextLine();
            baiTap tmp = new baiTap(t);
            
            list2.add(tmp);
        }
        
        ArrayList<ketQua> res = new ArrayList<>();
        
        while(sc3.hasNext()){
            String ma = sc3.next();
            int tt = sc3.nextInt();
            
            ketQua tmp = new ketQua();
            
            for(sinhVien it : list1){
                if(ma.equals(it.getMa())){
                    tmp.setMa(it.getMa());
                    tmp.setTen(it.getTen());
                    tmp.setSdt(it.getSdt());
                    break;
                }
            }
            
            tmp.setStt(tt);
            
            for(int i = 0; i < list2.size(); ++i){
                tmp.setTenBai(list2.get(tt - 1).getTenBai());
                break;
            }
            
            res.add(tmp);
        }
        
        Collections.sort(res, new Comparator<ketQua>(){
            @Override
            public int compare(ketQua o1, ketQua o2) {
                return o1.getMa().compareTo(o2.getMa());
            }
        });
        
        for(ketQua it : res){
            System.out.println(it);
        }
    }
}
