/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Xau_Ky_Tu;

import java.util.Scanner;

/**
7
29T1–123.45
29T1–555.55
29T1–222.33
29T1–686.88
29T1–123.33
29T1–555.54
29T1–606.88
 * @author ADMIN
 */
public class J03040_BienSoDep {
    
    public static boolean check(String s){
        for(int i = 0; i < s.length(); ++i){
            if(Character.isAlphabetic(s.charAt(i))) return false;
        }
        return true;
    }
    
    public static boolean check1(String s){
        for(int i = 1; i < s.length(); ++i){
            if(s.charAt(i) - '0' <= s.charAt(i-1) - '0') return false;
        }
        return true;
    }
    
    public static boolean check2(String s){
        for(int i = 0; i < s.length() - 1; ++i){
            if(s.charAt(i) != s.charAt(i + 1)) return false;
        }
        return true;
    }
    
    public static boolean check3(String s){
        for(int i = 0; i <= 1; ++i){
            if(s.charAt(i) != s.charAt(i + 1)) return false;
        }
        
        for(int i = 3; i < s.length()-1; ++i){
            if(s.charAt(i) != s.charAt(i + 1)) return false;
        }
        return true;
    }
    
    public static boolean check4(String s){
        for(int i = 0; i < s.length(); ++i){
            if(s.charAt(i) != '6' && s.charAt(i) != '8') return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int test = sc.nextInt();
        sc.nextLine();
        while (test-- > 0) {
            String s = sc.nextLine();

            String tmp = "";

            for(int i = 5; i < s.length(); ++i) tmp += s.charAt(i);
            
            String res = "";
            
            for(int i = 0; i < tmp.length(); ++i){
                if(tmp.charAt(i) != '.') res += tmp.charAt(i);
            }
            
//            System.out.println(res);
            
            if(check1(res) || check2(res) || check3(res) || check4(res)){
                System.out.println("YES");
            }
            else System.out.println("NO");
        }
    }
}
