/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Java_Basic;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class SoLienKe {
    
    public static boolean check(String s){
        for(int i = 1; i < s.length(); ++i){
            if(Math.abs((s.charAt(i) - '0') - (s.charAt(i-1) - '0')) != 1){
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            String s = sc.next();
            if(check(s)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
