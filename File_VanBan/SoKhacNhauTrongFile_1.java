/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package File_VanBan;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

/**
 *
 * @author ADMIN
 */
public class SoKhacNhauTrongFile_1 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("DATA.in");
        Scanner sc = new Scanner(file);
        TreeMap<Integer, Integer> map = new TreeMap<>();
        while(sc.hasNextInt()){
            int n = sc.nextInt();
            if(map.containsKey(n)){
                int fre = map.get(n);
                ++fre;
                map.put(n, fre);
            }
            else map.put(n, 1);
        }
        Set<Map.Entry<Integer, Integer>> entry = map.entrySet();
        for(Map.Entry<Integer, Integer> it : entry){
            System.out.println(it.getKey() + " " + it.getValue());
        }
    }
}
