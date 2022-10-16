/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Xau_Ky_Tu;

import java.util.Scanner;

/**
2
010010
1011110000
 * @author ADMIN
 */
public class Test {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        while(t-- > 0){
            String s = sc.next();
            String tmp = s.replaceAll("100", "");
            System.out.println(s.length() - tmp.length());
        }
    }
}
