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
public class J02023_LuaChonThamLam {

    public static void So_Min(int n, int s) {
        if (s == 0 || s > 9*n) {
            System.out.print("-1 ");
            return;
        }
        
        int[] res = new int[n];
        --s;
        
        for (int i = n - 1; i >= 1; --i) {
            if (s > 9) {
                res[i] = 9;
                s -= 9;
            } 
            else {
                res[i] = s;
                s = 0;
            }
        }       
        res[0] = s + 1;
        
        for (int i = 0; i < n; ++i) {
            System.out.print(res[i]);
        }
        System.out.print(" ");
    }

    public static void So_Max(int n, int s) {
        if (s == 0 || s > 9 * n) {
            System.out.println("-1");
            return;
        }
        
        int[] res = new int[n];
        for (int i = 0; i < n; ++i) {
            if (s >= 9) {
                res[i] = 9;
                s -= 9;
            } 
            else {
                res[i] = s;
                s = 0;
            }
        }
        
        for (int x : res) {
            System.out.print(x);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), s = sc.nextInt();
        So_Min(n, s);
        So_Max(n, s);
    }
}
