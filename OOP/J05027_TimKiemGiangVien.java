/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OOP;

import java.util.ArrayList;
import java.util.Scanner;

/**
3
Nguyen Manh Son
Cong nghe phan mem
Vu Hoai Nam
Khoa hoc may tinh
Dang Minh Tuan
An toan thong tin
1
aN
 * @author ADMIN
 */
public class J05027_TimKiemGiangVien {
    static class giangVien{
        private String ma, ten, mon;

        public String getMon() {
            return mon;
        }

        public String getTen() {
            return ten;
        }
        
        public giangVien(String ma, String ten, String mon) {
            this.ma = ma;
            this.ten = ten;
            this.mon = mon;
        }
        
        public String getMon(String s){
            String[] x = s.split("\\s+");
            String res = "";
            for(int i = 0; i < x.length; ++i){
                res += Character.toUpperCase(x[i].charAt(0));
            }
            return res;
        }

        @Override
        public String toString() {
            return ma + " " + ten + " " + getMon(mon);
        }
    }
    
    public static String chuan(String s){
        String tmp = "";
        String[] a = s.split("\\s+");
        
        for(int i = 0; i < a.length; ++i){
            tmp += Character.toUpperCase(a[i].charAt(0));
        }
        return tmp;
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
        
        int q = sc.nextInt();
        sc.nextLine();
        while(q-- > 0){
            String s = sc.nextLine();
            System.out.println("DANH SACH GIANG VIEN THEO TU KHOA " + s + ":");
            
            for(giangVien it : arr){
                if(it.getTen().toLowerCase().contains(s.toLowerCase())){
                    System.out.println(it);
                }
            }
        }
    }
}
