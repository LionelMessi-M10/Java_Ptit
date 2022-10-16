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
3
Luu Thuy Nhi
9.3  9.0  7.1  6.5  6.2  6.0  8.2  6.7  4.8  5.5
Le Van Tam
8.0  8.0  5.5  9.0  6.8  9.0  7.2  8.3  7.2  6.8
Nguyen Thai Binh
9.0  6.4  6.0  7.5  6.7  5.5  5.0  6.0  6.0  6.0
 *
 * @author ADMIN
 */
public class J05018_BangDiemHocSinh {

    static class BangDiem {

        private String maHS;
        private String hoTen;
        private float d1, d2, d3, d4, d5, d6, d7, d8, d9, d10, diemTB;
        private String xepLoai;

        public BangDiem(int maHS, String hoTen, float d1, float d2, float d3, float d4, float d5, float d6, float d7, float d8, float d9, float d10) {
            this.maHS = String.format("HS%02d", maHS);
            this.hoTen = hoTen;
            this.d1 = d1;
            this.d2 = d2;
            this.d3 = d3;
            this.d4 = d4;
            this.d5 = d5;
            this.d6 = d6;
            this.d7 = d7;
            this.d8 = d8;
            this.d9 = d9;
            this.d10 = d10;
            this.tinhDiemTB(d1, d2, d3, d4, d5, d6, d7, d8, d9, d10);
            xeploaiHS(tinhDiemTB(d1, d2, d3, d4, d5, d6, d7, d8, d9, d10));
        }

        public float getDiemTB() {
            return diemTB;
        }

        public void setDiemTB(float diemTB) {
            this.diemTB = diemTB;
        }

        public String getXepLoai() {
            return xepLoai;
        }

        public void setXepLoai(String xepLoai) {
            this.xepLoai = xepLoai;
        }

        public String getHoTen() {
            return hoTen;
        }

        public void setHoTen(String hoTen) {
            this.hoTen = hoTen;
        }

        public String getMaHS() {
            return maHS;
        }

        public void setMaHS(String maHS) {
            this.maHS = maHS;
        }

        private float tinhDiemTB(float d1, float d2, float d3, float d4, float d5,
                                        float d6, float d7, float d8, float d9, float d10) {
            
            diemTB = (float) Math.round(((d1 * 2 + d2 * 2 + d3 + d4 + d5 + 
                    d6 + d7 + d8 + d9 + d10) / 12) * 10f) / 10f;
            return diemTB;
        }

        private void xeploaiHS(float diemTB) {
            if (diemTB >= 9) {
                xepLoai = "XUAT SAC";
            }
            if (diemTB >= 8 && diemTB < 9) {
                xepLoai = "GIOI";
            }
            if (diemTB >= 7 && diemTB < 8) {
                xepLoai = "KHA";
            }
            if (diemTB >= 5 && diemTB < 7) {
                xepLoai = "TB";
            }
            if (diemTB < 5) {
                xepLoai = "YEU";
            }
        }

        @Override
        public String toString() {
            return maHS + " " + hoTen + " " + diemTB + " " + xepLoai;
        }
    }

    public static void main(String[] args) {
        
        int dem = 0;
        Scanner in = new Scanner(System.in);
        List<BangDiem> list = new ArrayList<>();
        int so = Integer.parseInt(in.nextLine());
        while (so-- > 0) {
            dem++;
            BangDiem bd = new BangDiem(dem, in.nextLine(), in.nextFloat(), in.nextFloat(), in.nextFloat(), 
                    in.nextFloat(), in.nextFloat(), in.nextFloat(), in.nextFloat(), in.nextFloat(), in.nextFloat(), in.nextFloat());
            
            in.nextLine();

            list.add(bd);
        }
        
        Collections.sort(list, new Comparator<BangDiem>() {
            @Override
            public int compare(BangDiem o1, BangDiem o2) {
                if ((o2.getDiemTB() - o1.getDiemTB()) > 0) {
                    return 1;
                }
                if ((o2.getDiemTB() - o1.getDiemTB()) == 0) {
                    String s1 = String.format("%.1f", o1.getDiemTB());
                    String s2 = String.format("%.1f", o2.getDiemTB());
                    return s1.compareTo(s2);
                }
                return -1;
            }
        });
        
        for (BangDiem i : list) {
            System.out.println(i);
        }
    }
}
