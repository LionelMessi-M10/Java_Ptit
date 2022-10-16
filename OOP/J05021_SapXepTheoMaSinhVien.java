/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OOP;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class J05021_SapXepTheoMaSinhVien {
    static class SinhVien{
        private String ma, ten, lop, email;

        public String getMa() {
            return ma;
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
        Scanner in = new Scanner(System.in);
        
        List<SinhVien> list = new ArrayList<>();

        while (in.hasNext()) {
            String maSV = in.nextLine();
            String name = in.nextLine();
            String lop = in.nextLine();
            String email = in.nextLine();
            SinhVien sv = new SinhVien(maSV, name, lop, email);
            list.add(sv);
        }
        
        Collections.sort(list, new Comparator<SinhVien>() {
            @Override
            public int compare(SinhVien o1, SinhVien o2) {
                return o1.getMa().compareTo(o2.getMa());
            }
        });
        
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
