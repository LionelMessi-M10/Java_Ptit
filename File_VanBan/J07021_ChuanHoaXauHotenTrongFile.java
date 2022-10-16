/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package File_VanBan;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class J07021_ChuanHoaXauHotenTrongFile {
    
    public static String chuanHoa(String s){
        String ans = "";
        s = s.trim();
        String[] a = s.split("\\s+");
        for(int i = 0; i < a.length; ++i){
            ans += Character.toUpperCase(a[i].charAt(0));
            ans += a[i].substring(1).toLowerCase();
            ans += " ";
        }
        return ans.trim();
    }
    
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA.in"));
        ArrayList<String> arr = new ArrayList<>();
        while(sc.hasNext()){
            String s = sc.nextLine();
            arr.add(s);
        }
        
        for(int i = 0; i < arr.size()-1; ++i){
            System.out.println(chuanHoa(arr.get(i)));
        }
    }
}
