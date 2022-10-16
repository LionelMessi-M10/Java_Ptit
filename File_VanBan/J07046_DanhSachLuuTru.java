/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package File_VanBan;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ADMIN
 */
public class J07046_DanhSachLuuTru {
    
    static class danhSach{
        private String ma, ten, maphong, ngayDen, ngayDi;

        public danhSach(String ma, String ten, String maphong, String ngayDen, String ngayDi) {
            this.ma = ma;
            this.ten = ten;
            this.maphong = maphong;
            this.ngayDen = ngayDen;
            this.ngayDi = ngayDi;
        }

        public long ngayTro(){
            long ans = 0;
            
            SimpleDateFormat date = new SimpleDateFormat("dd/MM/yyyy");
            
            try {
                Date d1 = date.parse(ngayDen);
                Date d2 = date.parse(ngayDi);
                
                long den = d1.getTime();
                long di = d2.getTime();
                
                ans = Math.abs(den - di) / (24 * 60 * 60 * 1000);
            } catch (ParseException ex) {
                Logger.getLogger(J07046_DanhSachLuuTru.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            
            return ans;
        }

        @Override
        public String toString() {
            return ma + " " + ten + " " + maphong + " " + ngayTro();
        }
    }
    
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("KHACH.in"));
        
        ArrayList<danhSach> arr = new ArrayList<>();
        
        int n = sc.nextInt();
        sc.nextLine();
        for(int i = 1; i <= n; ++i){
            String m = String.format("KH%02d", i);
            String ten = sc.nextLine();
            String mphong = sc.nextLine();
            String nden = sc.nextLine();
            String ndi = sc.nextLine();
            
            danhSach tmp = new danhSach(m, ten, mphong, nden, ndi);
            arr.add(tmp);
        }
        
        Collections.sort(arr, new Comparator<danhSach>(){
            @Override
            public int compare(danhSach o1, danhSach o2) {
                if(o2.ngayTro() - o1.ngayTro() > 0) return 1;
                return -1;
            }
        });
        
        for(danhSach it : arr){
            System.out.println(it);
        }
    }
}
