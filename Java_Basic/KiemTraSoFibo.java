/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Java_Basic;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class KiemTraSoFibo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        long[] fib = new long[93];
        
        fib[0] = 0;
        fib[1] = 1;
        
        for(int i = 2; i <= 92; ++i){
            fib[i] = fib[i-1] + fib[i-2];
        }
        
        int t = sc.nextInt();
        while(t-- > 0){
            long n = sc.nextLong();
            boolean ok = false;
            for(int i = 0; i < 93; ++i){
                if(n == fib[i]){
                    ok = true;
                    break;
                }
            }
            if(ok) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
