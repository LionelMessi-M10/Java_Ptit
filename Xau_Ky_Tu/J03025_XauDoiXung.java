/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Xau_Ky_Tu;

import java.util.Scanner;

/*

 * @author ADMIN
 */
public class J03025_XauDoiXung {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // ababa abba
        // De bat buoc phai thay doi 1 ky tu trong xau.
        int t = sc.nextInt();
        sc.nextLine();
        
        while(t-- > 0){
            
            String s = sc.nextLine();
            
            long cnt = 0;           
            int l = 0, r = s.length() - 1;
            
            boolean ok = true;
            
            while(l < r){
                if(s.charAt(l) != s.charAt(r)){
                    ++cnt;
                    ok = false;
                }
                ++l; --r;          
            }
            
            if(ok == true){
               if(s.length() % 2 == 0) System.out.println("NO");
               else System.out.println("YES");
            }
            else{
                if(s.length() % 2 == 0){
                    if(cnt == 1) System.out.println("YES");
                    else System.out.println("NO");
                }
                else{
                    if(cnt <= 1) System.out.println("YES");
                    else System.out.println("NO");
                }
            }
        }
    }
}
