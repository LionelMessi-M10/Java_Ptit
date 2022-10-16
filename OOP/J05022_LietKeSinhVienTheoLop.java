/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OOP;

import java.util.ArrayList;
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
D15CQKT02-B
sv4@stu.ptit.edu.vn
1
D15CQKT02-B
 * @author ADMIN
 */
public class J05022_LietKeSinhVienTheoLop {

    static class SinhVien {

        private String ma, ten, lop, email;

        public String getLop() {
            return lop;
        }

        public SinhVien(String ma, String ten, String lop, String email) {
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
        
        ArrayList<SinhVien> arr = new ArrayList<>();
        
        int n = sc.nextInt();
        sc.nextLine();
        for(int i = 1; i <= n; ++i){
            String m = sc.nextLine();
            String t = sc.nextLine();
            String l = sc.nextLine();
            String mail = sc.nextLine();
            
            SinhVien tmp = new SinhVien(m, t, l, mail);
            arr.add(tmp);
        }
        
        int tes = sc.nextInt();
        while(tes-- > 0){
            String truyVan = sc.next();
            System.out.println("DANH SACH SINH VIEN LOP " + truyVan + ":");
            
            for(SinhVien it : arr){
                if(it.getLop().equals(truyVan)){
                    System.out.println(it);
                }
            }
        }
    }
}
