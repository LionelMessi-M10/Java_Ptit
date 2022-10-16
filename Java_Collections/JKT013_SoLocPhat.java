/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Java_Collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author ADMIN
 */
public class JKT013_SoLocPhat {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            Stack<String> st = new Stack<>();
            Queue<String> q = new LinkedList<>();
            q.add("");
            while(!q.isEmpty()){
                String s = q.poll();
                if(!"".equals(s)) st.add(s);
                if(s.length() == n) continue;
                q.add(s + "6");
                q.add(s + "8");
            }
            System.out.println(st.size());
            while(!st.isEmpty()){
                System.out.print(st.peek() + " ");
                st.pop();
            }
            
            System.out.println("");
        }
    }
}
