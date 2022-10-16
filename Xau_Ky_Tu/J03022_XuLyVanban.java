/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Xau_Ky_Tu;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

/**
ky thi LAP TRINH ICPC PTIT bat dau to chuc tu nam 2010. nhu vay, nam nay la
tron 10 nam! vay CO PHAI NAM NAY LA KY THI LAN THU 10? khong phai! nam nay la
KY THI LAN THU 11.
 *
 * @author ADMIN
 */
public class J03022_XuLyVanban {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = "";
        ArrayList<String> S = new ArrayList<>();
        while (sc.hasNext()) {
            String s = sc.next();
            if (s.charAt(s.length() - 1) == '.' || s.charAt(s.length() - 1) == '!' || s.charAt(s.length() - 1) == '?') {
                a += s.substring(0, s.length() - 1);
                S.add(a.trim().toLowerCase(Locale.ROOT));
                a = "";
            } 
            else {
                a += s + " ";
            }
            if (s.isEmpty()) {
                break;
            }

        }
        for (String x : S) {
            for (int i = 0; i < x.length(); i++) {
                if (i == 0) {
                    System.out.print((char) (x.charAt(i) - 32));
                } else {
                    System.out.print(x.charAt(i));
                }
            }
            System.out.println();
        }

    }
}
