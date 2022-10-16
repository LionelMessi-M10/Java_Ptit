/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Mang;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class J02102_MaTranXoayOcTangDan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[] x = new int[n*n];
        
        for(int i = 0; i < n*n; ++i){
            x[i] = sc.nextInt();
        }
        
        Arrays.sort(x);
        
        int cnt = 0;
        
        /*
        - h1: Dong ben tren cung.
        - h2: Dong duoi cung.
        - c1: Cot ben trai.
        - c2: Cot ben phai.
         */
        
        int[][] a = new int[n][n];
        int h1 = 0, h2 = n - 1, c1 = 0, c2 = n - 1;
        
        while (h1 <= h2 && c1 <= c2) {
            // Xay dung dong tren cung
            for (int i = c1; i <= c2; ++i) {
                a[h1][i] = x[cnt];
                ++cnt;
            }
            
            // Tang hang de in hang tiep theo.
            ++h1;
            
            // Xay dung cot ben phai ngoai cung.
            for (int i = h1; i <= h2; ++i) {
                a[i][c2] = x[cnt];
                ++cnt;
            }
            
            // Xay dung cot ben phai o trong.
            --c2;

            // Neu cot thoa man chua gan het.
            if (c1 <= c2) {
                // Xay dung dong duoi cung.
                for (int i = c2; i >= c1; --i) {
                    a[h2][i] = x[cnt];
                    ++cnt;
                }
                --h2;
            }
            
            // Xay dung cot ben trai.
            if (h1 <= h2) {
                for (int i = h2; i >= h1; --i) {
                    a[i][c1] = x[cnt];
                    ++cnt;
                }
                ++c1;
            }
        }

        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n; ++j) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
