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
public class J07051_TinhTienPhong {
    
    static class tienPhong{
        private String ma, ten, soPhong, ngayNhan, ngayTra;
        private int tienDichVu;

        public tienPhong(String ma, String ten, String soPhong, String ngayNhan, String ngayTra, int tienDichVu) {
            this.ma = ma;
            this.ten = ten;
            this.soPhong = soPhong;
            this.ngayNhan = ngayNhan;
            this.ngayTra = ngayTra;
            this.tienDichVu = tienDichVu;
        }
        
        public int donGia(){
            if(soPhong.charAt(0) == '1') return 25;
            else if(soPhong.charAt(0) == '2') return 34;
            else if(soPhong.charAt(0) == '3') return 50;
            return 80;
        }
        
        public long soNgayO(){
            long ans = 0;
            
            SimpleDateFormat date = new SimpleDateFormat("dd/MM/yyyy");
            
            try {
                Date d1 = date.parse(ngayNhan);
                Date d2 = date.parse(ngayTra);
                
                long nhan = d1.getTime();
                long tra = d2.getTime();
                
                ans = Math.abs(nhan - tra)/(24 * 60 * 60 * 1000);
            } catch (ParseException ex) {
                Logger.getLogger(J07051_TinhTienPhong.class.getName()).log(Level.SEVERE, null, ex);
            }
            return ans + 1;
        }
        
        public long thanhTien(){
            return donGia() * soNgayO() + tienDichVu;
        }
        
        public String chuanHoaTen(){
            String ans = "";
            ten = ten.trim();
            String[] a = ten.split("\\s+");
            
            for(int i = 0; i < a.length; ++i){
                ans += Character.toUpperCase(a[i].charAt(0));
                ans += a[i].substring(1).toLowerCase();
                ans += " ";
            }
            return ans.trim();
        }

        @Override
        public String toString() {
            return ma + " " + chuanHoaTen() + " " + soPhong.trim() + " " + soNgayO() + " " + thanhTien();
        }
    }
    
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("KHACHHANG.in"));
        
        ArrayList<tienPhong> arr = new ArrayList<>();
        
        int n = sc.nextInt();
        for(int i = 1; i <= n; ++i){
            String ma = String.format("KH%02d", i);
            sc.nextLine();
            String ten = sc.nextLine();
            String sp = sc.nextLine();
            String nhan = sc.nextLine();
            String tra = sc.nextLine();
            int tienDV = sc.nextInt();
            
            tienPhong tmp = new tienPhong(ma, ten, sp, nhan, tra, tienDV);
            arr.add(tmp);
        }
        
        Collections.sort(arr, new Comparator<tienPhong>(){
            @Override
            public int compare(tienPhong o1, tienPhong o2) {
                if(o2.thanhTien() - o1.thanhTien() > 0){
                    return 1;
                }
                return -1;
            }
        });
        
        for(tienPhong it : arr){
            System.out.println(it);
        }
    }
}
