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
Le Thi Thanh
468
500
Le Duc Cong
160
230
Ha Hue Anh
410
612
 * @author ADMIN
 */
public class J05017_HoaDonTienNuoc {
    
    static class hoaDon{
        private String ma, ten;
        private int chiSoCu, chiSoMoi;

        public hoaDon(String ma, String ten, int chiSoCu, int chiSoMoi) {
            this.ma = ma;
            this.ten = ten;
            this.chiSoCu = chiSoCu;
            this.chiSoMoi = chiSoMoi;
        }
        
        public int tongTien(){
            int chiSo = chiSoMoi - chiSoCu;
            if(chiSo >= 0 && chiSo <= 50){
                return (int) Math.round(1.0 * chiSo * 100 * (1 + 2/100.0));
            }
            else if(chiSo > 50 && chiSo <= 100){
                return (int) Math.round(1.0 * (50 * 100 + (chiSo - 50) * 150) * (1 + 3 / 100.0));
            }
            return (int) Math.round(1.0 * (50 * 100 + 50 * 150 + (chiSo - 100) * 200)*(1 + 5/100.0));
        }

        @Override
        public String toString() {
            return ma + " " + ten + " " + tongTien();
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        ArrayList<hoaDon> arr = new ArrayList<>();
        
        int n = sc.nextInt();
        for(int i = 1; i <= n; ++i){
            String ma = String.format("KH%02d", i);
            sc.nextLine();
            String t = sc.nextLine();
            int cu = sc.nextInt();
            int moi = sc.nextInt();
            
            hoaDon tmp = new hoaDon(ma, t, cu, moi);
            arr.add(tmp);
        }
        
        Collections.sort(arr, new Comparator<hoaDon>(){
            @Override
            public int compare(hoaDon o1, hoaDon o2) {
                return o2.tongTien() - o1.tongTien();
            }
        });
        
        for(hoaDon it : arr){
            System.out.println(it);
        }
    }
}
