/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OOP;

import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.TreeSet;

/**
Lap trinh huong doi tuong
Ngon ngu lap trinh C++
 * @author ADMIN
 */
public class J04022_WordSet {

    static class WordSet {

        private TreeSet<String> set = new TreeSet<>();

        public WordSet() {
        }

        public WordSet(String s) {
            StringTokenizer st = new StringTokenizer(s.toLowerCase());
            while (st.hasMoreTokens()) {
                set.add(st.nextToken());
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

        // Hop hai mang chuoi
        public WordSet union(WordSet a) {
            WordSet result = new WordSet();
            result.set.addAll(set);
            result.set.addAll(a.set);
            return result;
        }

        // Giao hai mang chuoi
        public WordSet intersection(WordSet a) {
            WordSet result = new WordSet();
            result.set.addAll(set);
            result.set.retainAll(a.set);
            return result;
        }
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        WordSet s1 = new WordSet(in.nextLine());
        WordSet s2 = new WordSet(in.nextLine());
        System.out.println(s1.union(s2));
        System.out.println(s1.intersection(s2));
    }
}
