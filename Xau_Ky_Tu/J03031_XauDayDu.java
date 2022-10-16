/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Xau_Ky_Tu;

import java.util.Arrays;
import java.util.Scanner;

/**
2
qwqqwqeqqwdsdadsdasadsfsdsdsdasasas
4
qwqqwqeqqwdsdadsdasadsfsdsdsdasasas
24
 * @author ADMIN
 */
public class J03031_XauDayDu {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        while (t-- > 0) {
            
            String s = sc.next();
            int k = sc.nextInt();
            
            int[] M = new int[200];
            Arrays.fill(M, 0);
            
            for (int i = 0; i < s.length(); i++) {
                M[s.charAt(i)]++;
            }
            
            int a = 0;
            for (int i = 'a'; i <= 'z'; i++) {
                if (M[i] > 0) {
                    a++;
                }
            }
            
            int x = s.length() - a;
            
            if (k + a >= 26 && s.length() >= 26) {
                System.out.println("YES");
            } 
            
            else {
                System.out.println("NO");
            }
        }
    }
}
