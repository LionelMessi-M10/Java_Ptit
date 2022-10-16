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
public class J05061_SapXepKetQuaXetTuyen {
    
    static class ThiSinh {

        private String ma, hoTen, ns;
        private double lyThuyet, thucHanh;

        public ThiSinh(int ma, String hoTen, String ns, double lyThuyet, double thucHanh) {
            this.ma = "PH" + String.format("%02d", ma);
            this.hoTen = hoTen;
            this.ns = ns.substring(ns.length() - 4);
            this.lyThuyet = lyThuyet;
            this.thucHanh = thucHanh;
        }

        public String getMa() {
            return ma;
        }
        
        private int tuoi() {
            return 2021 - Integer.parseInt(ns);
        }

        private long diem() {
            double tb = (lyThuyet + thucHanh) / 2.0;
            double diem = tb;
            if (lyThuyet >= 8 && thucHanh >= 8) {
                diem = tb + 1;
            } else if (lyThuyet >= 7.5 && thucHanh >= 7.5) {
                diem = tb + 0.5;
            }
            double tp = diem % 1;
            if (tp >= 0.5) {
                diem += (1 - tp);
            } else {
                diem -= tp;
            }
            if (diem > 10) {
                diem = 10;
            }
            return (int) diem;
        }

        private String xepLoai() {
            if (diem() < 5) {
                return "Truot";
            }
            if (diem() == 5 || diem() == 6) {
                return "Trung binh";
            }
            if (diem() == 7) {
                return "Kha";
            }
            if (diem() == 8) {
                return "Gioi";
            }
            return "Xuat sac";
        }

        @Override
        public String toString() {
            return ma + " " + hoTen + " " + tuoi() + " " + diem() + " " + xepLoai();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        List<ThiSinh> ds = new ArrayList<>();
        for (int i = 1; i <= t; i++) {
            ds.add(new ThiSinh(i, sc.nextLine(), sc.nextLine(), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine())));
        }
        
        Collections.sort(ds, new Comparator<ThiSinh>(){
            @Override
            public int compare(ThiSinh o1, ThiSinh o2) {
                if(o2.diem() != o1.diem()){
                    if(o2.diem() - o1.diem() > 0) return 1;
                    return -1;
                }
                return o1.getMa().compareTo(o2.getMa());
            }
        });
        
        for (ThiSinh ts : ds) {
            System.out.println(ts);
        }
    }
}
