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
public class J07073_DangKyHinhThucGiangDay {
    
    static class DangKy{
        private String ma, ten;
        private int soTinChi;
        private String dayLyThuyet, dayThucHanh;

        public DangKy(String ma, String ten, int soTinChi, String dayLyThuyet, String dayThucHanh) {
            this.ma = ma;
            this.ten = ten;
            this.soTinChi = soTinChi;
            this.dayLyThuyet = dayLyThuyet;
            this.dayThucHanh = dayThucHanh;
        }

        public String getMa() {
            return ma;
        }

        public String getDayThucHanh() {
            return dayThucHanh;
        }

        @Override
        public String toString() {
            return ma + " " + ten + " " + soTinChi + " " + dayLyThuyet + " " + dayThucHanh;
        }
    }
    
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("MONHOC.in"));
        
        ArrayList<DangKy> arr = new ArrayList<>();
        
        int n = sc.nextInt();
        sc.nextLine();
        
        for(int i = 1; i <= n; ++i){
            String m = sc.nextLine();
            String t = sc.nextLine();
            int tc = sc.nextInt();
            sc.nextLine();
            String lyThuyet = sc.nextLine();
            String thucHanh = sc.nextLine();
            
            DangKy tmp = new DangKy(m, t, tc, lyThuyet, thucHanh);
            if(tmp.getDayThucHanh().equals("Truc tuyen") || tmp.getDayThucHanh().contains(".ptit.edu.vn")){
                arr.add(tmp);
            }
            
        }
        
        Collections.sort(arr, new Comparator<DangKy>(){
            @Override
            public int compare(DangKy o1, DangKy o2) {
                return o1.getMa().compareTo(o2.getMa());
            }
        });
        
        for(DangKy it : arr){
            System.out.println(it);
        }
    }
}
