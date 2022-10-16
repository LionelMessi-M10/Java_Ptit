/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Xau_Ky_Tu;

import java.math.BigInteger;
import java.util.Scanner;

/**
2
18 7
3 123
 * @author ADMIN
 */
public class J03039_ChiaHet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        while(t-- > 0){
            BigInteger num1 = sc.nextBigInteger();
            BigInteger num2 = sc.nextBigInteger();
            
            BigInteger num3 = num1, num4 = num2;
            
            num1 = num1.max(num2);
            num2 = num3.min(num4);
            
            BigInteger du = num1.divide(num2);
            

            if(du.multiply(num2).compareTo(num1) == 0){
                System.out.println("YES");
            }
            else System.out.println("NO");

        }
    }
}
