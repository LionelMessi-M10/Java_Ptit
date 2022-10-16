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
B20DCCN999
Nguyen Van An
D20CQCN04-B
10.0
9.0
8.0
B20DCAT001
Le Van Nam
D20CQAT02-B
6.0
6.0
4.0
B20DCCN111
Tran Hoa Binh
D20CQCN04-B
9.0
5.0
6.0
 * @author ADMIN
 */
public class J05030_BangDiemThanhPhan_1 {
    static class bangDiem{
        private String ma, ten, lop;
        private float diem1, diem2, diem3;

        public String getMa() {
            return ma;
        }
        
        public bangDiem(String ma, String ten, String lop, float diem1, float diem2, float diem3) {
            this.ma = ma;
            this.ten = ten;
            this.lop = lop;
            this.diem1 = diem1;
            this.diem2 = diem2;
            this.diem3 = diem3;
        }

        @Override
        public String toString() {
            return ma + " " + ten + " " + lop + " " + String.format("%.1f %.1f %.1f", diem1, diem2, diem3);
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        ArrayList<bangDiem> arr = new ArrayList<>();
        
        int n = sc.nextInt();
        for(int i = 1; i <= n; ++i){
            sc.nextLine();
            String m = sc.nextLine();
            String t = sc.nextLine();
            String l = sc.nextLine();
            float d1 = sc.nextFloat();
            float d2 = sc.nextFloat();
            float d3 = sc.nextFloat();
            
            bangDiem tmp = new bangDiem(m, t, l, d1, d2, d3);
            arr.add(tmp);
        }
        
        Collections.sort(arr, new Comparator<bangDiem>(){
            @Override
            public int compare(bangDiem o1, bangDiem o2) {
                return o1.getMa().compareTo(o2.getMa());
            }
        });
        
        for(int i = 0; i < arr.size(); ++i){
            System.out.println((i + 1) + " " + arr.get(i));
        }
    }
}
