/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Mang;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class BoBaPytago {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            long[] a = new long[n];
            for (int i = 0; i < n; ++i) {
                a[i] = sc.nextLong();
                a[i] *= a[i];
            }
            
            Arrays.sort(a);
            
            boolean ok = false;
            
            for (int i = n - 1; i >= 1; --i) {
                long x = a[i];
                int l = 0, r = i - 1;
                while (l < r) {
                    if (a[l] + a[r] == x) {
                        ok = true;
                        break;
                    } 
                    else if (a[l] + a[r] > x) {
                        --r;
                    } 
                    else {
                        ++l;
                    }
                }
            }
            
            if (ok) {
                System.out.println("YES");
            } 
            else {
                System.out.println("NO");
            }
        }
    }
}
