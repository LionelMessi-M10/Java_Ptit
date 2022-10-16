/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Java_Basic;

import java.util.Scanner;

/**
2
?0 ? 12 = 28
40 / ?3 = ??
 *
 * @author ADMIN
 */
public class J01023_ToanLopBa {

    static int n = 0, ok = 0;
    static int[] a = new int[12];
    static String equ1, res;

    public static void check() {
        int id = 0;
        StringBuilder tmp = new StringBuilder(equ1);
        for (int i = 0; i < 12; ++i) {
            if (tmp.charAt(i) == '?') {
                tmp.replace(i, i + 1, Character.toString((char) (a[id] + '0')));
                ++id;
            }
        }
        int num1 = (tmp.charAt(0) - '0') * 10 + tmp.charAt(1) - '0';
        int num2 = (tmp.charAt(5) - '0') * 10 + tmp.charAt(6) - '0';
        int ans = (tmp.charAt(10) - '0') * 10 + tmp.charAt(11) - '0';
        if (num1 < 10 || num2 < 10 || ans < 10) {
            return;
        }
        int T = (tmp.charAt(3) == '+') ? num1 + num2 : num1 - num2;
        if (T == ans) {
            ok = 1;
            res = tmp.toString();
        }
    }

    public static void Try(int i) // try tu 0
    {
        if (ok == 1) {
            return;
        }
        for (int j = 0; j <= 9; j++) {
            a[i] = j;
            if (i == n - 1) {
                check();
            } else {
                Try(i + 1);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            equ1 = sc.nextLine();
            
            StringBuilder equ = new StringBuilder(equ1);

            if (equ.charAt(3) == '/' || equ.charAt(3) == '*') {
                System.out.println("WRONG PROBLEM!");
            } 
            else {
                n = 0;
                ok = 0;
                for (int i = 0; i < 12; i++) {
                    if (i != 3 && equ.charAt(i) == '?') {
                        n++;
                    }
                }
                if (n == 0) {
                    if (equ.charAt(3) == '?') {
                        equ.replace(3, 4, "+");
                        equ1 = equ.toString();
                        check();
                        if (ok == 0) {
                            equ.replace(3, 4, "-");
                            equ1 = equ.toString();
                            check();
                        }
                    } 
                    else {
                        equ1 = equ.toString();
                        check();
                    }
                } 
                
                else {
                    if (equ.charAt(3) == '?') {

                        equ.replace(3, 4, "+");
                        equ1 = equ.toString();
                        Try(0);
                        if (ok == 0) {
                            equ.replace(3, 4, "-");
                            equ1 = equ.toString();
                            Try(0);
                        }
                    } 
                    else {
                        equ1 = equ.toString();
                        Try(0);
                    }
                }
                if (ok == 0) {
                    System.out.println("WRONG PROBLEM!");
                } 
                else {
                    System.out.println(res);
                }
            }
        }
    }
}
