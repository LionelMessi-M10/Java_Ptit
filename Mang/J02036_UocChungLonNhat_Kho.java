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
public class J02036_UocChungLonNhat_Kho {
    
    public static int gcd(int a, int b){
        if(b == 0) return a;
        return gcd(b, a%b);
    }
    
    public static int lcm(int a, int b){
        return a / gcd(a, b) * b;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int[] a = new int[n];
            for(int i = 0; i < n; ++i){
                a[i] = sc.nextInt();
            }
            
            int[] b = new int[n + 1];
            int k = 0, tmp = 1;
            
            for(int i = 0; i < n; ++i){
                b[k] = lcm(tmp, a[i]);
                tmp = a[i];
                ++k;
            }            
            b[n] = a[n-1];
            
            for(int i = 0; i <= n; ++i){
                System.out.print(b[i] + " ");
            }
            
            System.out.println("");
        }
    }
}
