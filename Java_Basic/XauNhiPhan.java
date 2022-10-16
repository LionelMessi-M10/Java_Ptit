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
public class XauNhiPhan {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        
        long[] M = new long[100];
        
        M[0] = 0;
        M[1] = 1;
        
        for (int i = 2; i <= 93; i++) {
            M[i] = M[i - 1] + M[i - 2];
        }
        
        String[] S = new String[4];
        S[0] = "0";
        S[1] = "1";
        S[2] = "01";
        
        while (t-- > 0) {
            int n = scan.nextInt();
            long k = scan.nextLong();
            while (n > 3) {
                if (k <= M[n - 2]) {
                    n -= 2;
                } else {
                    k -= M[n - 2];
                    n--;
                }
            }
            
            char[] X = S[n - 1].toCharArray();
            System.out.println(X[(int) k - 1]);
        }
    }
}
