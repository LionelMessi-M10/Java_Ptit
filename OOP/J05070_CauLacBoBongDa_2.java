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
AC
AC Milan
12
MU
Manchester United
10
2
IAC1 80000
EMU2 60000
 * @author ADMIN
 */
public class J05070_CauLacBoBongDa_2 {
    
    static class cauLacBo{
        private String ma, ten;
        private int giaVe, doanhThu;
        private String maTD;

        public cauLacBo(String ma, String ten, int giaVe) {
            this.ma = ma;
            this.ten = ten;
            this.giaVe = giaVe;
        }

        public String getMa() {
            return ma;
        }

        public String getTen() {
            return ten;
        }

        public int getGiaVe() {
            return giaVe;
        }

        public int getDoanhThu() {
            return doanhThu;
        }

        public String getMaTD() {
            return maTD;
        }

        public void setDoanhThu(int doanhThu) {
            this.doanhThu = doanhThu;
        }

        public void setMaTD(String maTD) {
            this.maTD = maTD;
        }

        @Override
        public String toString() {
            return maTD + " " + ten + " " + doanhThu;
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        ArrayList<cauLacBo> arr = new ArrayList<>();
        
        int n = sc.nextInt();
        for(int i = 0; i < n; ++i){
            sc.nextLine();
            String m = sc.nextLine();
            String t = sc.nextLine();
            int gv = sc.nextInt();
            
            cauLacBo tmp = new cauLacBo(m, t, gv);
            arr.add(tmp);
        }
        
        int m = sc.nextInt();
        for(int i = 0; i < n; ++i){
            String maTranDau = sc.next();
            int soDongVien = sc.nextInt();
            for(cauLacBo it : arr){
                if(it.getMa().equals(maTranDau.substring(1, 3))){
                    it.setMaTD(maTranDau);
                    it.setDoanhThu(it.getGiaVe() * soDongVien);
                }
            }
        }
        
        Collections.sort(arr, new Comparator<cauLacBo>(){
            @Override
            public int compare(cauLacBo o1, cauLacBo o2) {
                if(o1.getDoanhThu() != o2.getDoanhThu()){
                    return o2.getDoanhThu() - o1.getDoanhThu();
                }
                return o1.getTen().compareTo(o2.getTen());
            }
        });
        
        for(cauLacBo it : arr){
            System.out.println(it);
        }
    }
}
