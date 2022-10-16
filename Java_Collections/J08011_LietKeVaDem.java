/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Java_Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.LinkedHashMap;

/**
 *
 * @author ADMIN
 */
public class J08011_LietKeVaDem {
    
    public static boolean check(int n){
        String s = Integer.toString(n);
        for(int i = 1; i < s.length(); ++i){
            if((s.charAt(i) - '0') < (s.charAt(i-1) - '0')){
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();
        
        while(sc.hasNextInt()){
            int n = sc.nextInt();
            if(check(n)){
                if(map.containsKey(n)){
                    int fre = map.get(n);
                    ++fre;
                    map.put(n, fre);
                }
                else map.put(n, 1);
            }
        }
        
        ArrayList<LinkedHashMap<Integer, Integer>> arr = new ArrayList<>();

        Set<Map.Entry<Integer, Integer>> entry = map.entrySet();

        for(Map.Entry<Integer, Integer> it : entry){
            LinkedHashMap<Integer, Integer> tmp = new LinkedHashMap<>();
            tmp.put(it.getKey(), it.getValue());
            arr.add(tmp);
        }
        
        Collections.sort(arr, new Comparator<LinkedHashMap<Integer, Integer>>(){

            @Override
            public int compare(LinkedHashMap<Integer, Integer> o1, LinkedHashMap<Integer, Integer> o2) {
                Set<Map.Entry<Integer, Integer>> entry1 = o1.entrySet();
                Set<Map.Entry<Integer, Integer>> entry2 = o2.entrySet();
                
                int fre = 0, fre1 = 0;

                for(Map.Entry<Integer, Integer> it : entry1) fre = it.getValue();
                for(Map.Entry<Integer, Integer> it : entry2) fre1 = it.getValue();
            
                return fre1 - fre;
            }
        });

        for(LinkedHashMap<Integer, Integer> it : arr){
            Set<Map.Entry<Integer, Integer>> entry1 = it.entrySet();

            for(Map.Entry<Integer, Integer> x : entry1){
                System.out.println(x.getKey() + " " + x.getValue());
            }
        }

        sc.close();
    }
}
