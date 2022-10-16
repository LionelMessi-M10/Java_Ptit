/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Xau_Ky_Tu;

import java.util.Scanner;

/**
3
123456787654321
235755557532
2222333355557777235775327777555533332222
 * @author ADMIN
 */
public class J03008_SoDep_3 {
    
    public static boolean thuanNghich(String s) {
        for(int i = 0; i < s.length(); ++i){
            if(s.charAt(i) != s.charAt(s.length() - 1 - i)) return false;
        }
        return true;
    }
    
    public static boolean chuSo(String s){
        for(int i = 0; i < s.length(); ++i){
            char tmp = s.charAt(i);
            if(tmp != '2' && tmp != '3' && tmp != '5' && tmp != '7') return false;
        }
        return true;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- > 0){
            String s = sc.nextLine();
            if(thuanNghich(s) && chuSo(s)){
                System.out.println("YES");
            }
            else System.out.println("NO");
        }
    }
}
