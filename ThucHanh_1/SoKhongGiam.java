/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ThucHanh_1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

/**
1123
 * @author ADMIN
 */
public class SoKhongGiam {
    public static boolean check(int n){
        
        String s = Integer.toString(n);
        if(s.length() < 2) return false;
        for(int i = 0; i < s.length() - 1; ++i){
            if((s.charAt(i) - '0') > (s.charAt(i + 1) - '0')){
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        FileInputStream file1 = new FileInputStream("DATA1.in");
        FileInputStream file2 = new FileInputStream("DATA2.in");
        
        ObjectInputStream input1 = new ObjectInputStream(file1);
        ObjectInputStream input2 = new ObjectInputStream(file2);
        
        ArrayList<Integer> a1 = new ArrayList<>();
        ArrayList<Integer> a2 = new ArrayList<>();
        
        a1 = (ArrayList<Integer>) input1.readObject();
        a2 = (ArrayList<Integer>) input2.readObject();
        
        int[] cnt1 = new int[10001];
        int[] cnt2 = new int[10001];
        for(int x : a1) if(check(x)) cnt1[x]++;
        for(int x : a2) if(check(x)) cnt2[x]++;
        
        for(int i = 0; i < 10001; ++i){
            if(cnt1[i] != 0 && cnt2[i] != 0){
                System.out.println(i + " " + cnt1[i] + " " + cnt2[i]);
                cnt1[i] = 0;
                cnt2[i] = 0;
            }
        }
    }
}
