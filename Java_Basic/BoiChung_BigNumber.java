/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Java_Basic;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class BoiChung_BigNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String n1 = sc.next();
            String n2 = sc.next();
            
            BigInteger a = new BigInteger(n1);
            BigInteger b = new BigInteger(n2);
            
            BigInteger res = a.multiply(b).divide(a.gcd(b));
            
            System.out.println(res);
        }
    }
}
