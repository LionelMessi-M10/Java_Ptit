/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Xau_Ky_Tu;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class J03021_DienThoaiCucGach {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String[] arr = {"ABC", "DEF", "GHI", "JKL", "MNO", "PQRS", "TUV", "WXYZ"};
        
        String[] a = new String[10];
        
        for(int i = 2; i <= 9; ++i){
            a[i] = arr[i-2];
        }
        
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- > 0){
            String s = sc.nextLine();
            s = s.toUpperCase();
            int l = 0, r = s.length() - 1;
            boolean ok = true;
            while(l < r){
                String o1 = "", o2 = "";
                o1 += s.charAt(l);
                o2 += s.charAt(r);
                int idx1 = -1, idx2 = -1;
                for(int i = 2; i <= 9; ++i){
                    if(a[i].contains(o1)) idx1 = i;
                    if(a[i].contains(o2)) idx2 = i;
                }
                if(idx1 != idx2){
                    ok = false;
                    break;
                }
                ++l; --r;
            }
            if(ok) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
