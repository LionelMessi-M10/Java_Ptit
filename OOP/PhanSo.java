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
public class PhanSo {
    private long tu, mau;

    public long getTu() {
        return tu;
    }

    public long getMau() {
        return mau;
    }
    
    public static long GCD(long a, long b){
        if(b == 0) return a;
        return GCD(b, a % b);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PhanSo p = new PhanSo();
        p.tu = sc.nextLong();
        p.mau = sc.nextLong();
        long tu = p.getTu();
        long mau = p.getMau();
        long mc = GCD(tu, mau);
        long tmp1 = tu / mc;
        long tmp2 = mau / mc;
        System.out.println(tmp1 + "/" + tmp2);
    }
}
