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
public class SapXepChon {
    
    public static void selectionSort(int []a, int n){
        for(int i = 0; i < n-1; ++i){
            int min_idx = i;
            for(int j = i+1; j < n; ++j){
                if(a[j] < a[min_idx]){
                    min_idx = j;
                }
            }
            
            int tmp = a[i];
            a[i] = a[min_idx];
            a[min_idx] = tmp;
            
            System.out.print("Buoc " + (i+1) + ": ");
            for(int k = 0; k < n; ++k){
                System.out.print(a[k] + " ");
            }
            System.out.println("");
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[] a = new int[n];
        
        for(int i = 0; i < n; ++i){
            a[i] = sc.nextInt();
        }
        
        selectionSort(a, n);
    }
}
