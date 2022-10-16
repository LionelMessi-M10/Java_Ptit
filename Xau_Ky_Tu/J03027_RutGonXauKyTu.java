/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Xau_Ky_Tu;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author ADMIN
 */
public class J03027_RutGonXauKyTu {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        
        Stack<String> st = new Stack<>();
        
        for(int i = 0; i < s.length(); ++i){
            String tmp = "";
            tmp += s.charAt(i);
            if(st.isEmpty() || !tmp.equals(st.peek())){
                st.push(tmp);
            }
            else st.pop();
        }
        if(st.isEmpty()){
            System.out.println("Empty String");
        }
        else{
            String ans = "";
            while(!st.isEmpty()){
                ans = st.peek() + ans;
                st.pop();
            }
            System.out.println(ans);
        }
    }
}
