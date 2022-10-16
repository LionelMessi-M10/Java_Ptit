/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OOP;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 4
 * Tran Thi Yen NV 1000 24 Nguyen Van Thanh BV 1000 30 Doan Truong An TP 3000 25
 * Le Thanh GD 5000 28 TP
 *
 * @author ADMIN
 */
public class J05044_LietKeNhanVienTheoChucVu {

    static class NhanVien {

        private String ma, ten, chucVu;
        private int luongCB, cong, thuong, luongChinh, ung, conLai;

        public NhanVien(int ma, String ten, String chucVu, int luongCB, int cong) {
            this.ma = "NV" + String.format("%02d", ma);
            this.ten = ten;
            this.chucVu = chucVu;
            this.luongCB = luongCB;
            this.cong = cong;
            this.thuong = thuong(chucVu);
            this.luongChinh = luongCB * cong;
            this.ung = ung();
            this.conLai = thuNhap() - ung;
        }

        public String getChucVu() {
            return chucVu;
        }

        private int thuong(String s) {
            if (s.equals("GD")) {
                return 500;
            }
            if (s.equals("PGD")) {
                return 400;
            }
            if (s.equals("TP")) {
                return 300;
            }
            if (s.equals("KT")) {
                return 250;
            }
            return 100;
        }

        private int thuNhap() {
            return luongCB * cong + thuong;
        }

        private int ung() {
            float tmp = thuNhap() * 2 / 3;
            if (tmp < 25000) {
                return Math.round(tmp / 1000) * 1000;
            }
            return 25000;
        }

        @Override
        public String toString() {
            return ma + " " + ten + " " + thuong + " " + luongChinh + " " + ung + " " + conLai;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        List<NhanVien> ds = new ArrayList<>();
        for (int i = 1; i <= t; i++) {
            ds.add(new NhanVien(i, sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine())));
        }
        String cv = sc.nextLine();
        for (NhanVien nv : ds) {
            if (nv.getChucVu().equals(cv)) {
                System.out.println(nv);
            }
        }
    }
}
