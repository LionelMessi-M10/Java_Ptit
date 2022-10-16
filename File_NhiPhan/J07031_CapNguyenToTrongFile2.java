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
import java.util.TreeSet;

/**
 *
 * @author ADMIN
 */
public class J07031_CapNguyenToTrongFile2 {
    
    static int[] prime = new int[1000001];
    
    public static void sang(){
        for(int i = 0; i < 1000001; ++i){
            prime[i] = 1;
        }
        prime[0] = prime[1] = 0;
        for(int i = 2; i <= Math.sqrt(1000001); ++i){
            if(prime[i] == 1){
                for(int j = i*i; j < 1000001; j += i){
                    prime[j] = 0;
                }
            }
        }
    }

    
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        
        sang();
        
        FileInputStream file1 = new FileInputStream("DATA1.in");
        FileInputStream file2 = new FileInputStream("DATA2.in");
        
        ObjectInputStream input1 = new ObjectInputStream(file1);
        ObjectInputStream input2 = new ObjectInputStream(file2);
        
        ArrayList<Integer> arr1 = (ArrayList<Integer>) input1.readObject();
        ArrayList<Integer> arr2 = (ArrayList<Integer>) input2.readObject();
        
        TreeSet<Integer> set = new TreeSet<>();
        
        for(int x : arr1){
            if(prime[x] == 1){
                set.add(x);
            }
        }
        
        for(int x : set){
            if(x < 500000 && set.contains(1000000 - x)){
                if(!arr2.contains(x) && !arr2.contains(1000000 - x)){
                    System.out.println(x + " " + (1000000 - x));
                }
            }
        }
        
    }
}
