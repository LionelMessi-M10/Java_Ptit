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
public class BoSungDaySo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[] a = new int[n];
        
        int[] cnt = new int[201];
        
        for(int i = 0; i < n; ++i){
            a[i] = sc.nextInt();
            cnt[a[i]]++;
        }
        
        boolean ok = false;
        
        for(int i = 1; i < a[n-1]; ++i){
            if(cnt[i] == 0){
                System.out.println(i);
                ok = true;
            }
        }
        
        if(!ok) System.out.println("Excellent!");
        
    }
}
