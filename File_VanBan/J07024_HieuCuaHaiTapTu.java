/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package File_VanBan;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.TreeSet;

/**
 *
 * @author ADMIN
 */
public class J07024_HieuCuaHaiTapTu {
    
    static class WordSet {

        private TreeSet<String> set = new TreeSet<>();

        public WordSet() {
        }

        public WordSet(String s) throws FileNotFoundException {
            Scanner sc = new Scanner(new File(s));
            
            while(sc.hasNextLine()){
                String tmp = sc.nextLine();
                StringTokenizer st = new StringTokenizer(tmp.toLowerCase());
                while (st.hasMoreTokens()) {
                    set.add(st.nextToken());
                }
            }
        }

        @Override
        public String toString() {
            String kq = "";
            for (String i : set) {
                kq = kq + i + " ";
            }
            return kq.trim();
        }


        public WordSet difference(WordSet a) {
            WordSet result = new WordSet();
            for(String x : set){
                if(!a.set.contains(x)){
                    result.set.add(x);
                }
            }
            return result;
        }
    }
    
    public static void main(String[] args) throws IOException {
        WordSet s1 = new WordSet("DATA1.in");
        WordSet s2 = new WordSet("DATA2.in");
        System.out.println(s1.difference(s2));
        System.out.println(s2.difference(s1));
    }
}
