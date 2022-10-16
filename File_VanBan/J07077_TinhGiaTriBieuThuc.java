/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package File_VanBan;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author ADMIN
 */
public class J07077_TinhGiaTriBieuThuc {
    
    public static long tinhToan(long a, long b, char c){
        long ans = 0;
        if(c == '+'){
            ans = a + b;
        }
        else if(c == '-'){
            ans = a - b;
        }
        else if(c == '*'){
            ans = a * b;
        }
        else if(c == '/') ans = a / b;
        return ans;
    }
    
    public static int doUuTien(char c){
        int ans = -1;
        if(c == '(') ans = 0;
        else if(c == '+' || c == '-'){
            ans = 1;
        }
        else if(c == '*' || c == '/'){
            ans = 2;
        }
        return ans;
    }
    
    public static void solve(String s){
        Stack<Character> st1 = new Stack<>();
        Stack<Long> st2 = new Stack<>();
    
        for(int i = 0; i < s.length(); ++i){
            if(s.charAt(i) == '('){
                st1.push(s.charAt(i));
            }
            else if(Character.isDigit(s.charAt(i))){
                long tmp = 0;
                while(i < s.length() && Character.isDigit(s.charAt(i))){
                    tmp = tmp * 10 + (s.charAt(i) - '0');
                    ++i;
                }
                st2.push(tmp);
                --i;
            }
            else if(s.charAt(i) == ')'){
                while(!st1.isEmpty() && st1.peek() != '('){
                    long x = st2.peek();
                    st2.pop();
                    long y = st2.peek();
                    st2.pop();
                    
                    st2.push(tinhToan(y, x, st1.peek()));
                    st1.pop();
                }
                st1.pop();
            }
            else{
                while (!st1.isEmpty() && doUuTien(st1.peek()) >= doUuTien(s.charAt(i))){
                    long x = st2.peek();
                    st2.pop();
                    long y = st2.peek();
                    st2.pop();
                    st2.push(tinhToan(y, x, st1.peek()));
                    st1.pop();
                }
                st1.push(s.charAt(i));
            }
        }
        
        while(!st1.isEmpty()){
            long x = st2.peek();
            st2.pop();
            long y = st2.peek();
            st2.pop();
            st2.push(tinhToan(y, x, st1.peek()));
            st1.pop(); 
        }
        
        System.out.println(st2.peek());
    }
    
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("BIEUTHUC.in"));
        
        int t = sc.nextInt();
        while(t-- > 0){
            String s = sc.next();
            solve(s);
        }
    }
}
