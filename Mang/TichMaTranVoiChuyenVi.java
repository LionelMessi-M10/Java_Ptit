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
public class TichMaTranVoiChuyenVi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int tes = 1; tes <= t; ++tes){
            int n = sc.nextInt();
            int m = sc.nextInt();
            
            int[][] a = new int[n][m];
            int[][] b = new int[m][n];
            int[][] c = new int[n][n];
            
            for(int i = 0; i < n; ++i){
                for(int j = 0; j < m; ++j){
                    a[i][j] = sc.nextInt();
                    b[j][i] = a[i][j];
                }
            }
            
            for(int i = 0; i < n; ++i){
                for(int j = 0; j < n; ++j){
                    for(int k = 0; k < m; ++k){
                        c[i][j] += 1l * a[i][k]*b[k][j];
                    }
                }
            }
            
            System.out.println("Test " + tes + ":");
            for(int i = 0; i < n; ++i){
                for(int j = 0; j < n; ++j){
                    System.out.print(c[i][j] + " ");
                }
                System.out.println("");
            }
            
            System.out.println("");
        }
    }
}
