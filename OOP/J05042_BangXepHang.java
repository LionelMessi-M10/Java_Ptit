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
2
Nguyen Van Nam
168 600
Tran Thi Ngoc
168 600
 * @author ADMIN
 */
public class J05042_BangXepHang {
    static class xepHang{
        private String ten;
        private int baiDung, baiNop;

        public String getTen() {
            return ten;
        }

        public int getBaiDung() {
            return baiDung;
        }

        public int getBaiNop() {
            return baiNop;
        }

        public xepHang(String ten, int baiDung, int baiNop) {
            this.ten = ten;
            this.baiDung = baiDung;
            this.baiNop = baiNop;
        }

        @Override
        public String toString() {
            return ten + " " + baiDung + " " + baiNop;
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        ArrayList<xepHang> arr = new ArrayList<>();
        
        int n = sc.nextInt();
        for(int i = 1; i <= n; ++i){
            sc.nextLine();
            String t = sc.nextLine();
            int dung = sc.nextInt();
            int nop = sc.nextInt();
            
            xepHang tmp = new xepHang(t, dung, nop);
            arr.add(tmp);
        }
        
        Collections.sort(arr, new Comparator<xepHang>(){
            @Override
            public int compare(xepHang o1, xepHang o2) {
                if(o1.getBaiDung() == o2.getBaiDung()){
                    if(o1.getBaiNop() == o2.getBaiNop()){
                        return o1.getTen().compareTo(o2.getTen());
                    }
                    else return o1.getBaiNop() - o2.getBaiNop();
                }
                return o2.getBaiDung() - o1.getBaiDung();
            }
        });
        
        for(xepHang it : arr){
            System.out.println(it);
        }
    }
}
