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
public class DemSoLanXuatHien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        
        for(int tes = 1; tes <= t; ++tes){
            int n = sc.nextInt();
            int[] a = new int[n];
            
            int[] cnt = new int[100001];
            
            for(int i = 0; i < n; ++i){
                a[i] = sc.nextInt();
                cnt[a[i]]++;
            }
            
            System.out.println("Test " + tes + ":");
            
            for(int i = 0; i < n; ++i){
                if(cnt[a[i]] != 0){
                    System.out.println(a[i] + " xuat hien " + cnt[a[i]] + " lan");
                    cnt[a[i]] = 0;
                }
            }
        }
    }
}
