/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Java_Basic;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class TinhLuyThua {

    static int mod = (int) (1e9 + 7);

    public static long powMod(int a, long b) {
        if (b == 0) {
            return 1;
        }

        long mu = powMod(a, b / 2);
        if (b % 2 == 1) {
            return (mu % mod * mu % mod) * a % mod;
        }
        return (mu % mod * mu % mod) % mod;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int a = sc.nextInt();
            long b = sc.nextLong();
            if (a + b == 0) {
                break;
            } 
            else {
                System.out.println(powMod(a, b));
            }
        }
    }
}
