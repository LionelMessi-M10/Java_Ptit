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
public class J07029_SoNguyenToLonNhatTrongFile {
    
    public static boolean nto(int n){
        for(int i = 2; i <= Math.sqrt(n); ++i){
            if(n % i == 0) return false;
        }
        return n > 1;
    }
    
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        FileInputStream file = new FileInputStream("DATA.in");
        
        ObjectInputStream input = new ObjectInputStream(file);
        
        ArrayList<Integer> arr = new ArrayList<>();
        arr = (ArrayList<Integer>) input.readObject();
        
        int[] cnt = new int[1000001];
        
        for(int x : arr){
            if(nto(x)) cnt[x]++;
        }
        
        int dem = 0;
        
        for(int i = 1000000; i >= 0; --i){
            if(cnt[i] > 0){
                System.out.println(i + " " + cnt[i]);
                ++dem;
                if(dem == 10) break;
            }
        }
    }
}
