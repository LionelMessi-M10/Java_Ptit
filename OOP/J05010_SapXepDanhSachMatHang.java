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
May tinh SONY VAIO
Dien tu
16400
17699
Tu lanh Side by Side
Dien lanh
18300
25999
Banh Chocopie
Tieu dung
27.5
37
 * @author ADMIN
 */
public class J05010_SapXepDanhSachMatHang {
    static class matHang{
        private String ma, ten, nhom;
        private double giaMua, giaBan;
        
        public double loiNhuan(){
            return this.giaBan - this.giaMua;
        }

        public matHang(String ma, String ten, String nhom, double giaMua, double giaBan) {
            this.ma = ma;
            this.ten = ten;
            this.nhom = nhom;
            this.giaMua = giaMua;
            this.giaBan = giaBan;
        }

        @Override
        public String toString() {
            return ma + " " + ten + " " + nhom + " " + String.format("%.2f", giaBan - giaMua);
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        ArrayList<matHang> arr = new ArrayList<>();
        
        int n = sc.nextInt();
        
        for(int i = 1; i <= n; ++i){
            sc.nextLine();
            String m = Integer.toString(i);
            String t = sc.nextLine();
            String nh = sc.nextLine();
            double mua = sc.nextDouble();
            double ban = sc.nextDouble();
            matHang tmp = new matHang(m, t, nh, mua, ban);
            arr.add(tmp);
        }
        
        Collections.sort(arr, new Comparator<matHang>(){
            @Override
            public int compare(matHang o1, matHang o2) {
                if(o2.loiNhuan() - o1.loiNhuan() > 0){
                    return 1;
                }
                return -1;
            }
        });
        
        for(matHang it : arr){
            System.out.println(it);
        }
    }
}
