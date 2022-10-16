/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Java_Basic;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class TongGiaiThua {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        long[] gt = new long[21];
        
        gt[0] = 1;
        
        for(int i = 1; i <= 20; ++i){
            gt[i] = gt[i-1] * i;
        }
        
        int n = sc.nextInt();
        long res = 0;
        for(int i = 1; i <= n; ++i){
            res += gt[i];
        }
        System.out.println(res);
    }
}
