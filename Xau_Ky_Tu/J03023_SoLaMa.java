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
public class J03023_SoLaMa {

    static int[] soLaMa = {1, 5, 10, 50, 100, 500, 1000};

    public static int chuyen(char n) {
        int res = 0;
        if(n == 'I') res += 0;
        else if(n == 'V') res += 1;
        else if(n == 'X') res += 2;
        else if(n == 'L') res += 3;
        else if(n == 'C') res += 4;
        else if(n == 'D') res += 5;
        else if(n == 'M') res += 6;
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            String s = sc.nextLine();
            
            int len = s.length();
            int[] a = new int[len];
            
            for(int i = 0; i < len; ++i){
                a[i] = chuyen(s.charAt(i));
            }
            
            int ans = 0;
            for(int i = 0; i < len - 1; ++i){
                if(a[i] < a[i+1]) ans -= soLaMa[a[i]];
                else ans += soLaMa[a[i]];
            }
            System.out.println(ans + soLaMa[a[len-1]]);
        }
    }
}
