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
public class J07034_DanhSachMonHoc {
    
    static class MonHoc{
        private String ma, ten;
        private int soTinChi;

        public MonHoc(String ma, String ten, int soTinChi) {
            this.ma = ma;
            this.ten = ten;
            this.soTinChi = soTinChi;
        }

        public String getTen() {
            return ten;
        }        

        @Override
        public String toString() {
            return ma + " " + ten + " " + soTinChi;
        }
    }
    
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("MONHOC.in"));
        
        ArrayList<MonHoc> arr = new ArrayList<>();
        
        int n = sc.nextInt();
        for(int i = 1; i <= n; ++i){
            sc.nextLine();
            String ma = sc.nextLine();
            String ten = sc.nextLine();
            int tc = sc.nextInt();
            
            MonHoc tmp = new MonHoc(ma, ten, tc);
            arr.add(tmp);
        }
        
        Collections.sort(arr, new Comparator<MonHoc>(){
            @Override
            public int compare(MonHoc o1, MonHoc o2) {
                return o1.getTen().compareTo(o2.getTen());
            }
        });
        
        for(MonHoc it : arr){
            System.out.println(it);
        }
    }
}
