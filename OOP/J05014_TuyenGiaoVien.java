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
 * 3
 * Le Van Binh A1 7.03 Le Van Binh A1 7.0 3.0 Tran Van Toan B3 4.0 7.0 Hoang Thi
 * Tam C2 7.0 6.0 3.0 Tran Van Toan B3 4.0 7.0 Hoang Thi Tam C2 7.0 6.0
 *
 * @author ADMIN
 */
public class J05014_TuyenGiaoVien {

    static class GiaoVien {

        private String maGV, tenGV, maXetTuyen;
        private float diemTin, diemChuyenMon;
        private static int id = 1;

        public GiaoVien(String tenGV, String maXetTuyen, float diemTin, float diemChuyenMon) {
            this.maGV = "GV" + String.format("%02d", id++);
            this.tenGV = tenGV;
            this.maXetTuyen = maXetTuyen;
            this.diemTin = diemTin;
            this.diemChuyenMon = diemChuyenMon;
        }

        public String monHoc() {
            if (this.maXetTuyen.charAt(0) == 'A') {
                return "TOAN";
            }
            if (this.maXetTuyen.charAt(0) == 'B') {
                return "LY";
            }
            return "HOA";
        }

        public float diemUuTien() {
            if (this.maXetTuyen.charAt(1) == '1') {
                return 2.0f;
            }
            if (this.maXetTuyen.charAt(1) == '2') {
                return 1.5f;
            }
            if (this.maXetTuyen.charAt(1) == '3') {
                return 1.0f;
            }
            return 0.0f;
        }

        public float tongDiem() {
            return 2 * this.diemTin + this.diemChuyenMon + this.diemUuTien();
        }

        public String ketQua() {
            if (this.tongDiem() >= 18) {
                return "TRUNG TUYEN";
            }
            return "LOAI";
        }

        @Override
        public String toString() {
            return this.maGV + " " + this.tenGV + " " + this.monHoc() + " " + String.format("%.1f", this.tongDiem()) + " " + this.ketQua();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<GiaoVien> list = new ArrayList<>();
        while (n-- > 0) {
            sc.nextLine();
            String tenGV = sc.nextLine();
            String maXetTuyen = sc.next();
            float diemTin = sc.nextFloat();
            float diemChuyenMon = sc.nextFloat();
            list.add(new GiaoVien(tenGV, maXetTuyen, diemTin, diemChuyenMon));
        }
        Collections.sort(list, new Comparator<GiaoVien>() {
            @Override
            public int compare(GiaoVien o1, GiaoVien o2) {
                if (o1.tongDiem() > o2.tongDiem()) {
                    return -1;
                }
                return 1;
            }
        });
        for (GiaoVien x : list) {
            System.out.println(x);
        }
    }
}
