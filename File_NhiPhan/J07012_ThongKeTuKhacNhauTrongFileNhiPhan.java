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
import java.util.Collections;
import java.util.Comparator;
import java.util.TreeMap;

/**
 *
 * @author ADMIN
 */
public class J07012_ThongKeTuKhacNhauTrongFileNhiPhan {

    static TreeMap<String, Integer> map = new TreeMap<>();
    static ArrayList<String> res = new ArrayList<>();

    public static ArrayList<String> chuan(String s) {
        s += ".";
        String ans = "";
        ArrayList<String> tmp = new ArrayList<>();

        for (int i = 0; i < s.length(); ++i) {
            if (Character.isLetterOrDigit(s.charAt(i))) {
                ans += s.charAt(i);
            } 
            else {
                if (!"".equals(ans)) {
                    tmp.add(ans);
                }
                ans = "";
            }
        }
        return tmp;
    }

    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        FileInputStream file = new FileInputStream("DATA.in");

        ObjectInputStream input = new ObjectInputStream(file);

        ArrayList<String> arr = new ArrayList<>();
        arr = (ArrayList<String>) input.readObject();

        for (String s : arr) {
            s = s.toLowerCase();
            String[] x = s.trim().split("\\s+");

            for (String it1 : x) {
                ArrayList<String> a = chuan(it1);
                for (String it : a) {
                    res.add((it));
                    if (map.containsKey(it)) {
                        int ts = map.get(it);
                        ++ts;
                        map.put(it, ts);
                    } 
                    else {
                        map.put(it, 1);
                    }
                }
            }
        }

        Collections.sort(res, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                int ts1 = map.get(o1), ts2 = map.get(o2);
                if (ts1 != ts2) {
                    return ts2 - ts1;
                }
                return o1.compareTo(o2);
            }
        });

        for (String it : res) {
            int ts = map.get(it);
            if (ts > 0) {
                System.out.println(it + " " + ts);
                map.put(it, 0);
            }
        }
    }
}
