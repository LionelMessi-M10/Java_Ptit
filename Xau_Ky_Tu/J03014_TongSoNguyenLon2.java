/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Xau_Ky_Tu;

import java.math.BigDecimal;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class J03014_TongSoNguyenLon2 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        String a = sc.next();
        String b = sc.next();
        
        BigDecimal x = new BigDecimal(a);
        BigDecimal y = new BigDecimal(b);
        
        System.out.println(x.add(y));
        
    }
}
