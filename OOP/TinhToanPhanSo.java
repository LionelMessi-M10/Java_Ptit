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
public class TinhToanPhanSo {

    private long tu, mau;

    public long getTu() {
        return tu;
    }

    public long getMau() {
        return mau;
    }

    @Override
    public String toString() {
        return tu + "/" + mau;
    }

    public static long gcd(long a, long b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    public static TinhToanPhanSo Tong(TinhToanPhanSo a, TinhToanPhanSo b) {
        TinhToanPhanSo sum = new TinhToanPhanSo();
        sum.tu = 1l * a.getTu() * b.getMau() + 1l * a.getMau() * b.getTu();
        sum.tu *= sum.tu;
        sum.mau = a.getMau() * b.getMau();
        sum.mau *= sum.mau;
        long mc = gcd(sum.tu, sum.mau);
        sum.tu = sum.tu / mc;
        sum.mau = sum.mau / mc;
        return sum;

    }

    public static void Tich(TinhToanPhanSo a, TinhToanPhanSo b, TinhToanPhanSo c) {
        long tu = a.getTu() * b.getTu() * c.getTu();
        long mau = a.getMau() * b.getMau() * c.getMau();
        long mc = gcd(tu, mau);
        tu = tu / mc;
        mau = mau / mc;
        System.out.println(tu + "/" + mau);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();
        while (t-- > 0) {
            TinhToanPhanSo p1 = new TinhToanPhanSo();
            TinhToanPhanSo p2 = new TinhToanPhanSo();
            p1.tu = sc.nextLong();
            p1.mau = sc.nextLong();
            p2.tu = sc.nextLong();
            p2.mau = sc.nextLong();
            TinhToanPhanSo sum = Tong(p1, p2);
            System.out.print(sum + " ");
            Tich(p1, p2, sum);
        }
    }
}
