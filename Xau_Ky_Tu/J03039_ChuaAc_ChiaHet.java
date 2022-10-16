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
public class J03039_ChuaAc_ChiaHet {
    
    public static final int mod = (int)(1e9 + 7);
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        while(t-- > 0){
            String a = sc.next();
            String b = sc.next();
            
            long x = chuyen(a);
            long y = chuyen(b);
            
            if(x % y == 0 || y % x == 0){
                System.out.println("YES");
            }
            else System.out.println("NO");
        }
    }

    public static long chuyen(String b) {
        long sum = 0;
        for(int i = 0; i < b.length(); ++i){
            sum = (1l * sum * 10 % mod + (b.charAt(i) - '0') % mod) % mod;
            sum %= mod;
        }
        return sum;
    }
}
