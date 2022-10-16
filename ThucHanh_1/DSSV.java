/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ThucHanh_1;

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
public class DSSV {
    static class sinhVien{
        private String ten;
        private int d1, d2;

        public sinhVien(String ten, int d1, int d2) {
            this.ten = ten;
            this.d1 = d1;
            this.d2 = d2;
        }

        public String getTen() {
            return ten;
        }

        public int getD1() {
            return d1;
        }

        public int getD2() {
            return d2;
        }

        @Override
        public String toString() {
            return ten + " " + d1 + " " + d2;
        }
        
        
    }
    
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("LUYENTAP.in"));
        int n = sc.nextInt();
        
        ArrayList<sinhVien> list = new ArrayList<>();
        
        for(int i = 1; i <= n; ++i){
            sc.nextLine();
            String ten = sc.nextLine();
            int d1 = sc.nextInt();
            int d2 = sc.nextInt();
            
            sinhVien tmp = new sinhVien(ten, d1, d2);
            list.add(tmp);
        }
        
        Collections.sort(list, new Comparator<sinhVien>(){
            @Override
            public int compare(sinhVien o1, sinhVien o2) {
                if(o1.getD1() != o2.getD1()){
                    return o2.getD1() - o2.getD1();
                }
                else{
                    if(o1.getD2() != o2.getD2()){
                        return o1.getD2() - o2.getD2();
                    }
                }
                return o1.getTen().compareTo(o2.getTen());
            }
        });
        
        for(sinhVien it : list){
            System.out.println(it);
        }
    }
}
