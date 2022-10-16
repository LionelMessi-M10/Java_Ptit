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
public class J07032_SoThuanNghichTrongFile {
    
    public static boolean check(int n){
        if(Integer.toString(n).length() % 2 == 0 || Integer.toString(n).length() <= 1){
            return false;
        }
        int m = n;
        int sum = 0;
        while(n != 0){
            int tmp = n % 10;
            sum = sum * 10 + tmp;
            if(tmp % 2 == 0) return false;
            n /= 10;
        }
        return sum == m;
    }
    
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        
        FileInputStream file1 = new FileInputStream("DATA1.in");
        FileInputStream file2 = new FileInputStream("DATA2.in");
        
        ObjectInputStream input1 = new ObjectInputStream(file1);
        ObjectInputStream input2 = new ObjectInputStream(file2);
        
        ArrayList<Integer> arr1 = (ArrayList<Integer>) input1.readObject();
        ArrayList<Integer> arr2 = (ArrayList<Integer>) input2.readObject();
        
        int[] cnt = new int[1000001];
        
        for(int x : arr1){
            if(check(x)) cnt[x]++;
        }
        
        for(int x : arr2){
            if(check(x)) cnt[x]++;
        }
        
        int dem = 0;
        
        for(int i = 0; i < 1000001; ++i){
            if(cnt[i] != 0 && arr1.contains(i) && arr2.contains(i)){
                ++dem;
                System.out.println(i + " " + cnt[i]);
                if(dem == 10) break;
            }
        }
    }
}
