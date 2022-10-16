/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Xau_Ky_Tu;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class J03013_HieuSoNguyenLon_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        
        while (t-- > 0) {
            BigInteger a = sc.nextBigInteger();
            BigInteger b = sc.nextBigInteger();
            
            BigInteger x = a.subtract(b);
            
            x = x.abs();
            String s = x.toString();
            String m = a.toString();
            String n = b.toString();
            
            int maxx = Math.max(m.length(), n.length());
            
            while (s.length() < maxx) {
                s = "0" + s;
            }
            
            System.out.println(s);
        }
    }
}
