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
public class J02014_DiemCanBang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int[] a = new int[n];
            
            for(int i = 0; i < n; ++i){
                a[i] = sc.nextInt();
            }
            
            int sum = 0, left = 0, idx = -1;
            
            for(int i = 0; i < n; ++i){
                sum += a[i];
            }
            
            for(int i = 0; i < n; ++i){
                sum -= a[i];
                
                if(sum == left){
                    idx = i;
                    break;
                }                
                left += a[i];
            }
            if(idx == -1) System.out.println(idx);
            else System.out.println(idx + 1);
        }
    }
}
