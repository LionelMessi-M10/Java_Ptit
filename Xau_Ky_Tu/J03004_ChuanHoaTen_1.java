/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Xau_Ky_Tu;

import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author ADMIN
 */
public class J03004_ChuanHoaTen_1 {
    
    public static String chuanHoa(String s){
        String tmp = "";
        tmp += Character.toUpperCase(s.charAt(0));
        for(int i = 1; i < s.length(); ++i){
            char c = s.charAt(i);
            tmp += Character.toLowerCase(c);
        }
        return tmp;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        sc.nextLine();
        
        while(t-- > 0){
            String s = sc.nextLine();
            StringTokenizer st = new StringTokenizer(s);
            
            while(st.hasMoreTokens()){
                System.out.print(chuanHoa(st.nextToken()) + " ");
            }
            System.out.println("");
        }
    }
}
