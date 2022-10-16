/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Java_Collections;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class HinhSao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] cnt = new int[100001];
        
        int n = sc.nextInt();
        for(int i = 1; i <= n-1; ++i){
            int x = sc.nextInt();
            int y = sc.nextInt();
            cnt[x]++;
            cnt[y]++;
        }
        
        int count = 0;
        for(int i = 1; i < 100001; ++i){
            if(cnt[i] == n-1) ++count;
        }
        if(count == 1) System.out.println("Yes");
        else System.out.println("No");
    }
}
