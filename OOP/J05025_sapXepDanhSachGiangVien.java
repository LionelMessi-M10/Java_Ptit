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
Nguyen Manh Son
Cong nghe phan mem
Vu Hoai Nam
Khoa hoc may tinh
Dang Minh Tuan
An toan thong tin
 * @author ADMIN
 */
public class J05025_sapXepDanhSachGiangVien {
    static class giangVien{
        private String ma, ten, mon;

        public String getTen() {
            String[] s = this.ten.split("\\s+");
            return s[s.length - 1];
        }
        
        public String getMon(String s){
            String[] x = s.split("\\s+");
            String res = "";
            for(int i = 0; i < x.length; ++i){
                res += Character.toUpperCase(x[i].charAt(0));
            }
            return res;
        }

        public giangVien(String ma, String ten, String mon) {
            this.ma = ma;
            this.ten = ten;
            this.mon = mon;
        }

        @Override
        public String toString() {
            return ma + " " + ten + " " + getMon(mon);
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        ArrayList<giangVien> arr = new ArrayList<>();
        
        int n = sc.nextInt();
        sc.nextLine();
        
        for(int i = 1; i <= n; ++i){
            String m = String.format("GV%02d", i);
            String t = sc.nextLine();
            String bm = sc.nextLine();
            
            giangVien tmp = new giangVien(m, t, bm);
            arr.add(tmp);
        }
        
        Collections.sort(arr, new Comparator<giangVien>(){
            @Override
            public int compare(giangVien o1, giangVien o2) {
                return o1.getTen().compareTo(o2.getTen());
            }
        });
        
        for(giangVien it : arr){
            System.out.println(it);
        }
    }
}
