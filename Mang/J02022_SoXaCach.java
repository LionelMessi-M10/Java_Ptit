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
public class J02022_SoXaCach {
    
    static int n;
    static int[] x = new int[1001];
    static boolean[] check = new boolean[1001];
    
    public static void in(){
        for(int i = 1; i <= n; ++i){
            System.out.print(x[i]);
        }
        System.out.println("");
    }
    
    public static boolean check(){
        for(int i = 1; i <= n-1; ++i){
            if(Math.abs(x[i] - x[i+1]) == 1) return false;
        }
        return true;
    }
    
    public static void Try(int i){
        for(int j = 1; j <= n; ++j){
            if(check[j] == false){
                x[i] = j;
                check[j] = true;
                if(i == n){
                    if(check()){
                        in();
                    }
                }
                else Try(i + 1);
                check[j] = false;
            }
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        while(t-- > 0){
            n = sc.nextInt();
            Try(1);
        }
    }
}
