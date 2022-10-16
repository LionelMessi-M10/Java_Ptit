/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Xau_Ky_Tu;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class J07008_DayConTangDan {

    static int n;
    static int[] a = new int[1001];
    static int[] x = new int[1001];
    static String[] res = new String[1000001];
    static int idx = 0;

    public static String chuyen(int s) {
        String tmp = "";
        while (s != 0) {
            tmp = Integer.toString(s % 10) + tmp;
            s /= 10;
        }
        return tmp;
    }

    public static void Try(int i, int pos) {
        for (int j = pos; j <= n; ++j) {
            if (x[i - 1] < a[j]) {
                x[i] = a[j];
                if (i > 1) {
                    String tmp = "";
                    for (int k = 1; k <= i; ++k) {
                        tmp += chuyen(x[k]);
                        tmp += " ";
                    }
                    res[idx++] = tmp;
                }
                Try(i + 1, j + 1);
            }
        }
    }

    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("DAYSO.in");
        Scanner sc = new Scanner(file);

        while (sc.hasNextInt()) {
            n = sc.nextInt();
            for (int i = 1; i <= n; ++i) {
                a[i] = sc.nextInt();
            }
            Try(1, 1);

            ArrayList<String> arr = new ArrayList<>();

            for (int i = 0; i < idx; ++i) {
                arr.add(res[i]);
            }

            Collections.sort(arr);

            for (String it : arr) {
                System.out.println(it);
            }
            
            arr.clear();
        }

    }
}
