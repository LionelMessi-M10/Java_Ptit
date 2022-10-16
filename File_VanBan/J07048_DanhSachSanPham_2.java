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
public class J07048_DanhSachSanPham_2 {
    
    static class sanPham{
        private String ma, ten;
        private int giaBan, baoHanh;

        public String getMa() {
            return ma;
        }

        public int getGiaBan() {
            return giaBan;
        }

        public sanPham(String ma, String ten, int giaBan, int baoHanh) {
            this.ma = ma;
            this.ten = ten;
            this.giaBan = giaBan;
            this.baoHanh = baoHanh;
        }

        @Override
        public String toString() {
            return ma + " " + ten + " " + giaBan + " " + baoHanh;
        }
    }
    
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("SANPHAM.in"));
        
        ArrayList<sanPham> arr = new ArrayList<>();
        
        int n = sc.nextInt();
        
        for(int i = 1; i <= n; ++i){
            sc.nextLine();
            
            String m = sc.nextLine();
            String ten = sc.nextLine();
            int gia = sc.nextInt();
            int bh = sc.nextInt();
            
            sanPham tmp = new sanPham(m, ten, gia, bh);
            arr.add(tmp);
        }
        
        Collections.sort(arr, new Comparator<sanPham>(){
            @Override
            public int compare(sanPham o1, sanPham o2) {
                if(o1.getGiaBan() != o2.getGiaBan()){
                    return o2.getGiaBan() - o1.getGiaBan();
                }
                return o1.getMa().compareTo(o2.getMa());
            }
        });
        
        for(sanPham it : arr){
            System.out.println(it);
        }
    }
}
