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
public class J07013_DanhSachSinhVienTrongFile1 {
    
    static class sinhVien{
        private String ma, ten, lop, mail;

        public sinhVien(String ma, String ten, String lop, String mail) {
            this.ma = ma;
            this.ten = ten;
            this.lop = lop;
            this.mail = mail;
        }

        public String getMa() {
            return ma;
        }
        
        public String chuanHoa(){
            ten = ten.trim();
            String[] a = ten.split("\\s+");
            
            String ans = "";
            for(int i = 0; i < a.length; ++i){
                ans += Character.toUpperCase(a[i].charAt(0));
                ans += a[i].substring(1).toLowerCase();
                ans += " ";
            }
            return ans.trim();
        }

        @Override
        public String toString() {
            return ma + " " + chuanHoa() + " " + lop + " " + mail;
        }
    }
    
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("SINHVIEN.in"));
        
        ArrayList<sinhVien> arr = new ArrayList<>();
        
        int n = sc.nextInt();
        sc.nextLine();
        
        for(int i = 1; i <= n; ++i){
            sinhVien tmp = new sinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            arr.add(tmp);
        }
        
        Collections.sort(arr, new Comparator<sinhVien>(){
            @Override
            public int compare(sinhVien o1, sinhVien o2) {
                return o1.getMa().compareTo(o2.getMa());
            }
        });
        
        for(sinhVien it : arr){
            System.out.println(it);
        }
    }
}
