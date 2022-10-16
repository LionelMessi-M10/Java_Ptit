/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Java_Collections;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.TreeMap;

/**
 *
 * @author ADMIN
 */
public class J08010_TimTuThuanNghichDaiNhat {
    public static boolean check(String s){
        int l = 0, r = s.length() - 1;
        while(l <= r){
            if(s.charAt(l) != s.charAt(r)) return false;
            ++l;
            --r;
        }
        return true;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int len_max = (int) -1e9;
        
        LinkedHashSet<String> arr = new LinkedHashSet<>();
        TreeMap<String, Integer> map = new TreeMap<>();
        
        while(sc.hasNext()){
            String s = sc.next();
            if(check(s)){
                len_max = Math.max(len_max, s.length());
                arr.add(s);
                if(map.containsKey(s)){
                    int ts = map.get(s);
                    ++ts;
                    map.put(s, ts);
                }
                else map.put(s, 1);
            }
        }
        
        for(String it : arr){
            if(it.length() == len_max){
                System.out.println(it + " " + map.get(it));  
            }
        }

    }
}
