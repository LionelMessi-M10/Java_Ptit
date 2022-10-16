/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Java_Collections;

import java.util.Scanner;
import java.util.Stack;

/**
2
[()]{}{[()()]()}
[(])
 * @author ADMIN
 */
public class J08020_KiemTraDayNgoacDung {
    
    public static boolean check(char s){
        if(s == '[' || s == '(' || s == '{') return true;
        return false;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        while(t-- > 0){
            String s = sc.next();
            
            Stack<Character> st = new Stack<>();
            
            boolean ok = true;
            
            for(int i = 0; i < s.length(); ++i){
                if(check(s.charAt(i))) st.push(s.charAt(i));
                else{
                    if(st.isEmpty()) ok = false;
                    else{
                        if(s.charAt(i) == ')'){
                            if(st.peek() == '(') st.pop();
                            else ok = false;
                        }
                        if(s.charAt(i) == '}'){
                            if(st.peek() == '{') st.pop();
                            else ok = false;
                        }
                        if(s.charAt(i) == ']'){
                            if(st.peek() == '[') st.pop();
                            else ok = false;
                        }
                    }
                }
            }
            
            if(ok) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
