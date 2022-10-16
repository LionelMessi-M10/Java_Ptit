/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Java_Collections;

import java.util.Arrays;
import java.util.Scanner;

/**
4
4 6
1 5 7 -1
5 6
1 5 7 -1 5
4 2
1 1 1 1
13 11
10 12 10 15 -1 7 6 5 4 2 1 1 1
 *
 * @author ADMIN
 */
public class J08015_CapSoCoTongBangK {

    public static int dau(int[] a, int l, int r, int x) {
        int idx = -1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (a[mid] == x) {
                idx = mid;
                r = mid - 1;
            } else if (a[mid] > x)
                r = mid - 1;
            else
                l = mid + 1;
        }
        return idx;
    }

    public static int cuoi(int[] a, int l, int r, int x) {
        int idx = -1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (a[mid] == x) {
                idx = mid;
                l = mid + 1;
            } else if (a[mid] < x)
                l = mid + 1;
            else
                r = mid - 1;
        }
        return idx;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();

            int[] a = new int[n];
            for (int i = 0; i < n; ++i) {
                a[i] = sc.nextInt();
            }

            Arrays.sort(a);

            long cnt = 0;

            for (int i = 0; i < n-1; ++i) {
                int idx1 = dau(a, i + 1, n - 1, k - a[i]);
                int idx2 = cuoi(a, i + 1, n - 1, k - a[i]);
                if (idx1 != -1) {
                    cnt += (idx2 - idx1 + 1);
                }
            }

            System.out.println(cnt);
        }
    }
}
