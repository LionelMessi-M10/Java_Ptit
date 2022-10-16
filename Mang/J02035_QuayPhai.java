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
public class J02035_QuayPhai {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            long[] a = new long[n];
            long[] b = new long[n];
            for(int i = 0; i < n; ++i){
                a[i] = sc.nextLong();
                b[i] = a[i];
            }
            Arrays.sort(b);
            int idx = 0;
            
            for(int i = 0; i < n; ++i){
                if(a[i] == b[0]){
                    idx = i;
                    break;
                }
            }
            System.out.println(idx);
        }
    }
}
