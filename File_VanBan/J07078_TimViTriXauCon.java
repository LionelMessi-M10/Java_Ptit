/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package File_VanBan;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
2
aaaaa
aa
abcde
bc
 * @author ADMIN
 */
public class J07078_TimViTriXauCon {
    
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("STRING.in"));
        
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- > 0){
            String a = sc.nextLine();
            String b = sc.nextLine();
            
            int len = b.length();
            int idx = a.indexOf(b);
            for(int i = idx; i <= a.length() - len; ++i){
                String ans = a.substring(i, i + len);
                if(ans.equals(b)){
                    System.out.print((i + 1) + " ");
                }
            }
            System.out.println("");
        }
    }
}
