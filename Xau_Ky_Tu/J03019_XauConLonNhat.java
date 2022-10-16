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
public class J03019_XauConLonNhat {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String s = sc.next();
        
        int x = 0;
        
        for (char i = 'z'; i >= 'a'; i--) {
            
            for (int j = x; j < s.length(); j++) {
                if (s.charAt(j) == i) {
                    // In ra ký tự lớn nhất tìm được.
                    System.out.print(s.charAt(j));
                    // Khi lấy được phần tử có mã ASCii lớn nhất thì cho chạy tiếp tục ngay tại đó.
                    x = j;
                }
            }
            
        }
    }
}
