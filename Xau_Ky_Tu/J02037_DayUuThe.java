/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Xau_Ky_Tu;

import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * 2
 * 11 22 33 44 55 66 77 23 34 45 56 67 78 89 90 121 131 141 151 161 171
 *
 * @author ADMIN
 */
public class J02037_DayUuThe {

    public static int chuyen(String s) {
        int sum = 0;
        for (int i = 0; i < s.length(); ++i) {
            sum = sum * 10 + (s.charAt(i) - '0');
        }
        return sum;
    }

    public static boolean check(int[] a, int n) {
        int chan = 0, le = 0;
        for (int i = 0; i < n; ++i) {
            if (a[i] % 2 == 0) {
                ++chan;
            } else {
                ++le;
            }
        }
        if (n % 2 == 0) {
            return chan > le;
        } else {
            return le > chan;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            String s = sc.nextLine();
            int n = 0;
            int[] a = new int[201];

            StringTokenizer st = new StringTokenizer(s);

            while (st.hasMoreTokens()) {
                String tmp = st.nextToken();
                a[n++] = chuyen(tmp);
            }

            if (check(a, n)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
