/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package File_VanBan;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class J07050_SapXepMatHang {
    
    static class matHang{
        private String ma, ten, nhom;
        private double mua, ban;

        public matHang(String ma, String ten, String nhom, double mua, double ban) {
            this.ma = ma;
            this.ten = ten;
            this.nhom = nhom;
            this.mua = mua;
            this.ban = ban;
        }
        
        public double loiNhuan(){
            return ban - mua;
        }

        @Override
        public String toString() {
            return ma + " " + ten + " " + nhom + " " + String.format("%.2f", loiNhuan());
        }
    }
    
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("MATHANG.in"));
        
        ArrayList<matHang> arr = new ArrayList<>();
        
        int n = sc.nextInt();
        
        for(int i = 1; i <= n; ++i){
            String m = String.format("MH%02d", i);
            sc.nextLine();
            String t = sc.nextLine();
            String nh = sc.nextLine();
            double giaMua = sc.nextDouble();
            double giaBan = sc.nextDouble();
            
            matHang tmp = new matHang(m, t, nh, giaMua, giaBan);
            arr.add(tmp);
        }
        
        Collections.sort(arr, new Comparator<matHang>(){
            @Override
            public int compare(matHang o1, matHang o2) {
                if(o2.loiNhuan() - o1.loiNhuan() > 0){
                    return 1;
                }
                return -1;
            }
        });
        
        for(matHang it : arr){
            System.out.println(it);
        }
    }
}
