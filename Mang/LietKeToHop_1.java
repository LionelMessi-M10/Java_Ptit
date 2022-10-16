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
public class LietKeToHop_1 {
    
    static int n, k;
    static int cnt = 0;
    static int [] a = new int[1001];
    
    public static void ktao(){
        for(int i = 1; i <= n; ++i){
            a[i] = i;
        }
    }
    
    public static void Try(int i){
        for(int j = a[i-1] + 1; j <= n-k+i; ++j){
            a[i] = j;
            if(i == k){
                ++cnt;
                for(int l = 1; l <= k; ++l){
                    System.out.print(a[l] + " ");
                }
                System.out.println("");
            }
            else Try(i + 1);
        }
    }
    
    public static void inp(){
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        k = sc.nextInt();
        ktao();
        Try(1);
        System.out.println("Tong cong co " + cnt + " to hop");
    }
    
    public static void main(String[] args) {
        inp();
    }
}
