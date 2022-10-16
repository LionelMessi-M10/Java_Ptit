/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OOP;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
3
Tran Minh Hieu
5.9
Nguyen Bao Trung
8.6
Le Hong Ha
9.2
 * @author ADMIN
 */
public class J05054_XepHangHocSinh {
    static class xepHang{
        private String ma, ten;
        private double diemTB;
        private int xepHang;

        public String getMa() {
            return ma;
        }

        public double getDiemTB() {
            return diemTB;
        }

        public void setXepHang(int xepHang) {
            this.xepHang = xepHang;
        }

        public xepHang(String ma, String ten, double diemTB) {
            this.ma = ma;
            this.ten = ten;
            this.diemTB = diemTB;
        }
        
        public String xepLoai(){
            if(diemTB < 5) return "Yeu";
            else if(diemTB >= 5 && diemTB < 7){
                return "Trung Binh";
            }
            else if(diemTB >= 7 && diemTB < 9){
                return "Kha";
            }
            return "Gioi";
        }

        @Override
        public String toString() {
            return ma + " " + ten + " " + String.format("%.1f", diemTB) + " " + xepLoai() + " " + xepHang;
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        ArrayList<xepHang> arr = new ArrayList<>();
        
        int n = sc.nextInt();
        for(int i = 1; i <= n; ++i){
            String m = String.format("HS%02d", i);
            sc.nextLine();
            String t = sc.nextLine();
            double diem = sc.nextDouble();
            
            xepHang tmp = new xepHang(m, t, diem);
            arr.add(tmp);
        }
        
        // Sort diem tang dan.
        Collections.sort(arr, new Comparator<xepHang>(){
            @Override
            public int compare(xepHang o1, xepHang o2) {
                if(o1.getDiemTB() - o2.getDiemTB() > 0){
                    return -1;
                }
                return 1;
            }
        });
        
        
        int thuTu = 1;
        int cnt = 0;
        for(int i = 0; i < arr.size() - 1; ++i){
            if(arr.get(i).getDiemTB() == arr.get(i + 1).getDiemTB()){
                ++cnt;
                arr.get(i).setXepHang(thuTu);
                arr.get(i + 1).setXepHang(thuTu);
            }
            else{
                arr.get(i).setXepHang(thuTu);
                thuTu += cnt;
                arr.get(i + 1).setXepHang(thuTu + 1);
                ++thuTu;
                cnt = 0;
            }
        }
        
        Collections.sort(arr, new Comparator<xepHang>(){
            @Override
            public int compare(xepHang o1, xepHang o2) {
                return o1.getMa().compareTo(o2.getMa());
            }
        });
        
        for(xepHang it : arr){
            System.out.println(it);
        }
    }
}
