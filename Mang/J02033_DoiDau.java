/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Mang;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class J02033_DoiDau {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Queue<Integer> q = new PriorityQueue<>();
        
        int n = sc.nextInt(), k = sc.nextInt();
        Integer[] a = new Integer[n];
        
        for(int i = 0; i < n; ++i){
            a[i] = sc.nextInt();
            q.add(a[i]);
        }
        
        while(k-- > 0){
            int x = q.poll();
            x = -x;
            q.add(x);
        }
        
        long sum = 0;
        while(!q.isEmpty()){
            sum += q.poll();
        }
        
        System.out.println(sum);
    }
}
