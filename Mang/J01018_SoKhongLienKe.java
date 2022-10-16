/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Mang;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class J01018_SoKhongLienKe {
    
    public static boolean check(String s){
        int sum = s.charAt(0) - '0';
        for(int i = 1; i < s.length(); ++i){
            if(Math.abs((s.charAt(i) - '0') - (s.charAt(i-1) - '0')) != 2){
                return false;
            }
            sum += (s.charAt(i) - '0');
        }
        return sum % 10 == 0;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        while(t-- > 0){
            String s = sc.next();
            
            if(s.length() < 3){
                System.out.println("NO");
            }
            else{
                if(check(s)){
                    System.out.println("YES");
                }
                else System.out.println("NO");
            }
        }
    }
}
