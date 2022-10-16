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
Tran Vu Minh
Ha Noi
8:30
Vu Ngoc Hoang
Hoa Binh
8:20
Pham Dinh Tan
An Giang
8:45
 * @author ADMIN
 */
public class J05015_DuaXeDap {
    
    static class duaXe{
        private String ten, donVi, thoiGian;

        public duaXe(String ten, String donVi, String thoiGian) {
            this.ten = ten;
            this.donVi = donVi;
            this.thoiGian = thoiGian;
        }

        public String getThoiGian() {
            return thoiGian;
        }
        
        public String maThiSinh(){
            String ans = "";
            String[] a = ten.split("\\s+");
            String[] b = donVi.split("\\s+");
            
            for(int i = 0; i < b.length; ++i){
                ans += Character.toString(b[i].charAt(0));
            }
            
            for(int i = 0; i < a.length; ++i){
                ans += Character.toString(a[i].charAt(0));
            }
            
            return ans;
        }
        
        public String vanToc(){
            String[] a = thoiGian.split(":");
            int vt = (int) (1.0 * 120 / (((Integer.parseInt(a[0]) - 6) + (1.0 * Integer.parseInt(a[1]) / 60))) + 0.5);
            return Integer.toString(vt) + " Km/h";
        }

        @Override
        public String toString() {
            return maThiSinh() + " " + ten + " " + donVi + " " + vanToc();
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<duaXe> arr = new ArrayList<>();
        
        int n = sc.nextInt();
        sc.nextLine();
        
        for(int i = 1; i <= n; ++i){
            String t = sc.nextLine();
            String dv = sc.nextLine();
            String tg = sc.nextLine();
            
            duaXe tmp = new duaXe(t, dv, tg);
            arr.add(tmp);
        }
        
        Collections.sort(arr, new Comparator<duaXe>(){
            @Override
            public int compare(duaXe o1, duaXe o2) {
                return o1.getThoiGian().compareTo(o2.getThoiGian());
            }
        });
        
        for(duaXe it : arr){
            System.out.println(it);
        }
    }
}
