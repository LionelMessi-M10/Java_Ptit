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
public class J07014_HopVaGiaoHaiFileVanBan {

    static class WordSet {

        private TreeSet<String> set = new TreeSet<>();

        public WordSet() {
        }

        public WordSet(String s) throws FileNotFoundException {
            Scanner sc = new Scanner(new File(s));
            while (sc.hasNextLine()) {
                String s1 = sc.nextLine();
                StringTokenizer st = new StringTokenizer(s1.toLowerCase());
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

    public static void main(String[] args) throws IOException {
        WordSet s1 = new WordSet("DATA1.in");
        WordSet s2 = new WordSet("DATA2.in");
        System.out.println(s1.union(s2));
        System.out.println(s1.intersection(s2));
    }
}
