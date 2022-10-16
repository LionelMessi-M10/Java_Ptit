/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OOP;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
3
11 20 20
14 20 14
11 15 12
 * @author ADMIN
 */
public class J05033_SapXepThoiGian {
    static class ThoiGian{
        int gio, phut, giay;

        public int getGio() {
            return gio;
        }

        public int getPhut() {
            return phut;
        }

        public int getGiay() {
            return giay;
        }

        public ThoiGian(int gio, int phut, int giay) {
            this.gio = gio;
            this.phut = phut;
            this.giay = giay;
        }

        @Override
        public String toString() {
            return gio + " " + phut + " " + giay;
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<ThoiGian> arr = new ArrayList<>();
        
        int n = sc.nextInt();
        for(int i = 0; i < n; ++i){
            int g = sc.nextInt();
            int p = sc.nextInt();
            int d = sc.nextInt();
            ThoiGian tmp = new ThoiGian(g, p, d);
            arr.add(tmp);
        }
        
        Collections.sort(arr, new Comparator<ThoiGian>(){
            @Override
            public int compare(ThoiGian o1, ThoiGian o2) {
                if(o1.getGio() == o2.getGio()){
                    if(o1.getPhut() == o2.getPhut()){
                        return o1.getGiay() - o2.getGiay();
                    }
                    else return o1.getPhut() - o2.getPhut();
                }
                return o1.getGio() - o2.getGio();
            }
        });
        
        for(ThoiGian it : arr){
            System.out.println(it);
        }
    }
}
