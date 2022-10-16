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
Nguyen Van A
12/12/1994
3.5
7.0
5.5
Nguyen Van B
1/9/1994
7.5
9.5
9.5
Nguyen Van C
6/7/1994
8.5
9.5
8.5
 * @author ADMIN
 */
public class J05009_TimThuKhoaKyThi {
    static class thuKhoa{
        private String ma, ten, ngaySinh;
        private double d1, d2, d3;
        
        public String getMa(){
            return this.ma;
        }

        public double getD1() {
            return d1;
        }

        public double getD2() {
            return d2;
        }

        public double getD3() {
            return d3;
        }
        
        public double getTong(){
            return this.d1 + this.d2 + this.d3;
        }

        public thuKhoa(String ma, String ten, String ngaySinh, double d1, double d2, double d3) {
            this.ma = ma;
            this.ten = ten;
            this.ngaySinh = ngaySinh;
            this.d1 = d1;
            this.d2 = d2;
            this.d3 = d3;
        }

        @Override
        public String toString() {
            return ma + " " + ten + " " + ngaySinh + " " + String.format("%.1f", d1 + d2 + d3);
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        ArrayList<thuKhoa> arr = new ArrayList<>();
        
        int n = sc.nextInt();
        for(int i = 1; i <= n; ++i){
            String m = Integer.toString(i);
            sc.nextLine();
            String t = sc.nextLine();
            String ns = sc.nextLine();
            double diem1 = sc.nextDouble();
            double diem2 = sc.nextDouble();
            double diem3 = sc.nextDouble();
            thuKhoa tmp = new thuKhoa(m, t, ns, diem1, diem2, diem3);
            arr.add(tmp);
        }
        
        Collections.sort(arr, new Comparator<thuKhoa>(){
            @Override
            public int compare(thuKhoa o1, thuKhoa o2) {
                double tmp1 = o1.getD1() + o1.getD2() + o1.getD3();
                double tmp2 = o2.getD1() + o2.getD2() + o2.getD3();
                if(tmp1 != tmp2){
                    if(tmp2 - tmp1 > 0.0) return 1;
                    return -1;
                }
                return o1.getMa().compareTo(o2.getMa());
            }
        });
        
        double diem_max = arr.get(0).getTong();
        
        for(thuKhoa it : arr){
            if(it.getTong() == diem_max){
                System.out.println(it);
            }
        }
    }
}
