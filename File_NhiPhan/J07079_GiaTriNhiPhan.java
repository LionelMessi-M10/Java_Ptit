/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package File_NhiPhan;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

/**
 *
 * @author ADMIN
 */
public class J07079_GiaTriNhiPhan {
    
    public static String chuan(String s){
        String ans = "";
        for(int i = 0; i < s.length(); ++i){
            if(s.charAt(i) == '0' || s.charAt(i) == '1') ans += s.charAt(i);
        }
        return ans;
    }
    
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        FileInputStream file = new FileInputStream("DATA.in");
        
        ObjectInputStream input = new ObjectInputStream(file);
        
        ArrayList<String> arr = new ArrayList<>();
        
        arr = (ArrayList<String>) input.readObject();
        
        ArrayList<String> res = new ArrayList<>();
        
        for(String it : arr){
            res.add(chuan(it));
        }
        
        for(String it : res){
            System.out.println(it + " " + Integer.parseInt(it, 2));
        }
    }
}
