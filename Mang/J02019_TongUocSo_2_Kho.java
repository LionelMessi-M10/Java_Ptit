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
public class J02019_TongUocSo_2_Kho {
    
    static int []a = new int[1000001];
    
    public static void sang(){
        for(int i = 2; i < 1000001; ++i){
            for(int j = 2*i; j <= 1000000; j += i){
                a[j] += i;
            }
        }
        
        a[0] = 0;
        for(int i = 1; i <= 1000000; ++i){
            if(a[i] > i) a[i] = a[i-1] + 1;
            else a[i] = a[i-1];
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        sang();
        
        int x = sc.nextInt();
        int y = sc.nextInt();
        
        System.out.println(a[y] - a[x-1]);
    }
}
