/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Java_Collections;

import java.util.Scanner;
import java.util.Stack;

/**
3
((()
)()())
()(()))))
 * @author ADMIN
 */
public class J08021_DayNgoacDungDaiNhat {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            String s = sc.next();
            
            int res = 0;
            
            Stack<Integer> st = new Stack<>();
            st.push(-1);
            
            for(int i = 0; i < s.length(); ++i){
                if(s.charAt(i) == '(') st.push(i);
                else{
                    st.pop();
                    if(!st.isEmpty()) res = Math.max(res, i - st.peek());
                    if(st.isEmpty()) st.push(i);
                }
            }
            
            System.out.println(res);
        }
    }
}
