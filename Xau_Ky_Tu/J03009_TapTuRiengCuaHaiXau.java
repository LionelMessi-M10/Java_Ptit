/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Xau_Ky_Tu;

import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeSet;

/**
2
abc ab ab ab abcd
ab abc
aaa xyz ab zzz abc dd dd abc
xyz dd ttt sas cdc
 * @author ADMIN
 */
public class J03009_TapTuRiengCuaHaiXau {
    
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- > 0){
            
            String s1 = sc.nextLine();
            String s2 = sc.nextLine();
            
            Set<String> se1 = new TreeSet<>();
            Set<String> se2 = new TreeSet<>();
            
            StringTokenizer st1 = new StringTokenizer(s1);
            while(st1.hasMoreTokens()){
                se1.add(st1.nextToken());
            }
            
            StringTokenizer st2 = new StringTokenizer(s2);
            while(st2.hasMoreTokens()){
                se2.add(st2.nextToken());
            }
            
            for(String it : se1){
                if(!se2.contains(it)) System.out.print(it + " ");
            }
            System.out.println("");
        }
    }
}
