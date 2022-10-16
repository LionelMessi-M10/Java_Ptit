/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package File_VanBan;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class TinhTong {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("DATA.in");
        Scanner sc = new Scanner(file);
        long sum = 0;
        while(sc.hasNext()){
            String tmp = sc.next();
            if(check(tmp)){
                sum += Chuyen(tmp);
            }
        }
        System.out.println(sum);
    }

    public static boolean check(String tmp) {
        for(int i = 0; i < tmp.length(); ++i){
            if(Character.isAlphabetic(tmp.charAt(i))) return false;
        }
        return tmp.length() > 9 && tmp.length() <= 18;
    }
    
    public static long Chuyen(String tmp){
        long sum = 0;
        for(int i = 0; i < tmp.length(); ++i){
            sum = sum * 10 + (tmp.charAt(i) - '0');
        }
        return sum;
    }
}
