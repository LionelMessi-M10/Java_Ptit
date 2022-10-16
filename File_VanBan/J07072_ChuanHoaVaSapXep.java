/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package File_VanBan;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class J07072_ChuanHoaVaSapXep {
    
    public static String chuanHoa(String s){
        s = s.trim();
        String[] a = s.split("\\s+");
        String ans = "";
        for(int i = 0; i < a.length; ++i){
            ans += Character.toUpperCase(a[i].charAt(0));
            ans += a[i].substring(1).toLowerCase();
            ans += " ";
        }
        return ans.trim();
    }
    
    public static String ho(String s){
        String[] a = s.split("\\s+");
        return a[0];
    }
    
    public static String ten(String s){
        String[] a = s.split("\\s+");
        return a[a.length - 1];
    }
    
    public static String tenDem(String s){
        String[] a = s.split("\\s+");
        String ans = "";
        for(int i = 1; i < a.length - 1; ++i){
            ans += a[i];
        }
        return ans;
    }
    
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DANHSACH.in"));
        
        ArrayList<String> arr = new ArrayList<>();
        
        while(sc.hasNextLine()){
            String s = sc.nextLine();
            arr.add(chuanHoa(s));
        }
        
        Collections.sort(arr, new Comparator<String>(){
            @Override
            public int compare(String o1, String o2) {
                if(!ten(o1).equals(ten(o2))){
                    return ten(o1).compareTo(ten(o2));
                }
                else{
                    if(!ho(o1).equals(ho(o2))){
                        return ho(o1).compareTo(ho(o2));
                    }
                }
                return tenDem(o1).compareTo(tenDem(o2));
            }
        });
        
        for(String it : arr){
            System.out.println(it);
        }
    }
}
