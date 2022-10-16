/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OOP;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
2
ngUYen Van NaM
D20DCCN01-B
2/12/1994
2.17
Nguyen QuanG hAi
D20DCCN02-B
1/9/1994
3.0
 * @author ADMIN
 */
public class J05005_DanhSachDoiTuongSinhVien3 {
    static class SinhVien{
        private String ma, ten, lop, ngaySinh;
        private double gpa;

        public double getGpa() {
            return gpa;
        }

        public SinhVien(String ma, String ten, String lop, String ngaySinh, double gpa) {
            this.ma = ma;
            this.ten = ten;
            this.lop = lop;
            this.ngaySinh = ngaySinh;
            this.gpa = gpa;
        }

        public String chuanHoa(String s){
            StringBuilder sb = new StringBuilder(s);
            if(sb.charAt(1) == '/') sb.insert(0, '0');
            if(sb.charAt(4) == '/') sb.insert(3, '0');
            return sb.toString();
        }
        
        public String chuanTen(String s){
            String tmp = "";
            StringTokenizer st = new StringTokenizer(s);
            while(st.hasMoreTokens()){
                String res = st.nextToken();
                tmp += Character.toUpperCase(res.charAt(0));
                tmp += res.substring(1).toLowerCase();
                tmp += " ";
            }
            tmp = tmp.trim();
            return tmp;
        }
        
        @Override
        public String toString() {
            return ma + " " + chuanTen(ten) + " " + lop + " " + chuanHoa(ngaySinh) + " " + String.format("%.2f", gpa);
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        ArrayList<SinhVien> arr = new ArrayList<>();
        
        int n = sc.nextInt();
        for(int i = 1; i <= n; ++i){
            sc.nextLine();
            String m = "B20DCCN" + String.format("%03d", i);
            String t = sc.nextLine();
            String l = sc.nextLine();
            String ns = sc.nextLine();
            double diem = sc.nextDouble();
            SinhVien tmp = new SinhVien(m, t, l, ns, diem);
            arr.add(tmp);
        }
        
        Collections.sort(arr, new Comparator<SinhVien>(){
            @Override
            public int compare(SinhVien o1, SinhVien o2) {
                if(o2.getGpa() - o1.getGpa() > 0.0){
                    return 1;
                }
                return -1;
            }           
        });
        
        for(SinhVien it : arr){
            System.out.println(it);
        }
    }
}
