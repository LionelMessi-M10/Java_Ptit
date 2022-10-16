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
import java.util.TreeMap;

/**
3
PTIT duy tri hoc phi on dinh nam 2019 va khong tang trong nam 2020-2021 va 2021-2022!
Khi dich benh xuat hien PTIT trich hon 6 ty dong ho tro sinh vien PTIT
voi muc ho tro 500000 dong/sinh vien PTIT.
 * @author ADMIN
 */
public class J07011_ThongKeTuKhacNhau {
    
    static TreeMap<String, Integer> map = new TreeMap<>();
    static ArrayList<String> arr = new ArrayList<>();
    
    public static ArrayList<String> chuan(String s){
        s += ".";
        String ans = "";
        ArrayList<String> tmp = new ArrayList<>();
        
        for(int i = 0; i < s.length(); ++i){
            if(Character.isLetterOrDigit(s.charAt(i))){
                ans += s.charAt(i);
            }
            else{
                if(!"".equals(ans)) tmp.add(ans);
                ans = "";
            }
        }
        return tmp;
    }
    
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("VANBAN.in"));
        
        int t = sc.nextInt();
        sc.nextLine();
        
        while(t-- > 0){
            String s = sc.nextLine();
            s = s.toLowerCase();
            String[] x = s.split("\\s+");
            
            for(String it1 : x){
                ArrayList<String> a = chuan(it1);
                for(String it : a){
                    arr.add((it));
                    if(map.containsKey(it)){
                        int ts = map.get(it);
                        ++ts;
                        map.put(it, ts);
                    }
                    else map.put(it, 1);
                }
            }
            
        }
        
        Collections.sort(arr, new Comparator<String>(){
            @Override
            public int compare(String o1, String o2) {
                int ts1 = map.get(o1), ts2 = map.get(o2);
                if(ts1 != ts2){
                    return ts2 - ts1;
                }
                return o1.compareTo(o2);
            }
        });
        
        for(String it : arr){
            int ts = map.get(it);
            if(ts > 0){
                System.out.println(it.toLowerCase() + " " + ts);
                map.put(it, 0);
            }
        }
        
    }
}
