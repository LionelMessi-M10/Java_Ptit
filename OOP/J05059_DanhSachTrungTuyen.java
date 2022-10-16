/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OOP;

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
public class J05059_DanhSachTrungTuyen {
    
    static class trungTuyen{
        private String ma, ten, xepLoai;
        private float toan, ly, hoa;
        
        public trungTuyen(String ma, String ten, float toan, float ly, float hoa) {
            this.ma = ma;
            this.ten = ten;
            this.toan = toan;
            this.ly = ly;
            this.hoa = hoa;
        }

        public String getMa() {
            return ma;
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
        
        public float diemUuTien(){
            String tmp = ma.substring(0, 3);
            if("KV1".equals(tmp)) return (float) 0.5;
            else if("KV2".equals(tmp)) return (float) 1.0;
            return (float) 2.5;
        }
        
        public float tongDiem(){
            return toan*2 + ly + hoa + diemUuTien();  
        }
        
        public void xepLoai(float n){
            if(tongDiem() >= n) xepLoai = "TRUNG TUYEN";
            else xepLoai = "TRUOT";
        }

        @Override
        public String toString() {
            String ans = "";
            ans += ma + " " + chuanHoaTen() + " ";
            if(diemUuTien() - (int)diemUuTien() == 0){
                ans += String.format("%d", (int)diemUuTien()) + " ";
            }
            else ans += String.format("%.1f", diemUuTien()) + " ";
            
            if(tongDiem() - (int)tongDiem() == 0){
                ans += String.format("%d", (int)tongDiem()) + " ";
            }
            else ans += String.format("%.1f", tongDiem()) + " ";
            
            ans += xepLoai;
            return ans;
        }
    }
    
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(System.in);
        
        ArrayList<trungTuyen> arr = new ArrayList<>();
        
        int n = sc.nextInt();
        for(int i = 1; i <= n; ++i){
            sc.nextLine();
            String ma = sc.nextLine();
            String t = sc.nextLine();
            float d1 = sc.nextFloat();
            float d2 = sc.nextFloat();
            float d3 = sc.nextFloat();
            
            trungTuyen tmp = new trungTuyen(ma, t, d1, d2, d3);
            arr.add(tmp);
        }
        
        int chiTieu = sc.nextInt();
        
        Collections.sort(arr, new Comparator<trungTuyen>(){
            @Override
            public int compare(trungTuyen o1, trungTuyen o2) {
                if(o1.tongDiem() != o2.tongDiem()){
                    if(o2.tongDiem() - o1.tongDiem() > 0) return 1;
                    else return -1;
                }
                return o1.getMa().compareTo(o2.getMa());
            }
        });
        
        float diemChuan = arr.get(chiTieu - 1).tongDiem();
        
        for(trungTuyen it : arr){
            it.xepLoai(diemChuan);
        }
        
        System.out.printf("%.1f\n", diemChuan);
        for(trungTuyen it : arr){
            System.out.println(it);
        }
    }
}
