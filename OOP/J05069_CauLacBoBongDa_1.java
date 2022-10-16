/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OOP;

import java.util.ArrayList;
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
public class J05069_CauLacBoBongDa_1 {
    
    static class cauLacBo{
        private String ma, ten;
        private int giaVe;

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
                    System.out.println(maTranDau + " " + it.getTen() + " " + it.getGiaVe() * soDongVien);
                }
            }
        }
    }
}
