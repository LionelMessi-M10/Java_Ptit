/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Xau_Ky_Tu;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.TreeMap;

/**
vinhnq@ptit.edu.vn
huongttt@ptit.edu.vn
vinhnq2@ptit.edu.vn
anhlt@ptit.edu.vn
* 
 * @author ADMIN
 */
public class J03010_DiaChiEmail {
    
    public static String chuanHoa(String s){
        String tmp = "";
        for(int i = 0; i < s.length(); ++i){
            char x = s.charAt(i);
            tmp += Character.toLowerCase(x);
        }
        return tmp;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        List<String> ketQua = new ArrayList<>();
        Map<String, Integer> map = new TreeMap<>();
        
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- > 0){
            
            List<String> arr = new ArrayList<>();
            String s = sc.nextLine();
            
            StringTokenizer st = new StringTokenizer(s);
            while(st.hasMoreTokens()){
                arr.add(chuanHoa(st.nextToken()));
            }
            
            String ans = "";
            ans += arr.get(arr.size() - 1);
            for(int i = 0; i <= arr.size() - 2; ++i){
                ans += arr.get(i).charAt(0);
            }
           

            if(map.containsKey(ans)){
                int tanSuat = map.get(ans);
                ++tanSuat;
                ketQua.add(ans + (char)(tanSuat + '0') + "@ptit.edu.vn");
                map.put(ans, tanSuat);
            }
            else{
                ketQua.add(ans + "@ptit.edu.vn");
                map.put(ans, 1);
            }
        }
        for(String x : ketQua){
            System.out.println(x);
        }
    }
}
