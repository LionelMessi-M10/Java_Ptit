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
public class J07057_DiemTuyenSinh {
    
    static class tuyenSinh{
        private String ma, ten;
        private float diemThi;
        private String danToc, khuVuc;

        public tuyenSinh(String ma, String ten, float diemThi, String danToc, String khuVuc) {
            this.ma = ma;
            this.ten = ten;
            this.diemThi = diemThi;
            this.danToc = danToc;
            this.khuVuc = khuVuc;
        }

        public String getMa() {
            return ma;
        }
        
        public float Uutien1(){
            float ans = 0;
            if("1".equals(khuVuc)) ans = (float) 1.5;
            else if("2".equals(khuVuc)) ans = 1;
            else if("3".equals(khuVuc)) ans = 0;
            return ans;
        }
        
        public float Uutien2(){
            if("Kinh".equals(danToc)){
                return 0;
            }
            return (float) 1.5;
        }
        
        public float tongDiem(){
            return (float) (1.0 * diemThi + 1.0 * Uutien1() + 1.0 * Uutien2());
        }
        
        public String xepLoai(){
            if(tongDiem() >= 20.5){
                return "Do";
            }
            return "Truot";
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
            return ma + " " + chuanHoaTen() + " " + String.format("%.1f", tongDiem())
                    + " " + xepLoai();
        }
    }
    
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("THISINH.in"));
        
        ArrayList<tuyenSinh> arr = new ArrayList<>();
        
        int n = sc.nextInt();
        sc.nextLine();
        for(int i = 1; i <= n; ++i){
            String m = String.format("TS%02d", i);
            String t = sc.nextLine();
            float diem = sc.nextFloat();
            sc.nextLine();
            String dt = sc.nextLine();
            String kv = sc.nextLine();
            
            tuyenSinh tmp = new tuyenSinh(m, t, diem, dt, kv);
            arr.add(tmp);
        }
        
        Collections.sort(arr, new Comparator<tuyenSinh>(){
            @Override
            public int compare(tuyenSinh o1, tuyenSinh o2) {
                if(o1.tongDiem() != o2.tongDiem()){
                    if(o2.tongDiem() - o1.tongDiem() > 0){
                        return 1;
                    }
                    else return -1;
                }
                return o1.getMa().compareTo(o2.getMa());
            }
        });
        
        for(tuyenSinh it : arr){
            System.out.println(it);
        }
    }
}
