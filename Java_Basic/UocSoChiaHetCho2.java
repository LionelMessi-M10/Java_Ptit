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

public class UocSoChiaHetCho2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            long cnt = 0;
            if(n % 2 == 0) ++cnt;
            for(int i = 2; i <= Math.sqrt(n); ++i){
                if(n % i == 0){
                    if(i % 2 == 0){
                        if(i != n/i && (n / i) % 2 == 0) cnt += 2;
                        else ++cnt;
                    }
                    else{
                        if((n/i) % 2 == 0) ++cnt;
                    }
                }
            }
            System.out.println(cnt);
        }
    }
}
