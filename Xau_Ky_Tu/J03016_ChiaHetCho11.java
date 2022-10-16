/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Xau_Ky_Tu;

import java.util.Scanner;

/*
Dau hieu chia het cho 11:
- Lay so1 - so2 + so3 - so4 + ...+ so_n
Neu tong chu so nay chia het cho 11 thi so do chia het cho 11.

 * @author ADMIN
 */
public class J03016_ChiaHetCho11 {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        while(t-- > 0){
            String s = sc.next();
            
            int sum = 0;
            
            for(int i = 0; i < s.length(); ++i){
                if(i % 2 == 0) sum += (s.charAt(i) - '0');
                else sum -= (s.charAt(i) - '0');
            }
            
            if(sum % 11 == 0) System.out.println("1"); 
            else System.out.println("0");
            
        }
    }
}
