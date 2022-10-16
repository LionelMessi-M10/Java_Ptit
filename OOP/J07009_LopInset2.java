/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OOP;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.TreeSet;

/**
 *
 * @author ADMIN
 */
public class J07009_LopInset2 {
    
    static class IntSet {

        private TreeSet<Integer> set;

        public IntSet(TreeSet<Integer> set) {
            this.set = set;
        }

        public IntSet(int[] a) {
            this.set = new TreeSet<>();
            for (int i = 0; i < a.length; i++) {
                this.set.add(a[i]);
            }
        }

        public IntSet intersection(IntSet moi) {
            TreeSet<Integer> res = new TreeSet<>();
            for (int x : this.set) {
                if (moi.set.contains(x)) {
                    res.add(x);
                }
            }
            IntSet ans = new IntSet(res);
            return ans;
        }

        @Override
        public String toString() {
            String res = "";
            for (int x : set) {
                res += x;
                res += " ";
            }
            res = res.trim();
            return res;
        }
    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("DATA.in"));
        int n = sc.nextInt(), m = sc.nextInt(), a[] = new int[n], b[] = new int[m];
        for(int i = 0; i<n; i++) a[i] = sc.nextInt();
        for(int i = 0; i<m; i++) b[i] = sc.nextInt();
        IntSet s1 = new IntSet(a);
        IntSet s2 = new IntSet(b);
        IntSet s3 = s1.intersection(s2);
        System.out.println(s3);
    }
}
