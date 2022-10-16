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
2
Ao phong tre em
Cai
25000
41000
Ao khoac nam
Cai
240000
515000
 * @author ADMIN
 */
public class J05081_DanhSachMatHang {
    static class MatHang{
        private String ma, ten, donVi;
        private int giaMua, giaBan;

        public String getMa() {
            return ma;
        }

        public String getTen() {
            return ten;
        }

        public String getDonVi() {
            return donVi;
        }

        public int getGiaMua() {
            return giaMua;
        }

        public int getGiaBan() {
            return giaBan;
        }

        public MatHang(String ma, String ten, String donVi, int giaMua, int giaBan) {
            this.ma = ma;
            this.ten = ten;
            this.donVi = donVi;
            this.giaMua = giaMua;
            this.giaBan = giaBan;
        }

        @Override
        public String toString() {
            return ma + " " + ten + " " + donVi + " " + giaMua + " " + giaBan + " " + (giaBan - giaMua);
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        ArrayList<MatHang> arr = new ArrayList<>();
        
        int n = sc.nextInt();
        for(int i = 1; i <= n; ++i){
            sc.nextLine();
            String m = "MH" + String.format("%03d", i);
            String t = sc.nextLine();
            String dv = sc.nextLine();
            int mua = sc.nextInt();
            int ban = sc.nextInt();
            MatHang tmp = new MatHang(m, t, dv, mua, ban);
            arr.add(tmp);
        }
        
        Collections.sort(arr, new Comparator<MatHang>(){
            @Override
            public int compare(MatHang o1, MatHang o2) {
                return (o2.getGiaBan() - o2.getGiaMua()) - (o1.getGiaBan() - o1.getGiaMua());
            }
        });
        
        for(MatHang it : arr){
            System.out.println(it);
        }
    }
}
