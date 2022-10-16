/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Java_Collections;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
3
2 5
3 7
7 4
 * @author ADMIN
 */



public class J08026_BienDoiS_T {
    
    private static int solve(int s, int t) {
        Queue <Integer> q = new LinkedList<>();
        int[] a = new int[20001];
        q.add(s);
        while(!q.isEmpty()){
            int top = q.poll();
            if(top == t){
                return a[t];
            }
            if(2*top < 20000 && a[2*top] == 0){
                q.add(2*top);
                a[2*top] = a[top] + 1;
            }
            if(top - 1 > 0 && a[top - 1] == 0){
                q.add(top - 1);
                a[top - 1] = a[top] + 1;
            }
        }
        return 0;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test-- > 0){
            int s = sc.nextInt(), t = sc.nextInt();
            System.out.println(solve(s, t));
        }
    }
}
