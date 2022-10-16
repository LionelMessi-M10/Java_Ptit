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
public class J07054_TinhDiemTrungBinh {
    
    static class tinhDiem{
        private String ma, ten;
        private int diem1, diem2, diem3, xepHang;

        public String getMa() {
            return ma;
        }

        public int getXepHang() {
            return xepHang;
        }

        public void setXepHang(int xepHang) {
            this.xepHang = xepHang;
        }

        public tinhDiem(String ma, String ten, int diem1, int diem2, int diem3) {
            this.ma = ma;
            this.ten = ten;
            this.diem1 = diem1;
            this.diem2 = diem2;
            this.diem3 = diem3;
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
        
        public float tongDiem(){
            return (float) (1.0 * (diem1*3 + diem2*3 + diem3*2) / 8);
        }

        @Override
        public String toString() {
            return ma + " " + chuanHoaTen() + " " + String.format("%.2f", tongDiem()) + " " + xepHang;
        }
    }
    
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("BANGDIEM.in"));
        
        ArrayList<tinhDiem> arr = new ArrayList<>();
        
        int n = sc.nextInt();
        for(int i = 1; i <= n; ++i){
            String ma = String.format("SV%02d", i);
            sc.nextLine();
            String ten = sc.nextLine();
            int d1 = sc.nextInt();
            int d2 = sc.nextInt();
            int d3 = sc.nextInt();
            
            tinhDiem tmp = new tinhDiem(ma, ten, d1, d2, d3);
            arr.add(tmp);
        }
        
        Collections.sort(arr, new Comparator<tinhDiem>(){
            @Override
            public int compare(tinhDiem o1, tinhDiem o2) {
                if(o2.tongDiem() - o1.tongDiem() > 0) return 1;
                return -1;
            }
        });
        
        int cnt = 1;
        int bac = 0;
        
        for(int i = 0; i < arr.size() - 1; ++i){
            if(arr.get(i).tongDiem() == arr.get(i + 1).tongDiem()){
                arr.get(i).setXepHang(cnt);
                arr.get(i + 1).setXepHang(cnt);
                ++bac;
            }
            else{
                arr.get(i).setXepHang(cnt);
                cnt += bac;
                bac = 0;
                arr.get(i + 1).setXepHang(cnt + 1);
                ++cnt;
            }
        }
        
        Collections.sort(arr, new Comparator<tinhDiem>(){
            @Override
            public int compare(tinhDiem o1, tinhDiem o2) {
                if(o1.getXepHang() != o2.getXepHang()){
                    return o1.getXepHang() - o2.getXepHang();
                }
                return o1.getMa().compareTo(o2.getMa());
            }
        });
        
        for(tinhDiem it : arr){
            System.out.println(it);
        }
    }
}
