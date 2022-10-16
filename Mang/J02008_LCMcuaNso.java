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
public class J02008_LCMcuaNso {
    
    public static long gcd(long a, long b){
        if(b == 0) return a;
        return gcd(b, a%b);
    }
    
    public static long lcm(long a, int b){
        return a / gcd(a, b) * b;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0){
            int n = sc.nextInt();
            long res = 1;
            for(int i = 2; i <= n; ++i){
                res = lcm(res, i);
            }
            
            System.out.println(res);
        }
    }
}
