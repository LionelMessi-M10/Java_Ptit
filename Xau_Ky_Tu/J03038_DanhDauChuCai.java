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
public class J03038_DanhDauChuCai {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String s = sc.nextLine();
        int[] cnt = new int[256];
        
        for(int i = 0; i < s.length(); ++i){
            cnt[s.charAt(i)]++;
        }
        
        int ans = 0;
        for(int i = 0; i < 256; ++i){
            if(cnt[i] != 0) ++ans;
        }
        
        System.out.println(ans);
    }
}
