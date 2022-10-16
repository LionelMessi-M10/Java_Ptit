/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OOP;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class ThiSinh {
    private String ten, ngaySinh;
    private double diem1, diem2, diem3, tong;

    public ThiSinh() {
    }

    ThiSinh(int i, String nextLine, String nextLine0, double parseDouble, double parseDouble0) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getTen() {
        return ten;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public double getDiem1() {
        return diem1;
    }

    public double getDiem2() {
        return diem2;
    }

    public double getDiem3() {
        return diem3;
    }

    public double getTong() {
        return tong;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ThiSinh sv = new ThiSinh();
        sv.ten = sc.nextLine();
        sv.ngaySinh = sc.next();
        sv.diem1 = sc.nextDouble();
        sv.diem2 = sc.nextDouble();
        sv.diem3 = sc.nextDouble();
        sv.tong = sv.getDiem1() + sv.getDiem2() + sv.getDiem3();
        System.out.print(sv.getTen() + " " + sv.getNgaySinh() + " ");
        System.out.printf("%.1f", sv.getTong());
    }
}
