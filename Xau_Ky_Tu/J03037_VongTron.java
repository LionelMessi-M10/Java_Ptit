/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Xau_Ky_Tu;

import java.util.Scanner;
import java.util.TreeMap;

/**
 *
 * @author ADMIN
 */
public class J03037_VongTron {
    
    public static int dem(String s, int start, int finish){
        int ans = 0;
        TreeMap<String, Integer> map = new TreeMap<>();
        for(int i = start + 1; i < finish; ++i){
            if(map.containsKey(Character.toString(s.charAt(i)))){
                int ts = map.get(Character.toString(s.charAt(i)));
                ++ts;
                map.put(Character.toString(s.charAt(i)), ts);
            }
            else map.put(Character.toString(s.charAt(i)), 1);
        }
        
        for(int i = start + 1; i < finish; ++i){
            if(map.get(Character.toString(s.charAt(i))) == 1){
                ++ans;
            }
        }
        return ans;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String s = sc.nextLine();
        long ans = 0;
        
        for(int i = 0; i < s.length()-1; ++i){
            for(int j = i+1; j < s.length(); ++j){
                if(s.charAt(i) == s.charAt(j)){
                    ans += dem(s, i, j);
                }
            }
        }
        
        System.out.println(ans/2);
    }
}
