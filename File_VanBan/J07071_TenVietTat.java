/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package File_VanBan;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class J07071_TenVietTat {

    public static void main(String[] args) throws FileNotFoundException {

        Scanner sc = new Scanner(new File("DANHSACH.in"));
        
        int t = Integer.parseInt(sc.nextLine());
        LinkedList<String> lst = new LinkedList<>();
        while (t-- > 0) {
            lst.add(sc.nextLine());
        }
        
        Collections.sort(lst, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                String[] a1 = o1.split("\\s+");
                String[] a2 = o2.split("\\s+");
                if (!a1[a1.length - 1].equals(a2[a2.length - 1])) {
                    return a1[a1.length - 1].compareTo(a2[a2.length - 1]);
                } else {
                    return a1[0].compareTo(a2[0]);
                }
            }
        });
        t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            String x = sc.nextLine();
            for (String z : lst) {
                if (check(z, x)) {
                    System.out.println(z);
                }
            }
        }

    }

    public static boolean check(String a, String x) {
        a = a.trim();
        String[] arr = a.split("\\s+");
        StringBuilder sb = new StringBuilder();

        for (String z : arr) {
            sb.append(Character.toUpperCase(z.charAt(0))).append(".");
        }
        sb.delete(sb.length() - 1, sb.length());
        if (sb.length() != x.length()) {
            return false;
        }
        return sb.toString().matches(x);
    }
}
