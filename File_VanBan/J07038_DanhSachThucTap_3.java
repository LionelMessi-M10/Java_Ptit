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
public class J07038_DanhSachThucTap_3 {
    
    static class sinhVien{
        private String maSV, tenSV, lop, mail;

        public sinhVien(String maSV, String tenSV, String lop, String mail) {
            this.maSV = maSV;
            this.tenSV = tenSV;
            this.lop = lop;
            this.mail = mail;
        }

        public String getMaSV() {
            return maSV;
        }

        public String getTenSV() {
            return tenSV;
        }

        public String getLop() {
            return lop;
        }

        public String getMail() {
            return mail;
        }
    }
    
    static class doanhNghiep{
        private String maDN, tenDN;
        private int soSV;

        public doanhNghiep(String maDN, String tenDN, int soSV) {
            this.maDN = maDN;
            this.tenDN = tenDN;
            this.soSV = soSV;
        }

        public String getMaDN() {
            return maDN;
        }

        public String getTenDN() {
            return tenDN;
        }

        public int getSoSV() {
            return soSV;
        }

        public void setSoSV(int soSV) {
            this.soSV = soSV;
        }
    }
    
    static class thucTap{
        private String maSV, maDN;

        public thucTap(String maSV, String maDN) {
            this.maSV = maSV;
            this.maDN = maDN;
        }

        public String getMaSV() {
            return maSV;
        }

        public String getMaDN() {
            return maDN;
        }
    }
    
    static class dangKy{
        private String ma, ten, lop;
        private String maDN;

        public String getMaDN() {
            return maDN;
        }

        public void setMaDN(String maDN) {
            this.maDN = maDN;
        }

        public dangKy() {
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

        public void setMa(String ma) {
            this.ma = ma;
        }

        public void setTen(String ten) {
            this.ten = ten;
        }

        public void setLop(String lop) {
            this.lop = lop;
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
    
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc1 = new Scanner(new File("SINHVIEN.in"));
        Scanner sc2 = new Scanner(new File("DN.in"));
        Scanner sc3 = new Scanner(new File("THUCTAP.in"));
    
        ArrayList<sinhVien> list1 = new ArrayList<>();
        ArrayList<doanhNghiep> list2 = new ArrayList<>();
        ArrayList<thucTap> list3 = new ArrayList<>();
        
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
            int soSinhVien = sc2.nextInt();
            
            doanhNghiep tmp = new doanhNghiep(ma, ten, soSinhVien);
            list2.add(tmp);
        }
        
        int k = sc3.nextInt();
        for(int i = 1; i <= k; ++i){
            String maSV = sc3.next();
            String tenDN = sc3.next();
            
            thucTap tmp = new thucTap(maSV, tenDN);
            list3.add(tmp);
        }
        
        Collections.sort(list1, new Comparator<sinhVien>(){
            @Override
            public int compare(sinhVien o1, sinhVien o2) {
                return o1.getMaSV().compareTo(o2.getMaSV());
            }
        });
        
        // Ưu tiên lấy theo mã sinh viên thì cần sort theo mã sinh viên ở đây.
        Collections.sort(list3, new Comparator<thucTap>(){
            @Override
            public int compare(thucTap o1, thucTap o2) {
                return o1.getMaSV().compareTo(o2.getMaSV());
            }
        });
        
        ArrayList<dangKy> res = new ArrayList<>();
        
        for(thucTap it : list3){
            dangKy tmp = new dangKy();
            for(sinhVien it1 : list1){
                if(it1.getMaSV().equals(it.getMaSV())){
                    tmp.setTen(it1.getTenSV());
                    tmp.setMa(it1.getMaSV());
                    tmp.setLop(it1.getLop());
                }
            }
            
            for(doanhNghiep it3 : list2){
                if(it3.getMaDN().equals(it.getMaDN()) && it3.getSoSV() > 0){
                    tmp.setMaDN(it3.getMaDN());
                    int cnt = it3.getSoSV();
                    --cnt;
                    it3.setSoSV(cnt);
                    res.add(tmp);
                    tmp = new dangKy();
                    break;
                }
            }
        }
        
        Collections.sort(res, new Comparator<dangKy>(){
            @Override
            public int compare(dangKy o1, dangKy o2) {
                return o1.getMa().compareTo(o2.getMa());
            } 
        });
        
        int q = sc3.nextInt();
        sc3.nextLine();
        while(q-- > 0){
            String check = sc3.nextLine();
            
            for(doanhNghiep it : list2){
                if(it.getMaDN().equals(check)){
                    System.out.println("DANH SACH THUC TAP TAI " + it.getTenDN() + ":");
                }
            }
            
            for(dangKy it : res){
                if(it.getMaDN().equals(check)){
                    System.out.println(it);
                }
            }
        }
    }
}
