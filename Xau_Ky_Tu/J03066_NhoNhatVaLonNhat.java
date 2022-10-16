/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Xau_Ky_Tu;

import java.math.BigInteger;
import java.util.Scanner;

/**
5
1
2
3
4
5
3
001
22
33333333333333333333333333333333333
3
1
1
1
0
 * @author ADMIN
 */
public class J03066_NhoNhatVaLonNhat {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while(true){
            int n = sc.nextInt();
            if(n == 0) break;
            else{
                BigInteger max1 = new BigInteger(String.format("-1%099d", 0));
                BigInteger min1 = new BigInteger(String.format("1%099d", 0));
                sc.nextLine();
                for(int i = 1; i <= n; ++i){
                    BigInteger tmp = new BigInteger(sc.nextLine());
                    max1 = max1.max(tmp);
                    min1 = min1.min(tmp);
                }
                if(max1 == min1) System.out.println("BANG NHAU");
                else System.out.println(min1 + " " + max1);
            }
        }
    }
}
