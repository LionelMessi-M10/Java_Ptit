/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Xau_Ky_Tu;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author ADMIN
 */
public class J03005_ChuanHoaTen_2 {
    
    public static String chuanHoa(String s){
        String tmp = "";
        tmp += Character.toUpperCase(s.charAt(0));
        for(int i = 1; i < s.length(); ++i){
            char c = s.charAt(i);
            tmp += Character.toLowerCase(c);
        }
        return tmp;
    }
    
    public static String chuanHoa2(String s){
        String tmp = "";
        for(int i = 0; i < s.length(); ++i){
            char x = s.charAt(i);
            tmp += Character.toUpperCase(x);
        }
        return tmp;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        sc.nextLine();
        
        while(t-- > 0){
            
            ArrayList<String> ans = new ArrayList<>();
            
            String s = sc.nextLine();
            StringTokenizer st = new StringTokenizer(s);
            
            while(st.hasMoreTokens()){
                ans.add(chuanHoa(st.nextToken()));
            }
            
            for(int i = 1; i < ans.size(); ++i){
                System.out.print(ans.get(i));
                if(i == ans.size() - 1) System.out.print(", ");
                else System.out.print(" ");
            }
            System.out.print(chuanHoa2(ans.get(0)));
            
            System.out.println("");
            ans.clear();
        }
    }
}
