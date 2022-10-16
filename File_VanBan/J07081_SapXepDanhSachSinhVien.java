/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package File_VanBan;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class J07081_SapXepDanhSachSinhVien {
    
    static class sinhVien{
        private String ma, ten, sdt, mail;

        public sinhVien(String ma, String ten, String sdt, String mail) {
            this.ma = ma;
            this.ten = ten;
            this.sdt = sdt;
            this.mail = mail;
        }

        public String getMa() {
            return ma;
        }

        public String getTen() {
            return ten;
        }
        
        public String chuyen(){
            String ans = "";
            String[] a = ten.split("\\s+");
            ans += a[a.length - 1] + a[0];
            for(int i = 1; i < a.length - 1; ++i) ans += a[i];
            return ans;
        }

        @Override
        public String toString() {
            return ma + " " + ten + " " + sdt + " " + mail;
        }
    }
    
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("SINHVIEN.in"));
        
        ArrayList<sinhVien> arr = new ArrayList<>();
        
        int n = sc.nextInt();
        sc.nextLine();
        
        for(int i = 1; i <= n; ++i){
            String m = sc.nextLine();
            String t = sc.nextLine();
            String so = sc.nextLine();
            String mail = sc.nextLine();
            
            sinhVien tmp = new sinhVien(m, t, so, mail);
            arr.add(tmp);
        }
        
        Collections.sort(arr, new Comparator<sinhVien>(){
            @Override
            public int compare(sinhVien o1, sinhVien o2) {
                if(!o1.getTen().equals(o2.getTen())){
                    return o1.chuyen().compareTo(o2.chuyen());
                }
                return o1.getMa().compareTo(o2.getMa());
            }
        });
        
        for(sinhVien it : arr){
            System.out.println(it);
        }
    }
}
