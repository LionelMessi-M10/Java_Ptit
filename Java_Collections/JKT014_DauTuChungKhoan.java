/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Java_Collections;

import java.util.Scanner;
import java.util.Stack;

/**
1
7
100 80 60 70 60 75 85
 * @author ADMIN
 */
public class JKT014_DauTuChungKhoan {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int[] a = new int[n + 5];
            int[] c = new int[n + 5];
            
            Stack<Integer> st = new Stack<>();
            for(int i = 1; i <= n; ++i){
                c[i] = sc.nextInt();
            }
            
            for(int i = 1; i <= n; ++i){
                while(!st.isEmpty() && c[i] >= c[st.peek()]){
                    st.pop();
                }
                if(st.isEmpty()) a[i] = 0;
                else a[i] = st.peek();
                st.push(i);
            }
            
            for(int i = 1; i <= n; ++i){
                System.out.print((i - a[i]) + " ");
            }
            System.out.println("");
        }
    }
}
