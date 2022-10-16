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
Ke toan
 * @author ADMIN
 */
public class J05024_LietKeSinhVienTheoNganh {
    static class sinhVien{
        private String ma, ten, lop, email;

        public sinhVien(String ma, String ten, String lop, String email) {
            this.ma = ma;
            this.ten = ten;
            this.lop = lop;
            this.email = email;
        }

        public String getMa() {
            return ma;
        }

        public String getLop() {
            return lop;
        }
        
        public String nganh(String s){
            String res = "";
            if("DCKT".equals(s)) res = "Ke toan";
            else if("DCCN".equals(s)) res = "Cong nghe thong tin";
            else if("DCAT".equals(s)) res = "An toan thong tin";
            else if("DCVT".equals(s)) res = "Vien thong";
            else if("DCDT".equals(s)) res = "Dien tu";
            return res;
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
        
        int q = sc.nextInt();
        sc.nextLine();
        
        while(q-- > 0){
            String tes = sc.nextLine();
            System.out.println("DANH SACH SINH VIEN NGANH " + tes.toUpperCase() + ":");
            
            for(sinhVien it : arr){
                String check = it.nganh(it.getMa().substring(3, 7));
                if(check.equals(tes)){
                    if("Cong nghe thong tin".equals(check) || "An toan thong tin".equals(check)){
                        if(it.getLop().charAt(0) != 'E'){
                            System.out.println(it);
                        }
                    }
                    else{
                        System.out.println(it);
                    }
                }
            }
        }
    }
}
