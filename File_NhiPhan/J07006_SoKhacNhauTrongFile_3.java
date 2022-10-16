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
public class J07006_SoKhacNhauTrongFile_3 {
    
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        FileInputStream file = new FileInputStream("DATA.in");
        
        ObjectInputStream input = new ObjectInputStream(file);
        
        ArrayList<Integer> arr = new ArrayList<>();
        arr = (ArrayList<Integer>) input.readObject();
        
        int[] cnt = new int[1001];
        
        for(int x : arr) cnt[x]++;
        
        for(int i = 0; i < 1001; ++i){
            if(cnt[i] > 0){
                System.out.println(i + " " + cnt[i]);
            }
        }
    }
}
