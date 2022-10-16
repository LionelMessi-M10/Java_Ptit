/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Java_Collections;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class J08024_So0VaSo9 {

    public static String load(int n) {
        Queue<String> X = new LinkedList<>();
        X.add("9");
        while (!X.isEmpty()) {
            String a = X.peek();
            X.poll();
            long x = 0;
            for (int i = 0; i < a.length(); i++) {
                x = x * 10 + a.charAt(i) - 48;
                x %= n;
            }
            if (x == 0) {
                return a;
            }
            X.add(a + "0");
            X.add(a + "9");
        }
        return "";
    }

    public static void main(String[] args) {
        Scanner sacn = new Scanner(System.in);
        int t = sacn.nextInt();
        while (t-- > 0) {
            int n = sacn.nextInt();
            System.out.println(load(n));
        }
    }
}
