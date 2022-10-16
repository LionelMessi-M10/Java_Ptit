/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OOP;

import java.util.Scanner;
import java.util.TreeSet;

/**
 *
 * @author ADMIN
 */
public class J04021_LopIntset {
    static class IntSet {

        private TreeSet<Integer> s;

        // Thêm các phần tử của mảng vào Set
        public IntSet(int[] a) {
            s = new TreeSet<>();
            for (int i = 0; i < a.length; i++) {
                s.add(a[i]);
            }
        }
        
        // Lưu set mới.
        public IntSet(TreeSet<Integer> b) {
            s = b;
        }

        public IntSet union(IntSet b) {
            TreeSet<Integer> res = new TreeSet<>(s);
            for (Integer i : b.getS()) {
                res.add(i);
            }
            return new IntSet(res);
        }

        public TreeSet<Integer> getS() {
            return s;
        }

        @Override
        public String toString() {
            String string = "";
            for (Integer i : s) {
                string += i + " ";
            }
            return string;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt(), a[] = new int[n], b[] = new int[m];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < m; i++) {
            b[i] = sc.nextInt();
        }
        IntSet s1 = new IntSet(a);
        IntSet s2 = new IntSet(b);
        IntSet s3 = s1.union(s2);
        System.out.println(s3);
    }
}
