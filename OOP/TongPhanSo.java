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
public class TongPhanSo {
    private int tu, mau;

    public int getTu() {
        return tu;
    }

    public int getMau() {
        return mau;
    }
    
    public static long GCD(long a, long b){
        if(b == 0) return a;
        return GCD(b, a % b);
    }    
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TongPhanSo p1 = new TongPhanSo();
        TongPhanSo p2 = new TongPhanSo();
        p1.tu = sc.nextInt();
        p1.mau = sc.nextInt();
        p2.tu = sc.nextInt();
        p2.mau = sc.nextInt();
        long a = 1l*p1.getTu() * p2.getMau() + 1l * p1.getMau()*p2.getTu();
        long b = 1l*p1.getMau() * p2.getMau();
        long mc = GCD(a, b);
        long tmp1 = a / mc;
        long tmp2 = b / mc;
        System.out.println(tmp1 + "/" + tmp2);
    }
}
