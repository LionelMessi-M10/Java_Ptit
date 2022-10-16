/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Mang;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class J02027_KhoangCachNhoHonK {
    
    public static int find(int []a, int l, int r, int x){
        int idx = -1;
        while(l <= r){
            int mid = (l + r) / 2;
            if(a[mid] < x){
                idx = mid;
                l = mid + 1;
            }
            else r = mid - 1;
        }
        return idx;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            
            int[] a = new int[n];
            for(int i = 0; i < n; ++i){
                a[i] = sc.nextInt();
            }
            Arrays.sort(a);
            
            long res = 0;
            
            for(int i = 0; i < n; ++i){
                int idx = find(a, i+1, n-1, k + a[i]);
                if(idx != -1) res += (idx - i);
            }
            
            System.out.println(res);
        }
    }
}
