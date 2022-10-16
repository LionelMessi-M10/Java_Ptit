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
import java.util.TreeSet;

/**
 *
 * @author ADMIN
 */
public class GhepXau {
    
    
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        FileInputStream file1 = new FileInputStream("DATA1.in");
        FileInputStream file2 = new FileInputStream("DATA2.in");
        
        ObjectInputStream input1 = new ObjectInputStream(file1);
        ObjectInputStream input2 = new ObjectInputStream(file2);
        
        ArrayList<String> a1 = new ArrayList<>();
        ArrayList<Integer> a2 = new ArrayList<>();
        
        a1 = (ArrayList<String>) input1.readObject();
        a2 = (ArrayList<Integer>) input2.readObject();
        
        TreeSet<String> set1 = new TreeSet<>();
        TreeSet<Integer> set2 = new TreeSet<>();
        
        for(String x : a1){
            set1.add(x);
        }
        
        for(int x : a2){
            set2.add(x);
        }
        
        for(String x : set1){
            for(int y : set2){
                System.out.println(x + Integer.toString(y));
            }
        }
    }
}
