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
4
B16DCCN011
Nguyen Trong Duc Anh
D16CNPM1
sv1@stu.ptit.edu.vn
B15DCCN215
To Ngoc Hieu
D15CNPM3
sv2@stu.ptit.edu.vn
B15DCKT150
Nguyen Ngoc Son
D15CQKT02-B
sv3@stu.ptit.edu.vn
B15DCKT199
Nguyen Trong Tung
D15CQKT03-B
sv4@stu.ptit.edu.vn
 * @author ADMIN
 */
public class J05020_SapXepSinhVienTheoLop {
    static class sinhVien{
        private String ma, ten, lop, email;

        public String getMa() {
            return ma;
        }

        public String getLop() {
            return lop;
        }
        
        public sinhVien(String ma, String ten, String lop, String email) {
            this.ma = ma;
            this.ten = ten;
            this.lop = lop;
            this.email = email;
        }

        @Override
        public String toString() {
            return ma + " " + ten + " " + lop + " " + email;
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        ArrayList<sinhVien> arr = new ArrayList<>();
        
        int n = sc.nextInt();
        sc.nextLine();
        for(int i = 1; i <= n; ++i){
            String m = sc.nextLine();
            String t = sc.nextLine();
            String l = sc.nextLine();
            String mail = sc.nextLine();
            
            sinhVien tmp = new sinhVien(m, t, l, mail);
            arr.add(tmp);
        }
        
        Collections.sort(arr, new Comparator<sinhVien>(){
            @Override
            public int compare(sinhVien o1, sinhVien o2) {
                if(!o1.getLop().equals(o2.getLop())){
                    return o1.getLop().compareTo(o2.getLop());
                }
                return o1.getMa().compareTo(o2.getMa());
            }
        });
        
        for(sinhVien it : arr){
            System.out.println(it);
        }
    }
}
