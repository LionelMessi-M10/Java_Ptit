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
public class SoChinhPhuong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int can = (int) Math.sqrt(n);
            if(can * can == n) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
