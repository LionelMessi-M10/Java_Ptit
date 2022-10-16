/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Mang;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author ADMIN
 */
public class GiaoCuaHaiDaySo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        Set<Integer> set1 = new TreeSet<>();
        Set<Integer> set2 = new TreeSet<>();
        
        for(int i = 0; i < n; ++i){
            int x = sc.nextInt();
            set1.add(x);
        }
        
        for(int i = 0; i < m; ++i){
            int x = sc.nextInt();
            set2.add(x);
        }
        
        for(int x : set1){
            if(set2.contains(x)){
                System.out.print(x + " ");
            }
        }
    }
}
