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
public class SapXepNoiBot {
    
    public static void bubleSort(int[] a, int n){
        for(int i = 0; i < n-1; ++i){
            boolean ok = false;
            
            for(int j = 0; j < n-i-1; ++j){
                if(a[j] > a[j+1]){
                    int tmp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = tmp;
                    ok = true;
                }
            }
            
            if(ok){
                System.out.print("Buoc " + (i+1) + ": ");
                for(int k = 0; k < n; ++k){
                    System.out.print(a[k] + " ");
                }
                System.out.println("");
            }
            else break;
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[] a = new int[n];
        
        for(int i = 0; i < n; ++i){
            a[i] = sc.nextInt();
        }
        
        bubleSort(a, n);
    }
}
