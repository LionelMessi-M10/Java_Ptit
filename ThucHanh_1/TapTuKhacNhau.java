/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OOP;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author ADMIN
 */
public class TapTuKhacNhau {

    static class WordSet {

        private Set<String> set;

        public WordSet() {
        }

        public WordSet(String a) {
            set = new LinkedHashSet<>();
            a = a.trim();
            String temp[] = a.split("\\s+");
            for (String i : temp) {
                set.add(i.toLowerCase());
            }
        }

        public Set<String> getSet() {
            return set;
        }

        public void setSet(Set<String> temp) {
            set = new LinkedHashSet<>(temp);
        }

        public WordSet union(WordSet a) {
            WordSet res = new WordSet();
            Set<String> temp = new LinkedHashSet<>(set);
            temp.addAll(a.getSet());
            List<String> t = new ArrayList<>(temp);
            Collections.sort(t);
            res.setSet(new LinkedHashSet<>(t));
            return res;
        }

        public WordSet intersection(WordSet a) {
            WordSet res = new WordSet();
            List<String> temp = new ArrayList<>(set);
            temp.addAll(a.getSet());
            Map<String, Integer> m = new LinkedHashMap<>();
            for (String i : temp) {
                if (m.containsKey(i)) {
                    m.put(i, m.get(i) + 1);
                } else {
                    m.put(i, 1);
                }
            }
            List<String> t = new ArrayList<>();
            for (String i : m.keySet()) {
                if (m.get(i) >= 2) {
                    t.add(i);
                }
            }
            Collections.sort(t);
            res.setSet(new LinkedHashSet<>(t));
            return res;
        }

        @Override
        public String toString() {
            String res = "";
            for (String i : set) {
                res += i + " ";
            }
            return res;
        }
    }

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA.in"));
        WordSet s1 = new WordSet(sc.nextLine());
        WordSet s2 = new WordSet(sc.nextLine());
        System.out.println(s1.union(s2));
        System.out.println(s1.intersection(s2));
    }
}
