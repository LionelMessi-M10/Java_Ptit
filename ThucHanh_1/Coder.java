/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ThucHanh_1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Coder {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DAYSO.in"));
        
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int[] a = new int[n];
            
            for(int i = 0; i < n; ++i){
                a[i] = sc.nextInt();
            }
            
            Arrays.sort(a);
            
            int so1 = 0, so2 = 0;
            
            for(int i = 0; i < n; ++i){
                if(i % 2 == 0) so1 = so1 * 10 + a[i];
                else so2 = so2 * 10 + a[i];
            }
            
            System.out.println(so1 + so2);
        }
    }
}
