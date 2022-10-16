/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Mang;

import java.util.Scanner;
import java.util.TreeMap;

/**
3
6 33
1 4 20 3 10 5
7 7
1 4 0 0 3 10 5
2 0
1 4
 * @author ADMIN
 */
public class J02028_DayConLienTiepTongBangk {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            long k = sc.nextLong();
            
            int[] a = new int[n];
            for(int i = 0; i < n; ++i){
                a[i] = sc.nextInt();
            }
            
            boolean ok = false;
            
            TreeMap<Long, Integer> map = new TreeMap<>();
            
            long sum = 0;
            
            for(int i = 0; i < n; ++i){
                sum += a[i];
                
                // Check sum == k thì ok = True, còn sum - k là tổng trước đó của sum thì khi đó
                // sum(hiện tại) + (sum - k) = k <=> sum = k thì ok = True
                if(sum == k || map.containsKey(sum-k)){
                    ok = true;
                    break;
                }
                map.put(sum, 1);
            }
            
            if(ok) System.out.println("YES");
            else System.out.println("NO");
            
            map.clear();
        }
    }
}
