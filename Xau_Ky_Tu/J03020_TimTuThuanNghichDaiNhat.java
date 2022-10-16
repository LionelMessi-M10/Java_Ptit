/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Xau_Ky_Tu;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author ADMIN
 */
public class J03020_TimTuThuanNghichDaiNhat {
    public static boolean check(String s){
        int l = 0, r = s.length() - 1;
        while(l < r){
            if(s.charAt(l) != s.charAt(r)) return false;
            ++l;
            --r;
        }
        return true;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Map<String, Integer> map = new LinkedHashMap<>();
        ArrayList<String> arr = new ArrayList<>();
        
        while(sc.hasNextLine()){
            String s = sc.nextLine();
            String[] tmp = s.split("\\s+");
            for(int i = 0; i < tmp.length; ++i){
                if(check(tmp[i])) arr.add(tmp[i]);
            }
        }
        
        for(String it : arr){
            if(map.containsKey(it)){
                int ts = map.get(it);
                ++ts;
                map.put(it, ts);
            }
            else map.put(it, 1);
        }
        
        int len = 0;
        
        for(String it : arr){
            len = Math.max(len, it.length());
        }
        
        Set<Map.Entry<String, Integer>> entry1 = map.entrySet();
        for (Map.Entry<String, Integer> it : entry1) {
            if(it.getKey().length() == len){
                System.out.println(it.getKey() + " " + it.getValue());
            }
        }
    }
}
