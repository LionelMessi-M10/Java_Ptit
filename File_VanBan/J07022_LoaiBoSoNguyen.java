/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package File_VanBan;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class J07022_LoaiBoSoNguyen {
    
    public static boolean check(String s){
        for(int i = 0; i < s.length(); ++i){
            if(Character.isDigit(s.charAt(i))) return true;
        }
        return false;
    }
    
    public static boolean check1(String s){
        for(int i = 0; i < s.length(); ++i){
            if(Character.isAlphabetic(s.charAt(i))) return true;
        }
        return false;
    }
    
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA.in"));
        
        ArrayList<String> arr = new ArrayList<>();
        
        while(sc.hasNext()){
            String s = sc.nextLine();
            String[] a = s.split(" ");
            for(int i = 0; i < a.length; ++i){
                if(check(a[i]) && a[i].length() > 9) arr.add(a[i]);
                else if(check1(a[i])) arr.add(a[i]);
            }
        }
        
        Collections.sort(arr);
        
        for(String it : arr){
            System.out.print(it + " ");
        }
    }
}
