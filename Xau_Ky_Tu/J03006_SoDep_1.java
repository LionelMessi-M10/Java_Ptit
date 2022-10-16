/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Xau_Ky_Tu;

import java.util.Scanner;

/**
4
123456787654321
86442824468
8006000444422220000222244440006008
235365789787654324567856578654356786556
 * @author ADMIN
 */
public class J03006_SoDep_1 {
    
    public static boolean thuanNghich(String s){
        for(int i = 0; i < s.length(); ++i){
            if(s.charAt(i) != s.charAt(s.length() - 1 - i)) return false;
        }
        return true;
    }
    
    public static boolean chuSo(String s){
        for(int i = 0; i < s.length(); ++i){
            int tmp = (int)(s.charAt(i) - '0');
            if(tmp % 2 == 1) return false;
        }
        return true;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- > 0){
            String number = sc.nextLine();
            if(thuanNghich(number) && chuSo(number)){
                System.out.println("YES");
            }
            else System.out.println("NO");
        }
    }
}
