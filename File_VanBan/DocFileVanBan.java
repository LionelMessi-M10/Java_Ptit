/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package File_VanBan;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class DocFileVanBan {
    
    public static boolean nto(int n){
        for(int i = 2; i <= Math.sqrt(n); ++i){
            if(n % i == 0) return false;
        }
        return n > 1;
    }
    
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("28tech_number.txt"));
        try (PrintWriter out = new PrintWriter("28tech_prime.txt")) {
            ArrayList<Integer> arr = new ArrayList<>();
            int n;
            while(sc.hasNextInt()){
                n = sc.nextInt();
                if(nto(n)) arr.add(n);
            }
            
            Collections.sort(arr);
            
            for(int x : arr){
                out.print(x + " ");
            }
        }
    }
}
