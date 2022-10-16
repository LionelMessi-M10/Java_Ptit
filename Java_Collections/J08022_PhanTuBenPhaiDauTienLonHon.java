/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Java_Collections;

import java.util.Scanner;

/**
3
4
4 5 2 25
3
2 2 2
4
4 4 5 5
 *
 * @author ADMIN
 */
public class J08022_PhanTuBenPhaiDauTienLonHon {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];

            for (int i = 0; i < n; ++i) {
                a[i] = sc.nextInt();
            }

            for (int i = 0; i < n - 1; ++i) {
                boolean ok = false;
                for (int j = i + 1; j < n; ++j) {
                    if (a[j] > a[i]) {
                        ok = true;
                        System.out.print(a[j] + " ");
                        break;
                    }
                }
                if(!ok) System.out.print("-1 ");
            }
            System.out.println(-1 + " ");
        }
    }
}
