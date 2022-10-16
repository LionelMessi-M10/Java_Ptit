/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Xau_Ky_Tu;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class J03032_DaoTu {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        sc.nextLine();
        
        while(t-- > 0){
            String s = sc.nextLine();
            
            String[] arr = s.split("\\s+");
            for(int i = 0; i < arr.length; ++i){
                System.out.print(Dao(arr[i]) + " ");
            }
            System.out.println("");
        }
    }

    public static String Dao(String s) {
        String ans = "";
        for(int i = s.length() - 1; i >= 0; --i) ans += s.charAt(i);
        return ans;
    }
}
