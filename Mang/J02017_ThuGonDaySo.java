/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Mang;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author ADMIN
 */
public class J02017_ThuGonDaySo {

    public static int slove(int a[], int n) {
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < n; i++) {
            if (st.empty() || (a[i] + st.peek()) % 2 != 0) {
                st.push(a[i]);
            } 
            else {
                st.pop();
            }
        }
        return st.size();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println(slove(a, n));
    }
}
