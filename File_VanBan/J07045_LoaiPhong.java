/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package File_VanBan;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
2
C THUONG 150 0.03
B VIP 200 0.05
 * @author ADMIN
 */
public class J07045_LoaiPhong {

    static class LoaiPhong implements Comparable<LoaiPhong>{

        private String kyHieu, ten;
        private int donGia;
        private double phiPV;

        public String getTen() {
            return ten;
        }

        public LoaiPhong(String s) {
            String[] a = s.split("\\s+");
            kyHieu = a[0];
            ten = a[1];
            donGia = Integer.parseInt(a[2]);
            phiPV = Double.parseDouble(a[3]);
        }

        @Override
        public String toString() {
            return kyHieu + " " + ten + " " + donGia + " " + String.format("%.2f", phiPV);
        }

        @Override
        public int compareTo(LoaiPhong o) {
            return this.ten.compareTo(o.getTen());
        }
    }

    public static void main(String[] args) throws IOException {
        ArrayList<LoaiPhong> ds = new ArrayList<>();
        Scanner in = new Scanner(new File("PHONG.in"));
        int n = Integer.parseInt(in.nextLine());
        while(n-->0){
            ds.add(new LoaiPhong(in.nextLine()));
        }
        Collections.sort(ds);
        for(LoaiPhong tmp : ds){
            System.out.println(tmp);
        }
    }
}
