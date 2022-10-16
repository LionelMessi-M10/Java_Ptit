/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Xau_Ky_Tu;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class J03030_BienDoiA_B {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char[] a = s.toCharArray();
        int count = 0;
        for (int i = 1; i < s.length() - 1; i++) {
            if (a[i - 1] == 'A' && a[i] == 'B' && a[i + 1] == 'A') {
                a[i] = 'A';
                count++;
            }
            if (a[i - 1] == 'B' && a[i] == 'A' && a[i + 1] == 'B') {
                a[i] = 'B';
                count++;
            }
        }
        if (a[0] == 'B' && a[1] == 'A') {
            a[0] = 'A';
            count++;
        }
        if (a[s.length() - 2] == 'A' && a[s.length() - 1] == 'B') {
            a[s.length() - 1] = 'A';
            count++;
        }
        for (int i = 0; i < s.length() - 1; i++) {
            if (a[i] != a[i + 1]) {
                count++;
            }
        }
        if (a[0] == 'A' && a[s.length() - 1] == 'B') {
            count++;
        }
        if (a[0] == 'B' && a[s.length() - 1] == 'B') {
            count++;
        }
        System.out.println(count);
    }
}
