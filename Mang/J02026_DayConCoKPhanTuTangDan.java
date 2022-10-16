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
public class J02026_DayConCoKPhanTuTangDan {
    static int n, k;
    static int[] a = new int[1001];
    static int[] x = new int[1001];

    public static void Try(int i){
        for(int j = x[i-1] + 1; j <= n-k+i; ++j){
            x[i] = j;
            if(i == k){
                for(int l = 1; l <= k; ++l){
                    System.out.print(a[x[l]] + " ");
                }
                System.out.println();
            }
            else Try(i + 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            n = sc.nextInt();
            k = sc.nextInt();

            for(int i = 1; i <= n; ++i){
                a[i] = sc.nextInt();
            }
            
            for(int i = 1; i <= n-1; ++i){
                for(int j = i+1; j <= n; ++j){
                    if(a[i] > a[j]){
                        int tmp = a[i];
                        a[i] = a[j];
                        a[j] = tmp;
                    }
                }
            }

            for(int i = 1; i <= k; ++i){
                x[i] = i;
            }
            Try(1);
            System.out.println();
        }
    }
}
