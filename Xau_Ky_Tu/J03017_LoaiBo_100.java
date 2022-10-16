/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Xau_Ky_Tu;

import java.util.Scanner;

/**
2
010010
1011110000
 * @author ADMIN
 */
public class J03017_LoaiBo_100 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        for (int z = 0; z < t; z++) {
            int res = 0;
            String s = sc.nextLine();
            s = " " + s;
            while (s.contains("100")) {
                int c = 0;
                int i = s.indexOf("100");
                while ((0 < i && i < s.length() && s.indexOf("100") == i) || (i - 1 > 0 && i - 1 < s.length()
                        && s.indexOf("100") == i - 1) || (i - 2 > 0 && i - 2 < s.length() && s.indexOf("100") == i - 2)) {
                    c += 3;
                    i = s.indexOf("100");
                    s = s.substring(0, i) + s.substring(i + 3);
                }
                if (c > res) {
                   res = c;
                }
            }
            System.out.println(res);
        }
    }
}
