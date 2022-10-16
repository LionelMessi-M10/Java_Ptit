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
public class J07074_LichGiangDayTheoMonHoc {
    static class monHoc{
        private String maMonHoc, tenMonHoc;
        private int soTinChi;

        public String getMaMonHoc() {
            return maMonHoc;
        }

        public String getTenMonHoc() {
            return tenMonHoc;
        }

        public monHoc(String maMonHoc, String tenMonHoc, int soTinChi) {
            this.maMonHoc = maMonHoc;
            this.tenMonHoc = tenMonHoc;
            this.soTinChi = soTinChi;
        }
    }
    
    static class LichHoc{
        private String maNhom, maMon;
        private int ngayGiang, kipHoc;
        private String tenGV, phongHoc;

        public String getMaMon() {
            return maMon;
        }
        
        public int getKipHoc() {
            return kipHoc;
        }

        public int getNgayGiang() {
            return ngayGiang;
        }

        public String getTenGV() {
            return tenGV;
        }

        public LichHoc(String maNhom, String maMon, int ngayGiang, int kipHoc, String tenGV, String phongHoc) {
            this.maNhom = maNhom;
            this.maMon = maMon;
            this.ngayGiang = ngayGiang;
            this.kipHoc = kipHoc;
            this.tenGV = tenGV;
            this.phongHoc = phongHoc;
        }

        @Override
        public String toString() {
            return maNhom + " " + ngayGiang + " " + kipHoc + " " + tenGV + " " + phongHoc;
        }
    }
    
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc1 = new Scanner(new File("MONHOC.in"));
        Scanner sc2 = new Scanner(new File("LICHGD.in"));
        
        ArrayList<monHoc> arr1 = new ArrayList<>();
        ArrayList<LichHoc> arr2 = new ArrayList<>();
        
        int n = sc1.nextInt();
        for(int i = 1; i <= n; ++i){
            sc1.nextLine();
            String ma = sc1.nextLine();
            String ten = sc1.nextLine();
            int tc = sc1.nextInt();
            
            monHoc tmp = new monHoc(ma, ten, tc);
            arr1.add(tmp);
        }
        
        int m = sc2.nextInt();
        sc2.nextLine();
        for(int i = 1; i <= m; ++i){
            String ma = String.format("HP%03d", i);
            String mamon = sc2.nextLine();
            int thu = sc2.nextInt();
            int kip = sc2.nextInt();
            sc2.nextLine();
            String ten = sc2.nextLine();
            String phong = sc2.nextLine();
            
            LichHoc tmp = new LichHoc(ma, mamon, thu, kip, ten, phong);
            arr2.add(tmp);
        }
        
        Collections.sort(arr2, new Comparator<LichHoc>(){
            @Override
            public int compare(LichHoc o1, LichHoc o2) {
                if(o1.getNgayGiang() != o2.getNgayGiang()){
                    return o1.getNgayGiang() - o2.getNgayGiang();
                }
                else{
                    if(o1.getKipHoc() != o2.getKipHoc()){
                        return o1.getKipHoc() - o2.getKipHoc();
                    }
                }
                return o1.getTenGV().compareTo(o2.getTenGV());
            }
        });
        
        String check = sc2.next();
        for(monHoc it : arr1){
            if(check.equals(it.getMaMonHoc())){
                System.out.println("LICH GIANG DAY MON " + it.getTenMonHoc() + ":");
                break;
            }
        }
        
        for(LichHoc it : arr2){
            if(check.equals(it.getMaMon())){
                System.out.println(it);
            }
        }
    }
}
