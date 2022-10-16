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
public class CatDoi {
    
    public static boolean check(String s){
        for(int i = 0; i < s.length(); ++i){
            if(s.charAt(i) != '0' && s.charAt(i) != '1' && s.charAt(i) != '8' && s.charAt(i) != '9'){
                return false;
            }
        }
        return true;
    }
    
    public static boolean check1(String s){
        for(int i = 0; i < s.length(); ++i){
            if(s.charAt(i) == '1') return true;
        }
        return false;
    }
    
    public static String catSo(String s){
        String ans = "";
        if(!check(s)) return "INVALID";
        else{
            if(!check1(s)) return "INVALID";
            else{
                int idx = -1;
                for(int i = 0; i < s.length(); ++i){
                    if(s.charAt(i) == '1'){
                        idx = i;
                        break;
                    }
                }
                for(int i = idx; i < s.length(); ++i){
                    if(s.charAt(i) == '1') ans += "1";
                    else ans += "0";
                }
            }
        }
        return ans;
    }
    
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        
        int t = sc.nextInt();
        while(t-- > 0){
            String s = sc.next();
            System.out.println(catSo(s));
        }
    }
}

/*
3
1890
3681
8919
*/
