/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package File_NhiPhan;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class J07040_LietKeTheoThuTuXuatHien {
    
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        FileInputStream file = new FileInputStream("NHIPHAN.in");
        Scanner sc = new Scanner(new File("VANBAN.in"));
        
        ObjectInputStream input = new ObjectInputStream(file);
        
        ArrayList<String> arr = new ArrayList<>();
        ArrayList<String> arr1 = new ArrayList<>();
        arr = (ArrayList<String>) input.readObject();
        
        while(sc.hasNextLine()){
            String s = sc.nextLine();
            arr1.add(s);
        }
        
        LinkedHashSet<String> file1 = new LinkedHashSet<>();
        LinkedHashSet<String> file2 = new LinkedHashSet<>();
        
        for(String it : arr){
            String[] a = it.split("\\s+");
            for(int i = 0; i < a.length; ++i){
                file1.add(a[i].toLowerCase());
            }
        }
        
        for(String it : arr1){
            String[] a = it.split("\\s+");
            for(int i = 0; i < a.length; ++i){
                file2.add(a[i].toLowerCase());
            }
        }
        
        for(String it : file2){
            if(file1.contains(it)){
                System.out.println(it);
            }
        }
    }
}
