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
Nguyen Thai Binh
45
75
Le Cong Hoa
4
4.5
Phan Van Duc
56
56
 * @author ADMIN
 */
public class J05013_TuyenDung {
    
    static class tuyenDung{
        private String ma, ten;
        private float lyThuyet, thucHanh;

        public tuyenDung(String ma, String ten, float lyThuyet, float thucHanh) {
            this.ma = ma;
            this.ten = ten;
            this.lyThuyet = lyThuyet;
            this.thucHanh = thucHanh;
        }
        
        public float doi(float n){
            if(n > 10 && n < 100){
                return (float) (1.0 * n / 10);
            }
            else if(n == 10) return 10;
            return n;
        }
        
        public float diemTB(){
            return (doi(lyThuyet) + doi(thucHanh)) / 2;
        }
        
        public String xepLoai(){
            if(diemTB() < 5) return "TRUOT";
            else if(diemTB() >= 5 && diemTB() < 8){
                return "CAN NHAC";
            }
            else if(diemTB() >= 8 && diemTB() < 9.5){
                return "DAT";
            }
            return "XUAT SAC";
        }

        @Override
        public String toString() {
            return ma + " " + ten + " " + String.format("%.2f", diemTB()) + " " + xepLoai();
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        ArrayList<tuyenDung> arr = new ArrayList<>();
        
        int n = sc.nextInt();
        for(int i = 1; i <= n; ++i){
            String ma = String.format("TS%02d", i);
            sc.nextLine();
            String t = sc.nextLine();
            float lt = sc.nextFloat();
            float th = sc.nextFloat();
            
            tuyenDung tmp = new tuyenDung(ma, t, lt, th);
            arr.add(tmp);
        }
        
        Collections.sort(arr, new Comparator<tuyenDung>(){
            @Override
            public int compare(tuyenDung o1, tuyenDung o2) {
                if(o2.diemTB() - o1.diemTB() > 0){
                    return 1;
                }
                return -1;
            }
        });
        
        for(tuyenDung it : arr){
            System.out.println(it);
        }
    }
}
