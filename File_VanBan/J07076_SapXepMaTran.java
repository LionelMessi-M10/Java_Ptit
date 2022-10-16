/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package File_VanBan;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class J07076_SapXepMaTran {

    public static void main(String[] args) throws IOException {
        File file = new File("MATRIX.in");
        Scanner sc = new Scanner(file);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt(), m = sc.nextInt(), k = sc.nextInt();
            k--;
            int q = k;
            Integer a[][] = new Integer[n][m];
            int b[][] = new int[n][m];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    b[i][j] = sc.nextInt();
                    a[i][j] = b[i][j];
                }
            }
            Arrays.sort(a, new Comparator<Integer[]>() {
                @Override
                public int compare(Integer[] t, Integer[] t1) {
                    return t[q] - t1[q];
                }

            });
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (j == k) {
                        System.out.print(a[i][j] + " ");
                    } else {
                        System.out.print(b[i][j] + " ");
                    }
                }
                System.out.println("");
            }
        }
    }
}
