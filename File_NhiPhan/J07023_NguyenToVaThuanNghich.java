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
public class J07023_NguyenToVaThuanNghich {
    
    static int[] prime = new int[10001];
    
    public static void sang(){
        for(int i = 0; i < 10001; ++i){
            prime[i] = 1;
        }
        prime[0] = prime[1] = 0;
        
        for(int i = 2; i <= 100; ++i){
            if(prime[i] == 1){
                for(int j = i*i; j < 10001; j += i){
                    prime[j] = 0;
                }
            }
        }
    }
    
    public static boolean tn(int n){
        int m = n;
        int sum = 0;
        while(n != 0){
            sum = sum * 10 + n % 10;
            n /= 10;
        }
        return sum == m;
    }
    
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        FileInputStream file1 = new FileInputStream("DATA1.in");
        FileInputStream file2 = new FileInputStream("DATA2.in");
        
        ObjectInputStream input1 = new ObjectInputStream(file1);
        ObjectInputStream input2 = new ObjectInputStream(file2);
        
        ArrayList<Integer> arr1 = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();
        
        arr1 = (ArrayList<Integer>) input1.readObject();
        arr2 = (ArrayList<Integer>) input2.readObject();
        
        sang();
        
        int[] cnt1 = new int[10001];
        int[] cnt2 = new int[10001];
        
        TreeSet<Integer> set = new TreeSet<>();
        
        for(int x : arr1){
            if(prime[x] == 1 && tn(x)){
                set.add(x);
                cnt1[x]++;
            }
        }
        
        for(int x : arr2){
            if(prime[x] == 1 && tn(x)){
                cnt2[x]++;
            }
        }
        
        for(int x : set){
            if(arr2.contains(x)){
                System.out.println(x + " " + cnt1[x] + " " + cnt2[x]);
            }
        }
    }
}
