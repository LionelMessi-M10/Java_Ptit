/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Xau_Ky_Tu;

import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class J07003_TachDoiVaTinhTong {

    public static BigInteger tinhToan(String s) {
        int len1 = s.length() / 2;

        String a = "", b = "";
        for (int i = 0; i < len1; ++i) {
            a += s.charAt(i);
        }
        for (int i = len1; i < s.length(); ++i) {
            b += s.charAt(i);
        }

        BigInteger x = new BigInteger(a);
        BigInteger y = new BigInteger(b);

        return x.add(y);

    }

    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("DATA.in");
        Scanner sc = new Scanner(file);
        
        while (sc.hasNextLine()) {
            String s = sc.nextLine();

            BigInteger tong = tinhToan(s);
            System.out.println(tong);

            String tmp = tong.toString();

            while (tmp.length() > 1) {
                tong = tinhToan(tmp);
                System.out.println(tong);
                tmp = tong.toString();
            }
        }
    }
}
