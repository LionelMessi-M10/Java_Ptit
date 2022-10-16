/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OOP;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
3
Doan Thi Kim
13/03/1982
8
9.5
Dinh Thi Ngoc Ha
03/09/1996
6.5
8
Tran Thanh Mai
12/09/2004
8
9
 * @author ADMIN
 */
public class J05060_KetQuaXetTuyen {

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
        for (ThiSinh ts : ds) {
            System.out.println(ts);
        }
    }
}
