/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Xau_Ky_Tu;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class J03011_GCDcuaSoNguyenLon {
    
//    Ta thay gcd(a, b) = gcd(b, a % b) ma a(long), b(String) thi phai dua chuoi b ve dang long 
//    bang cach mod cho a.
    public static long chuyen(String b, long a){
        long res = 0;
        for(int i = 0; i < b.length(); ++i){
            res = (res * 10) + (b.charAt(i) - '0');
            res %= a;
        }
        return res;
    }
    
    public static long gcd(long a, long b){
        if(b == 0) return a;
        return gcd(b, a % b);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            long a = sc.nextLong();
            sc.nextLine();
            String b = sc.nextLine();
            long tmp = chuyen(b, a);
            System.out.println(gcd(a, tmp));
        }
    }
}