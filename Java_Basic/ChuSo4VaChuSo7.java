/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Java_Basic;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class ChuSo4VaChuSo7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int cnt_4 = 0, cnt_7 = 0;
        for(int i = 0; i < s.length(); ++i){
            if(s.charAt(i) == '4') ++cnt_4;
            else if(s.charAt(i) == '7') ++cnt_7;
        }
        int sum = cnt_4 + cnt_7;
        if(sum == 4 || sum == 7){
            System.out.println("YES");
        }
        else System.out.println("NO");
    }
}
