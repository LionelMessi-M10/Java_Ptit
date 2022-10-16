/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Xau_Ky_Tu;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class J03024_SoUuThe {
    
    public static boolean checkSo(String s){
        for(int i = 0; i < s.length(); ++i){
            if(!Character.isDigit(s.charAt(i))) return false;
        }
        return true;
    }
    
    public static boolean SoUuThe(String s){
        int cnt1 = 0;
        int cnt2 = 0;
        for(int i = 0; i < s.length(); ++i){
            if((s.charAt(i) - '0') % 2 == 0) ++cnt1;
            else ++cnt2;
        }
        if(s.length() % 2 == 0) return cnt1 > cnt2;
        return cnt2 > cnt1;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- > 0){
            String s = sc.nextLine();
            if(!checkSo(s)) System.out.println("INVALID");
            else{
                if(SoUuThe(s)) System.out.println("YES");
                else System.out.println("NO");
            }
        }
    }
}
