/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Xau_Ky_Tu;

import java.util.Scanner;

/**
 * @author ADMIN
 */
public class J03007_SoDep_2 {
    
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- > 0){
            String s = sc.nextLine();
            if(thuanNghich(s) && tongCs(s)){
                System.out.println("YES");
            }
            else System.out.println("NO");
        }
    }

    public static boolean thuanNghich(String s) {
        if(s.charAt(0) != '8' || s.charAt(s.length() - 1) != '8') {
            return false;
        }
        for(int i = 0; i < s.length(); ++i){
            if(s.charAt(i) != s.charAt(s.length() - 1 - i)) return false;
        }
        return true;
    }

    public static boolean tongCs(String s) {
        int sum = 0;
        for(int i = 0; i < s.length(); ++i){
            sum += (int)(s.charAt(i) - '0');
        }
        return sum % 10 == 0;
    }
}
