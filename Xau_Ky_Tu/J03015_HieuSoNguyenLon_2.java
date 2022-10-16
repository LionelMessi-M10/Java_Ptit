/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Xau_Ky_Tu;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class J03015_HieuSoNguyenLon_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        String num1 = in.next();
        String num2 = in.next();
        
        BigInteger a = new BigInteger(num1);
        BigInteger b = new BigInteger(num2);
        
        BigInteger kq = a.subtract(b);
        System.out.println(kq);
    }
}

/*
2
978
12977
100
1000000
*/
