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
 *
 * @author ADMIN
 */
public class J05035_DanhSachThucTap_2 {
    static class danhSach{
        private String ma, ten, lop, email, doanhNghiep;
        private int stt;

        public String getMa() {
            return ma;
        }

        public String getDoanhNghiep() {
            return doanhNghiep;
        }

        public danhSach(String ma, String ten, String lop, String email, String doanhNghiep, int stt) {
            this.ma = ma;
            this.ten = ten;
            this.lop = lop;
            this.email = email;
            this.doanhNghiep = doanhNghiep;
            this.stt = stt;
        }

        @Override
        public String toString() {
            return stt + " " + ma.trim() + " " + ten.trim() + " " + lop.trim() + " " + email.trim() + " " + doanhNghiep;
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        ArrayList<danhSach> arr = new ArrayList<>();
        
        int n = sc.nextInt();
        sc.nextLine();
        
        for(int i = 1; i <= n; ++i){
            int STT = i;
            String m = sc.nextLine();
            String t = sc.nextLine();
            String l = sc.nextLine();
            String mail = sc.nextLine();
            String dn = sc.nextLine();
            
            danhSach tmp = new danhSach(m, t, l, mail, dn, STT);
            arr.add(tmp);
        }
        
        Collections.sort(arr, new Comparator<danhSach>(){
            @Override
            public int compare(danhSach o1, danhSach o2) {
                return o1.getMa().compareTo(o2.getMa());
            }
        });
        
        int q = sc.nextInt();
        while(q-- > 0){
            String check = sc.next();
            for(danhSach it : arr){
                if(it.getDoanhNghiep().equals(check)){
                    System.out.println(it);
                }
            }
        }
    }
}
