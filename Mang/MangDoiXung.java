/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Mang;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class MangDoiXung {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        
        while(t-- > 0){
            int n = sc.nextInt();
            int[] a = new int[n];
            for(int i = 0; i < n; ++i){
                a[i] = sc.nextInt();
            }
            
            boolean ok = true;
            
            int l = 0, r = n-1;
            while(l < r){
                if(a[l] != a[r]){
                    ok = false;
                    break;
                }
                ++l; --r;
            }
            
            if(ok) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
