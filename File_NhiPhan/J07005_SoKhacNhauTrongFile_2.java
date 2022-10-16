/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package File_NhiPhan;

import java.io.DataInputStream;
import java.io.FileInputStream;

/**
 *
 * @author ADMIN
 */
public class J07005_SoKhacNhauTrongFile_2 {
    public static void main(String[] args) {
        try (FileInputStream fin = new FileInputStream("DATA.IN"); DataInputStream dis = new DataInputStream(fin);) {
            int[] cnt = new int[1001];
            
            for(int i = 1; i <= 100000; ++i){
                int n = dis.readInt();
                cnt[n]++;
            }
            
            for(int i = 0; i < 1001; ++i){
                if(cnt[i] != 0){
                    System.out.println(i + " " + cnt[i]);
                }
            }
            dis.close();
            fin.close();
            
        } catch (Exception e) {
            e.getMessage();
        }
    }
}
