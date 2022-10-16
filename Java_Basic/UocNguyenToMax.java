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
public class UocNguyenToMax {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        while(t-- > 0){
            long n = sc.nextLong();
            long res = 2;
            for(int i = 2; i <= Math.sqrt(n); ++i){
                while(n % i == 0){
                    res = i;
                    n /= i;
                }
            }
            if(n != 1) res = n;
            System.out.println(res);
        }
    }
}
