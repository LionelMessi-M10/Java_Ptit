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
public class J07085_TongChuSo {
    
    public static String chuyenSo(String s){
        String ans = "";
        int idx = 0;
        for(int i = 0; i < s.length(); ++i){
            if(Character.isDigit(s.charAt(i)) && s.charAt(i) != '0'){
                idx = i;
                break;
            }
        }
        
        for(int i = idx; i < s.length(); ++i){
            if(Character.isDigit(s.charAt(i))){
                ans += s.charAt(i);
            }
        }
        return ans;
    }
    
    public static int tongChuSo(String s){
        int sum = 0;
        for(int i = 0; i < s.length(); ++i){
            sum += (s.charAt(i) - '0');
        }
        return sum;
    }
    
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        FileInputStream file = new FileInputStream("DATA.in");
        ObjectInputStream input = new ObjectInputStream(file);
        
        ArrayList<String> arr = new ArrayList<>();
        arr = (ArrayList<String>) input.readObject();
        
        for(String it : arr){
            System.out.println(chuyenSo(it) + " " + tongChuSo(chuyenSo(it)));
        }
    }
}
