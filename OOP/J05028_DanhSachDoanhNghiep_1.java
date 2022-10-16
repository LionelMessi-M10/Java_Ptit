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

 * @author ADMIN
 */
public class J05028_DanhSachDoanhNghiep_1 {
    static class doanhNghiep{
        private String ma, ten;
        private int soLuong;

        public String getMa() {
            return ma;
        }

        public int getSoLuong() {
            return soLuong;
        }

        public doanhNghiep(String ma, String ten, int soLuong) {
            this.ma = ma;
            this.ten = ten;
            this.soLuong = soLuong;
        }

        @Override
        public String toString() {
            return ma + " " + ten + " " + soLuong;
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        ArrayList<doanhNghiep> arr = new ArrayList<>();
        
        int n = sc.nextInt();
        for(int i = 1; i <= n; ++i){
            sc.nextLine();
            String m = sc.nextLine();
            String t = sc.nextLine();
            int sl = sc.nextInt();
            
            doanhNghiep tmp = new doanhNghiep(m, t, sl);
            arr.add(tmp);
        }
        
        Collections.sort(arr, new Comparator<doanhNghiep>(){
            @Override
            public int compare(doanhNghiep o1, doanhNghiep o2) {
                if(o1.getSoLuong() != o2.getSoLuong()){
                    return o2.getSoLuong() - o1.getSoLuong();
                }
                return o1.getMa().compareTo(o2.getMa());
            }
        });
        
        for(doanhNghiep it : arr){
            System.out.println(it);
        }
    }
}
